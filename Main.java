import Entity.Despensa;
import Entity.Ingrediente;

public class Main {
    public static void main(String[] args){
        Ingrediente ingredientes = new Ingrediente("huevos", 10);
        Ingrediente zanahoria = new Ingrediente("zanahoria", 5);

        System.out.println(ingredientes);
        System.out.println(zanahoria);

        ingredientes.sacar(5);
        zanahoria.sacar(7);

        System.out.println(ingredientes);
        System.out.println(zanahoria);

        Despensa despensa1 = new Despensa();

        despensa1.addingrediente(ingredientes);
        despensa1.getIngrediente(ingredientes , 2);

        System.out.println(ingredientes);


    }
}
