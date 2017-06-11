package UserStory;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ProyectoTest {

    private Proyecto proyecto;
    private Usuario gerente;
    private List<Usuario> usuarios;
    private LocalDate fecha = LocalDate.now();

    @Dado("^que mi proyecto tiene una iteracion y se finalizo la tarea \"(.*?)\"$")
    public void que_mi_proyecto_tiene(boolean finalizar) throws Throwable {

        Usuario user1;

        proyecto = new Proyecto("Hola","PSA",1,fecha);
        gerente = new Usuario("Alan","123456","Gerente");
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("Rinaldi","123456","Desarrollador"));

        user1 = usuarios.get(0);

        proyecto.agregarLider(user1);

        user1.agregarProyecto(proyecto);
        user1.serLiderProyecto(proyecto.obtenerNombreProyecto());

        proyecto.agregarFase();
        proyecto.agregarIteracion(0);

        user1.crearTarea(proyecto,0,"1","tarea");

        proyecto.comenzar();
        proyecto.activarFase(0);
        proyecto.activarIteracion(0);
        user1.activarTarea("1");
        if(finalizar){
            user1.finalizarTarea("1");
            proyecto.finalizarIteracion(0);
            proyecto.finalizarFase(0);
        }

    }

    @Cuando("^finalizo el proyecto$")
    public void cuando_finalizo_el_proyecto() throws Throwable {
        try{
            proyecto.finalizar();
        } catch(ProyectoNoFinalizableException ex){

        }
    }

    @Entonces("^el proyecto esta finalizado$")
    public void el_proyecto_esta_finalizado() throws Throwable {
        assertTrue(proyecto.estaFinalizado());
    }

    @Entonces("^el proyecto no esta finalizado$")
    public void el_proyecto_no_esta_finalizado() throws Throwable {
        assertFalse(proyecto.estaFinalizado());
    }

}
