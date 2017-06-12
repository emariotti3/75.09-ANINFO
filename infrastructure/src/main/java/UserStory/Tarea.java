package UserStory;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private String id;
    private int iteracion;
    private List<Usuario> desarrolladores;
    private String objetivo;
    private boolean activo;
    private boolean finalizado;
    private Proyecto proyecto;

    public Tarea(String id, String objetivo, int iteracion){
        this.id = id;
        this.objetivo = objetivo;
        this.iteracion = iteracion;
        this.activo = false;
        this.finalizado = false;
        this.desarrolladores = new ArrayList<Usuario>();
    }

    public String idTarea() {
        return this.id;
    }

    public int iteracionTarea(){
        return iteracion;
    }

    public String obtenerObjetivo() { return this.objetivo; }

    public void agregarDesarrollador(Usuario usuario){
        this.desarrolladores.add(usuario);
        usuario.agregarTareas(this);
    }

    public List<Usuario> obtenerDesarrolladores(){
        return this.desarrolladores;
    }

    public void finalizar(Usuario usuario){

        if (!this.desarrolladores.contains(usuario))
            throw new UsuarioIncorrectoException();
        else
            if (activo)
                finalizado = true;
    }

    public void comenzar(){
        if(this.proyecto.estaActivo() && !this.proyecto.estaFinalizado())
            activo = true;
        else
            throw new ProyectoException();
    }

    public void agregarProyecto(Proyecto p){
        this.proyecto = p;
    }

    public Proyecto obtenerProyecto() { return this.proyecto; }

    public boolean estaTerminada(){
        return this.finalizado;
    }

    public boolean estaActiva(){
        return this.activo;
    }

}
