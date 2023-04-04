public class Mostarda extends IngredienteDecorator{


    public Mostarda(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 0.5f; }
    public String getNome(){ return "Mostarda"; }

}
