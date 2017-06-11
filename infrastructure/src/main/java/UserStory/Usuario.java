package UserStory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Usuario {

    private String usuario;
    private String contrasenia;

    private Map<String,Tarea> tareas;
    private Map<String,Proyecto> proyectos;
    private boolean lider;
    private Set<String> liderProyecto;
    private String puesto;

    public Usuario(String usuario, String contrasenia, String puesto){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.puesto = puesto;
        this.lider = false;
        this.tareas = new HashMap<String,Tarea>();
        this.proyectos = new HashMap<String,Proyecto>();
        this.liderProyecto = new HashSet<String>();
        this.liderProyecto.clear();
    }

    public String puestoActual(){
        return this.puesto;
    }

    public void cambiarPuesto(String nuevoPuesto){
        this.puesto = nuevoPuesto;
    }

    public void agregarTareas(Tarea t){
        String aux = t.idTarea();
        tareas.put(aux,t);
    }

    public void crearTarea(Proyecto proyecto, int iteracion, String id, String objetivo){
//        Tarea nuevatarea = new Tarea(id,objetivo,iteracion);
        try{
            proyecto.agregarTarea(iteracion, id, objetivo);
            proyecto.agregarUsuarioATarea(id,this);
//            nuevatarea.agregarDesarrollador(this);
//            proyecto.agregarTarea(nuevatarea,iteracion);
//            this.tareas.put(id,nuevatarea);
        } catch(IteracionException ex){}

    }

    public void agregarProyecto(Proyecto proyecto){
        String aux = proyecto.obtenerNombreProyecto();
        Proyecto proyectoAux = proyecto;
        proyectos.put(aux,proyectoAux);
    }

    public Map<String,Tarea> obtenerTareas(){
        return tareas;
    }

    public void serLiderProyecto(String proyecto){
        lider = true;
        liderProyecto.add(proyecto);
    }

    public boolean esLider(){
        return this.lider;
    }

    public Set<String> obtenerProyectosLiderados(){
        return this.liderProyecto;
    }

    public Map<String,Tarea> obtenerTareas(Proyecto proyecto, int iteracion){
        try {
            return proyecto.obtenerTareas(this,iteracion);
        } catch (UsuarioIncorrectoException ex) {
            return null;
        }
    }

    public void activarTarea(String id){
        if(!tareas.containsKey(id))
            throw new TareaInexistenteException();

        tareas.get(id).comenzar();
    }

    public void finalizarTarea(String t){

        if(!tareas.containsKey(t))
            throw new TareaInexistenteException();

        this.tareas.get(t).finalizar(this);
    }
}