public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 0.5f; }
    public String getNome(){ return "Ketchup"; }
}
