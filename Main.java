import Entity.*;

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

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println("Receta para el huevo duro:");
        System.out.println(huevoDuro);

        EnsaladaDeZanahoria ensaladaDeZanahoria= new EnsaladaDeZanahoria();
        System.out.println("REceta para la ensalada de zanahoria:");
        System.out.println(ensaladaDeZanahoria);

        Tostada tostada = new Tostada();
        System.out.println("Receta para la tostada:");
        System.out.println(tostada);


    }
}
