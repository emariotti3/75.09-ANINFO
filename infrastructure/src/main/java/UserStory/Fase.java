package UserStory;

import java.util.HashMap;
import java.util.Map;

public class Fase {

    private int numeroFase;
    private Map<Integer,Iteracion> iteraciones;
    private boolean activo;
    private boolean finalizado;

    public Fase(int f){
        numeroFase = f;
        iteraciones = new HashMap<Integer, Iteracion>();
        activo = false;
        finalizado = false;
    }

    public int obtenerFase(){ return numeroFase;}

    public void activarFase(){
        if (!finalizado)
            activo = true;
        else
            throw new FaseNoInicializableException();
    }

    public void agregarIteracion(Iteracion it){
        Integer numIt = it.obtenerIteracion();
        iteraciones.put(numIt,it);
    }

    public void activarIteracion(Integer it){
        if(!this.activo)
            throw new IteracionNoInicializableException();

        if(iteraciones.containsKey(it-1))
            if(iteraciones.get(it-1).estaFinalizado())
                iteraciones.get(it).activarIteracion();
            else
                throw new IteracionNoInicializableException();
        else
            iteraciones.get(it).activarIteracion();
    }

    public Iteracion obtenerIteracion(Integer numIt){
        return iteraciones.get(numIt);
    }

    public void finalizarIteracion(Integer it){
        try{
            iteraciones.get(it).finalizar();
        } catch(IteracionNoFinalizableException ex){

        }
    }

    public void finalizarFase(){

        boolean aux = true;

        if (activo){
            for (Map.Entry<Integer,Iteracion> iteracion: this.iteraciones.entrySet()){
                if (!iteracion.getValue().estaFinalizado())
                    aux = false;
            }

            if (aux)
                this.finalizado = true;
        }

        throw new FaseNoFinalizableException();
    }

    public boolean estaFinalizado(){
        return this.finalizado;
    }
}
