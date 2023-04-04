public abstract class IngredienteDecorator implements Ingrediente {


    private Ingrediente ingrediente;

    public String listaIngredientes;

    public IngredienteDecorator(Ingrediente ingrediente){
        this.ingrediente = ingrediente;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getListaIngredientes(){
        return this.listaIngredientes;
    }


    public abstract String getNome();

    public abstract float getPrecoAdicional();

    public float getPreco(){
        return this.ingrediente.getPreco() + this.getPrecoAdicional();
    }

    public String getIngredientes(){ return this.ingrediente.getIngredientes() + ", " + this.getNome(); }

}
