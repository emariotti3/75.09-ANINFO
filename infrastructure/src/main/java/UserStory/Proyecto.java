package UserStory;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Proyecto {

    private String nombreProyecto;
    private String clienteAsociado;
    private Usuario lider;
    private LocalDate fechaInicio, finalizacionEstimada, fechaFin;
    private boolean estaTerminado;
    private int prioridad;
    private boolean activo;
    private Map<Integer,Integer> correspondenciaItFase;
    private Map<Integer,Fase> fases;
    private Integer cantIteraciones;
    private Map<String,Integer> correspondenciaTareaIt;

    public Proyecto(String nombre, String cliente,int prioridad, LocalDate fecha){
        this.nombreProyecto = nombre;
        this.clienteAsociado = cliente;
        this.prioridad = prioridad;
        this.activo = false;
        this.estaTerminado = false;
        this.finalizacionEstimada = fecha;
        this.correspondenciaItFase = new HashMap<Integer,Integer>();
        this.fases = new HashMap<Integer,Fase>();
        this.correspondenciaTareaIt = new HashMap<String,Integer>();
        this.cantIteraciones = 0;
    }

    public String obtenerNombreProyecto(){ return this.nombreProyecto; }


    public String obternerCliente(){
        return this.clienteAsociado;
    }

    public void agregarLider(Usuario usuario){
        this.lider = usuario;
    }

    public Usuario obternerLider(){ return this.lider; }

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

    public void agregarFase(){
        Integer aux = fases.size();
        Fase f = new Fase(aux);
        this.fases.put(aux,f);
    }

    public void activarFase(Integer f){
        try{
            fases.get(f).activarFase();
        } catch(FaseException ex){}

    }

    public void finalizarFase(Integer f){
        if (!fases.containsKey(f))
            throw new FaseInexistenteException();

        try {
            fases.get(f).finalizarFase();
        } catch(FaseException ex){

        }
    }

    public void agregarIteracion(Integer fase){
        if (!fases.containsKey(fase))
            throw new FaseInexistenteException();

        Iteracion it = new Iteracion(this.cantIteraciones);
        fases.get(fase).agregarIteracion(it);
        correspondenciaItFase.put(cantIteraciones,fase);
        this.cantIteraciones++;
    }

    public void activarIteracion(Integer it){
        Integer numFase;
        Fase fase;

        if(!correspondenciaItFase.containsKey(it))
            throw new IteracionInexistenteException();

        numFase = correspondenciaItFase.get(it);
        fase = fases.get(numFase);

        try{
            fase.activarIteracion(it);
        } catch(IteracionNoInicializableException ex){

        }

    }

    public void finalizarIteracion(Integer it){

        Integer numFase;
        Fase fase;

        if(!correspondenciaItFase.containsKey(it))
            throw new IteracionInexistenteException();

        numFase = correspondenciaItFase.get(it);
        fase = fases.get(numFase);

        try{
            fase.finalizarIteracion(it);
        } catch(IteracionNoFinalizableException ex){

        }

    }

    public void agregarTarea(int it, String id, String obj){ //Tarea t, int it){

        Integer numFase;
        Fase fase;
        Iteracion iteracion;
        Tarea t;

        if (!correspondenciaItFase.containsKey(it))
            throw new IteracionInexistenteException();

        numFase = correspondenciaItFase.get(it);
        fase = fases.get(numFase);
        iteracion = fase.obtenerIteracion(it);

        if (iteracion.estaFinalizado())
            throw new IteracionFinalizadaException();

        t = new Tarea(id,obj,it);
        correspondenciaTareaIt.put(id,it);
        iteracion.agregarTarea(t);
    }

    public void agregarUsuarioATarea(String t, Usuario u){
        Integer numIt;
        Integer numFase;

        Fase fase;
        Iteracion it;

        if(!correspondenciaTareaIt.containsKey(t))
            throw new TareaInexistenteException();

        numIt = correspondenciaTareaIt.get(t);
        numFase = correspondenciaItFase.get(numIt);

        fase = fases.get(numFase);
        it = fase.obtenerIteracion(numIt);

        it.obtenerTarea(t).agregarDesarrollador(u);
    }

    public Tarea obtenerTarea(String id){

        Integer numFase, numIt;
        Fase fase;
        Iteracion iteracion;


        if(!correspondenciaTareaIt.containsKey(id)){
           throw new TareaInexistenteException();
        }

        numIt = correspondenciaTareaIt.get(id);

        numFase = correspondenciaItFase.get(numIt);
        fase = fases.get(numFase);
        iteracion = fase.obtenerIteracion(numIt);

        return iteracion.obtenerTarea(id);
    }


    public Map<String,Tarea> obtenerTareasCompletadas (Usuario usuario, int it){

        if (usuario.puestoActual() == "Gerente")
            throw new UsuarioIncorrectoException();

        Integer numFase;
        Fase fase;
        Iteracion iteracion;

        if (!correspondenciaItFase.containsKey(it))
            throw new IteracionInexistenteException();

        numFase = correspondenciaItFase.get(it);
        fase = fases.get(numFase);
        iteracion = fase.obtenerIteracion(it);

        return iteracion.obtenerTareasFinalizadas();
    }

    public Map<String,Tarea> obtenerTareas(Usuario usuario, int it){

        Integer numFase;
        Fase fase;
        Iteracion iteracion;

        if (usuario.puestoActual() != "Gerente")
            throw new UsuarioIncorrectoException();

        if (!correspondenciaItFase.containsKey(it))
            throw new IteracionInexistenteException();

        numFase = correspondenciaItFase.get(it);
        fase = fases.get(numFase);
        iteracion = fase.obtenerIteracion(it);

        return iteracion.obtenerTareas();
    }

}
