package Entity;

import java.util.Arrays;

public class EnsaladaDeZanahoria extends Receta{
    public EnsaladaDeZanahoria(){
        super(5, Arrays.asList(new Ingrediente("Zanahoria", 5),new Ingrediente("Aceite",15)),"Rayar las zanahorias, una vez terminado colocarlo en una ensaladera y agregarle 15ml de aceite");
    }
}
