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

    public void agregarIteracion(Iteracion it){
        Integer numIt = it.obtenerIteracion();
        iteraciones.put(numIt,it);
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

    public void iniciarFase(){
        activo = true;
    }

    public void finalizarFase(){

        boolean aux = true;

        if (activo){
            for (Map.Entry<Integer,Iteracion> iteracion: this.iteraciones.entrySet()){
                if (!iteracion.getValue().estaFinalizado())
                    aux = false;
            }

            if (aux){
                this.finalizado = true;
                this.activo = false;
            }
        }

        throw new FaseNoFinalizableException();
    }
}
