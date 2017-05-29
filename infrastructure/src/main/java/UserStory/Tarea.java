package UserStory;

import java.util.List;

public class Tarea {

    private String nombre;
    private List<UsuarioDesarrollador> encargados;
    private String objetivo;
    private boolean activo;
    private boolean finalizado;
    private List<String> proyectos;

    public Tarea(String nombre, String objetivo){
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.activo = false;
        this.finalizado = false;
    }

    public String nombreTarea() {
        return this.nombre;
    }

    public String obtenerObjetivo() { return this.objetivo; }

    public void agregarEncargado(UsuarioDesarrollador usuario){
        encargados.add(usuario);
    }

    public List<UsuarioDesarrollador> obtenerEncargados(){
        return encargados;
    }

    public void finalizar(){
        if (activo){
            finalizado = true;
        }
    }

    public void comenzar(){
        activo = true;
    }

    public void agregarProyecto(String nombre){
        proyectos.add(nombre);
    }

    public List<String> obtenerProyectos() { return this.proyectos; }

}
