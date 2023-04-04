public class QueijoRalado extends IngredienteDecorator{


    public QueijoRalado(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 2.5f; }
    public String getNome(){ return "Queijo Ralado"; }

}
