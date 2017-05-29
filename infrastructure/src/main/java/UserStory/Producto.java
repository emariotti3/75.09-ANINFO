package UserStory;

import java.util.Map;

public class Producto {

    private String id;
    private Map<String,Proyecto> proyectos;

    public Producto(String id){
        this.id = id;
    }

    public void agregarProyecto(Proyecto proyecto){
        String aux = proyecto.obtenerNombreProyecto();
        proyectos.put(aux,proyecto);
    }

    public Map<String,Proyecto> obtenerProyectos(){
        return proyectos;
    }
}
