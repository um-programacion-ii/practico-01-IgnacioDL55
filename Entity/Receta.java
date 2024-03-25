package Entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Receta {
    private int tiempoCoccion;
    private String preparacion;
    private List<Ingrediente> ingredientes = new ArrayList<>();

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
