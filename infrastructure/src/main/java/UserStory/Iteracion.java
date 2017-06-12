package UserStory;

import java.util.HashMap;
import java.util.Map;

public class Iteracion {

    private Map<String,Tarea> tareas;
    private boolean comenzado;
    private boolean finalizado;
    private int iteracion;

    public Iteracion(int iteracion){
        this.comenzado = false;
        this.finalizado = false;
        this.iteracion = iteracion;
        this.tareas = new HashMap<String,Tarea>();
    }

    public void activarIteracion(){
        this.comenzado = true;
    }

    public int obtenerIteracion(){
        return this.iteracion;
    }

    public void agregarTarea(Tarea t){
        String id = t.idTarea();
        this.tareas.put(id,t);
    }

    public Tarea obtenerTarea(String id) {
        return this.tareas.get(id);
    }

    public Map<String,Tarea> obtenerTareas(){
        return tareas;
    }

    public Map<String,Tarea> obtenerTareasFinalizadas() {

        Map<String,Tarea> aux = new HashMap<String,Tarea>();
        String nombreTarea;
        Tarea tarea;
        for (Map.Entry<String,Tarea> auxtarea: tareas.entrySet()){
            nombreTarea = auxtarea.getKey();
            tarea = auxtarea.getValue();
            if (tarea.estaTerminada())
                aux.put(nombreTarea,tarea);
        }

        return aux;
    }

    public boolean estaFinalizado(){
        return this.finalizado;
    }

    public boolean estaActiva() {
        return this.comenzado;
    }

    public void finalizar(){
        boolean aux = true;
        if (this.comenzado){
            for (Map.Entry<String,Tarea> tarea: tareas.entrySet()){
                if (!tarea.getValue().estaTerminada())
                    aux = false;
            }

            if (aux)
                this.finalizado = true;
        } else {
            throw new IteracionNoFinalizableException();
        }
    }
}
