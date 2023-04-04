public class PureBatata extends IngredienteDecorator{

    public PureBatata(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 3.0f; }
    public String getNome(){ return "Pure de Batata"; }
}
