package Entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Receta {
    private int tiempoCoccion;
    private String preparacion;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Receta(int tiempoCoccion, List<Ingrediente> ingredientes, String preparacion) {
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    @Override
    public String toString() {
        return "Tiempo de cocción: " + tiempoCoccion + " minutos/Ingredientes: " + ingredientes + " y Preparación: " + preparacion;
    }
}
