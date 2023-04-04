public class BatataPalha extends IngredienteDecorator{
    public BatataPalha(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 1.5f; }
    public String getNome(){ return "Batata Palha"; }
}
