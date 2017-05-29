package UserStory;

import java.util.Date;

/**
 * Created by alan on 28/05/17.
 */
public class Proyecto {

    String nombreProyecto;
    Usuario clienteAsociado;
    UsuarioEmpresa encargado;
    Date fechaInicio, finalizacionEstimada;
    boolean estaTerminado;
    int prioridad;
    boolean activo;

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

    public Tarea obtenerTarea(String nombre){

    }

    public Usuario obternerCliente(){
        return clienteAsociado;
    }


}
