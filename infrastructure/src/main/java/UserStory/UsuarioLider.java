package UserStory;

import java.util.Map;

public class UsuarioLider extends Usuario {

    private Map<String,Proyecto> proyectos;
    private Map<String,Tarea> tareas;

    public UsuarioLider(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    public void crearTarea(Proyecto proyecto, String nombre, String objetivo){
        Tarea nuevatarea = new Tarea(nombre,objetivo);
        tareas.put(nombre,nuevatarea);
        proyecto.agregarTarea(nuevatarea);
    }

    public void agregarUsuariosTarea (UsuarioDesarrollador usuario, String tarea){
        if (tareas.containsKey(tarea)) {
            tareas.get(tarea).agregarEncargado(usuario);
        }
    }

    public void agregarProyecto(Proyecto proyecto){
        String aux = proyecto.obtenerNombreProyecto();
        proyectos.put(aux,proyecto);
    }
}
