package UserStory;

import java.util.Date;

public class Proyecto {

    private String nombreProyecto;
    private Usuario clienteAsociado;
    private UsuarioEmpresa encargado;
    private Date fechaInicio, finalizacionEstimada;
    private boolean estaTerminado;
    private int prioridad;
    private boolean activo;

    public Proyecto(String nombre, Usuario usuario,int prioridad, Date fecha){
        this.nombreProyecto = nombre;
        this.clienteAsociado = usuario;
        this.prioridad = prioridad;
        activo = false;
        estaTerminado = false;
        finalizacionEstimada = fecha;
    }

    public void agregarTarea(Tarea t){

    }
//
//    public Tarea obtenerTarea(String nombre){
//        return
//    }

    public Usuario obternerCliente(){
        return clienteAsociado;
    }

    public void agregarEncargado(UsuarioEmpresa usuario){
        encargado = usuario;
    }

}
