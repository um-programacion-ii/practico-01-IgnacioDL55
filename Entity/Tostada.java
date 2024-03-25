package Entity;

import java.util.Arrays;

public class Tostada extends Receta{
    public Tostada(){
        super(3, Arrays.asList(new Ingrediente("Pan",1),new Ingrediente("Mermelada",1),new Ingrediente("Queso Crema",1)),
                "Tostar el pan,luego agregarle 1 cucharada de queso crema y por ultimo agregarle 1 cucharada de mermelada");
    }
}
