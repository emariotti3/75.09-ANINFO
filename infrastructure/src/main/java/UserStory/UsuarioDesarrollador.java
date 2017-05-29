package UserStory;

import java.util.Map;

public class UsuarioDesarrollador extends Usuario{

    private Map<String,Tarea> tareas;

    public UsuarioDesarrollador(String usuario, String contrasenia) {
        super(usuario, contrasenia);
    }

    public void agregarTareas(Tarea t){
        String aux = t.nombreTarea();
        tareas.put(aux,t);
    }

    public Map<String,Tarea> obtenerTareas(){
        return tareas;
    }
}