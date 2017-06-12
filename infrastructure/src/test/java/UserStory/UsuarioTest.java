package UserStory;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {
    private Proyecto proyecto;
    private List<Usuario> usuarios;
    private LocalDate fecha = LocalDate.now();
    Map<String,Tarea> tareas;

    @Dado("^que mi proyecto tiene una iteracion con \"(.*?)\" tareas y las primeras \"(.*?)\" terminadas$")
    public void que_mi_proyecto_tiene_tareas(int cantTareas,int cantTerm) throws Throwable {

        Usuario user1,user2;

        proyecto = new Proyecto("Hola","PSA",1,fecha);
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("User0","123456","Gerente"));
        usuarios.add(new Usuario("User1","123456","Desarrollador"));
        usuarios.add(new Usuario("User2","123456","Desarrollador"));

        user1 = usuarios.get(1);
        user2 = usuarios.get(2);

        proyecto.agregarLider(user1);

        user1.agregarProyecto(proyecto);
        user1.serLiderProyecto(proyecto.obtenerNombreProyecto());

        user2.agregarProyecto(proyecto);

        proyecto.comenzar();

        proyecto.agregarFase();
        proyecto.activarFase(0);
        proyecto.agregarIteracion(0);
        proyecto.activarIteracion(0);

        for (int i = 0; i<cantTareas;i++) {
            user1.crearTarea(proyecto, 0, String.valueOf(i), "tarea");
            user1.activarTarea(String.valueOf(i));
        }

        for (int i = 0; i<cantTerm;i++) {
            user1.finalizarTarea(String.valueOf(i));
        }
    }

    @Cuando("^el usuario \"(.*?)\" pide las tareas de ese proyecto$")
    public void cuando_usuario_pide_tareas(int usuario) throws Throwable {
        Usuario user = usuarios.get(usuario);
        tareas = user.obtenerTareas(proyecto,0);
    }

    @Cuando("^el usuario \"(.*?)\" pide las tareas terminadas de ese proyecto$")
    public void cuando_usuario_pide_tareas_terminadas(int usuario) throws Throwable {
        Usuario user = usuarios.get(usuario);
        tareas = user.obtenerTareasCompletadas(proyecto,0);
    }

    @Entonces("^obtengo un listado con \"(.*?)\" tareas$")
    public void obtengo_listado(Integer it) throws Throwable {

        Integer size = tareas.size();

        assertEquals(size, it);
    }

    @Entonces("^obtengo un listado null$")
    public void obtengo_listado_null() throws Throwable {

        assertEquals(tareas, null);
    }
}
