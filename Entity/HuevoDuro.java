package Entity;

import java.util.ArrayList;
import java.util.Arrays;

public class HuevoDuro extends Receta {
    public HuevoDuro(){
        super(10, Arrays.asList(new Ingrediente("Huevo",1),new Ingrediente("Agua",250)),"Colocar el huevo en agua hirviendo por 10 minutos");

    }
}
