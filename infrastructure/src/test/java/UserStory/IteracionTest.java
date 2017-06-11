package UserStory;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IteracionTest {
    private Proyecto proyecto;
    private Usuario gerente;
    private List<Usuario> usuarios;
    private LocalDate fecha = LocalDate.now();


    @Dado("^que mi proyecto tiene \"(.*?)\" iteraciones y la numero \"(.*?)\" esta activa$")
    public void que_mi_proyecto_tiene_iteraciones(int cantIt,int itAct) throws Throwable {

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
        proyecto.activarFase(0);

        try{
            for (int i = 0; i<cantIt;i++) {
                proyecto.agregarIteracion(0);
                user1.crearTarea(proyecto, i, String.valueOf(i+1), "tarea");
            }
        } catch(FaseInexistenteException ex){
        }

        try{
            for (int i = 0; i<itAct;i++){
                proyecto.activarIteracion(i);
                user1.activarTarea(String.valueOf(i+1));
                user1.finalizarTarea(String.valueOf(i+1));
                proyecto.finalizarIteracion(i);
            }
        }catch(RuntimeException ex){

        }

        proyecto.activarIteracion(itAct);
        user1.activarTarea(String.valueOf(itAct+1));


    }

    @Cuando("^agrego una iteracion$")
    public void cuando_agrego_una_iteracion() throws Throwable {
        try{
            proyecto.agregarIteracion(0);
        } catch(FaseInexistenteException ex){
        }
    }

    @Entonces("^mi proyecto tiene \"(.*?)\" iteraciones$")
    public void mi_proyecto_tiene(Integer it) throws Throwable {
        Integer size = proyecto.obtenerCantidadIteraciones();
        assertEquals(size, it);
    }

    @Cuando("^finalizo la iteracion \"(.*?)\"$")
    public void cuando_finalizo_la_iteracion(Integer it) throws Throwable {
        try{
            usuarios.get(0).finalizarTarea(String.valueOf(it+1));
            proyecto.finalizarIteracion(it);
        } catch(IteracionNoFinalizableException ex){
        }
    }

    @Entonces("^la iteracion \"(.*?)\" esta finalizada$")
    public void la_iteracion_esta_finalizada(Integer it) throws Throwable {

        Iteracion iteracion;

        try{
            iteracion = proyecto.obtenerIteracion(it);
            assertTrue(iteracion.estaFinalizado());
        } catch(IteracionInexistenteException ex){}
    }

    @Cuando("^finalizo la iteracion \"(.*?)\" sin finalizar todas las tareas$")
    public void cuando_finalizo_la_iteracion_sin_finalizar_tareas(Integer it) throws Throwable {
        try{
            proyecto.finalizarIteracion(it);
        } catch(IteracionNoFinalizableException ex){
        }
    }

    @Entonces("^la iteracion \"(.*?)\" esta activa$")
    public void la_iteracion_esta_activa(Integer it) throws Throwable {

        Iteracion iteracion;

        try{
            iteracion = proyecto.obtenerIteracion(it);
            assertTrue(iteracion.estaActiva());
        } catch(IteracionInexistenteException ex){}
    }

    @Entonces("^la iteracion \"(.*?)\" no esta activa$")
    public void la_iteracion_no_esta_activa(Integer it) throws Throwable {

        Iteracion iteracion;

        try{
            iteracion = proyecto.obtenerIteracion(it);
            assertFalse(iteracion.estaActiva());
        } catch(IteracionInexistenteException ex){}
    }
}
