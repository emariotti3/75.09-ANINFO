package UserStory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tarea {

    private String id;
    private int iteracion;
    private List<Usuario> desarrolladores;
    private String objetivo;
    private boolean activo;
    private boolean finalizado;
    private Set<String> proyectos;

    public Tarea(String id, String objetivo, int iteracion){
        this.id = id;
        this.objetivo = objetivo;
        this.iteracion = iteracion;
        this.activo = false;
        this.finalizado = false;
        this.desarrolladores = new ArrayList<Usuario>();
        proyectos = new HashSet<String>();
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

        if (activo)
            finalizado = true;
    }

    public void comenzar(){
        activo = true;
    }

    public void agregarProyecto(String id){
        proyectos.add(id);
    }

    public Set<String> obtenerProyectos() { return this.proyectos; }

    public boolean estaTerminada(){
        return this.finalizado;
    }

}
