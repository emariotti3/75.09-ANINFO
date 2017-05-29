package UserStory;

//import java.util.Date;
import java.time.*;
import java.util.HashMap;
import java.util.Map;

public class Proyecto {

    private String nombreProyecto;
    private String clienteAsociado;
    private UsuarioLider encargado;
    private LocalDate fechaInicio, finalizacionEstimada, fechaFin;
    private boolean estaTerminado;
    private int prioridad;
    private boolean activo;
    private Map<String,Tarea> tareas;

    public Proyecto(String nombre, String cliente,int prioridad, LocalDate fecha){
        this.nombreProyecto = nombre;
        this.clienteAsociado = cliente;
        this.prioridad = prioridad;
        activo = false;
        estaTerminado = false;
        finalizacionEstimada = fecha;
        tareas = new HashMap<String,Tarea>();
    }

    public String obtenerNombreProyecto(){ return this.nombreProyecto; }

    public void agregarTarea(Tarea t){
        String nombre = t.nombreTarea();
        this.tareas.put(nombre,t);
    }

    public Tarea obtenerTarea(String nombre){
        return this.tareas.get(nombre);
    }

    public String obternerCliente(){
        return this.clienteAsociado;
    }

    public void agregarEncargado(UsuarioLider usuario){
        this.encargado = usuario;
        usuario.agregarProyecto(this);
    }

    public UsuarioLider obternerEncargado(){ return this.encargado; }

    public boolean estaFinalizado(){
        return this.estaTerminado;
    }

    public void finalizar(){
        if (this.activo) {
            this.estaTerminado = true;
            this.fechaFin = LocalDate.now();
        }
    }

    public void comenzar(){
        this.activo = true;
        fechaInicio = LocalDate.now();
    }

    public void suspender(){
        this.activo = false;
    }

    public int obtenerPrioridad(){
        return this.prioridad;
    }
}
