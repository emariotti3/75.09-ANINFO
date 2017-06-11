package UserStory;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TareaTest {
    private Proyecto proyecto;
    private Usuario gerente;
    private List<Usuario> usuarios;
    private LocalDate fecha = LocalDate.now();


    @Dado("^que mi proyecto tiene \"(.*?)\" iteraciones,la iteracion \"(.*?)\" es la activa y tiene \"(.*?)\" tarea$")
    public void que_mi_proyecto(int cantIt,int itActiva, int cantTareas) throws Throwable {

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
        proyecto.agregarFase();
        proyecto.agregarIteracion(0);
        proyecto.agregarIteracion(1);

        user1.crearTarea(proyecto,0,"1","tarea");
        user1.crearTarea(proyecto,1,"2","tarea");

        proyecto.comenzar();
        proyecto.activarFase(0);
        proyecto.activarIteracion(0);
        user1.activarTarea("1");
        user1.finalizarTarea("1");
        proyecto.finalizarIteracion(0);
        proyecto.finalizarFase(0);

        proyecto.activarFase(1);
        proyecto.activarIteracion(1);
        user1.activarTarea("2");
        user1.finalizarTarea("2");
    }

    @Cuando("^agrego una tarea a la iteracion \"(.*?)\"$")
    public void cuando_agrego_una_tarea(Integer iteracion) throws Throwable {
        try{
            usuarios.get(0).crearTarea(proyecto,iteracion,"3","tarea");
        } catch(IteracionException ex){

        }
    }

    @Entonces("^la iteracion \"(.*?)\" ahora tiene \"(.*?)\" tareas$")
    public void la_iteracion_tiene(Integer it, Integer size) throws Throwable {
        Map<String,Tarea> tareas = proyecto.obtenerTareas(gerente,it);// gerente.obtenerTareas(proyecto,it);

        Integer tamanioTareas = tareas.size();
        assertEquals(size, tamanioTareas);
    }

    @Entonces("^la iteracion \"(.*?)\" sigue teniendo \"(.*?)\" tareas$")
    public void la_iteracion_sigue_teniendo(Integer it, Integer size) throws Throwable {
        Map<String,Tarea> tareas = proyecto.obtenerTareas(gerente,it);// gerente.obtenerTareas(proyecto,it);

        Integer tamanioTareas = tareas.size();
        assertEquals(size, tamanioTareas);
    }

    @Dado("^que el que usuario \"(.*?)\" posee la tarea \"(.*?)\"$")
    public void que_el_usuario_posee_tarea(Integer u, String t) throws Throwable {

        Usuario user1;

        proyecto = new Proyecto("Hola","PSA",1,fecha);
        gerente = new Usuario("Alan","123456","Gerente");
        usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario("Rinaldi","123456","Desarrollador"));
        usuarios.add(new Usuario("xxxx","123456","Desarrollador"));

        user1 = usuarios.get(u-1);

        proyecto.agregarLider(user1);

        user1.agregarProyecto(proyecto);
        user1.serLiderProyecto(proyecto.obtenerNombreProyecto());

        proyecto.agregarFase();
        proyecto.agregarIteracion(0);

        user1.crearTarea(proyecto,0,t,t);

        proyecto.comenzar();
        proyecto.activarFase(0);
        proyecto.activarIteracion(0);
        user1.activarTarea(t);
    }

    @Cuando("^el usuario \"(.*?)\" finaliza la tarea \"(.*?)\"$")
    public void cuando_agrego_una_tarea(Integer u,String t) throws Throwable {
        Usuario user = usuarios.get(u-1);
        try{
            user.finalizarTarea(t);
        } catch(TareaInexistenteException ex){

        }
    }

    @Entonces("^la tarea \"(.*?)\" esta finalizada$")
    public void la_tarea_esta_finalizada(String t) throws Throwable {
        Tarea tarea;
        try {
            tarea = proyecto.obtenerTarea(t);
            assertTrue(tarea.estaTerminada());
        }catch(TareaInexistenteException ex){}
    }

    @Entonces("^la tarea \"(.*?)\" no esta finalizada$")
    public void la_tarea_no_esta_finalizada(String t) throws Throwable {
        Tarea tarea;
        try {
            tarea = proyecto.obtenerTarea(t);
            assertFalse(tarea.estaTerminada());
        }catch(TareaInexistenteException ex){}
    }


}
