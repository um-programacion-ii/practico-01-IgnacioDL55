package Service;

import Entity.Chef;
import Entity.Despensa;
import Entity.Ingrediente;
import Entity.Receta;

import java.util.List;

public class CocinaService {
    public static void preparacion(Chef chef, Receta receta, List<Ingrediente> despensa){
        boolean hayIngredientes = true;
        for (Ingrediente ingredienteReceta : receta.getIngredientes()){
            boolean encontrado = true;
            for (Ingrediente ingredienteDespensa : despensa){
                if (ingredienteReceta.getNombre().equalsIgnoreCase(ingredienteDespensa.getNombre())
                        && ingredienteDespensa.getCantidad() >= ingredienteReceta.getCantidad()){
                encontrado = true;
                ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
                break;
                }
            }
            if (!encontrado) {
                System.out.println("No tenes " + ingredienteReceta.getNombre() +
                        " en la despensa. Te faltan " + (ingredienteReceta.getCantidad()) + " unidad/es.");
                hayIngredientes = false;
                break;
            }
        }
        if (hayIngredientes) {
            System.out.println("La receta esta lista.");
            System.out.println("Ingredientes restantes en la despensa:");
            for (Ingrediente ingrediente : despensa) {
                System.out.println("- " + ingrediente);
            }
        } else {
            System.out.println("No se pudo preparar la receta debido a ingredientes insuficientes.");
        }

    }
}
