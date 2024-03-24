package Entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void addingrediente(Ingrediente newIngrediente){
        ingredientes.add(newIngrediente);
        System.out.println("Se agrego " + newIngrediente.getNombre() + " a la despensa");
    }

    public void getIngrediente(Ingrediente nombre , int cantidad ){
        for (Ingrediente ingrediente : ingredientes){
            if (ingrediente.getNombre().equals(nombre.getNombre()) && ingrediente != null){
                ingrediente.sacar(cantidad);
            }
        }

    }
}
