public class OvoCodorna extends IngredienteDecorator{

    public OvoCodorna(Ingrediente ingrediente){ super(ingrediente); }

    public float getPrecoAdicional(){ return 2.5f; }
    public String getNome(){ return "Ovo de Codorna"; }
}
