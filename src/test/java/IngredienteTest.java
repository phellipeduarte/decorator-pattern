import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredienteTest {

    @Test
    void deveRetornarPrecoSalsicha(){

        Ingrediente ingrediente = new Salsicha();
        assertEquals(3.5f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsicha(){

        Ingrediente ingrediente = new Salsicha();
        assertEquals("Salsicha", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarPrecoSalsichaKetchup(){

        Ingrediente ingrediente = new Ketchup(new Salsicha());
        assertEquals(4f, ingrediente.getPreco());
    }

    @Test
    void deveRetornarIngredientesSalsichaKetchup(){

        Ingrediente ingrediente = new Ketchup(new Salsicha());
        assertEquals("Salsicha, Ketchup", ingrediente.getIngredientes());
    }

    @Test
    void deveRetornarPrecoSalsichaKetchupMostarda(){

        Ingrediente ingrediente = new Mostarda(new Ketchup(new Salsicha()));
        assertEquals(4.5f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsichaKetchupMostarda(){

        Ingrediente ingrediente = new Mostarda(new Ketchup(new Salsicha()));
        assertEquals("Salsicha, Ketchup, Mostarda", ingrediente.getIngredientes());

    }

    @Test
    void deveRetornarPrecoSalsichaKetchupMostardaBatataPalha(){

        Ingrediente ingrediente = new BatataPalha(new Mostarda(new Ketchup(new Salsicha())));
        assertEquals(6f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsichaKetchupMostardaBatataPalha(){

        Ingrediente ingrediente = new BatataPalha(new Mostarda(new Ketchup(new Salsicha())));
        assertEquals("Salsicha, Ketchup, Mostarda, Batata Palha", ingrediente.getIngredientes());

    }

    @Test
    void deveRetornarPrecoSalsichaKetchupMostardaBatataPalhaOvoCodorna(){

        Ingrediente ingrediente = new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha()))));
        assertEquals(8.5f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsichaKetchupMostardaBatataPalhaOvoCodorna(){

        Ingrediente ingrediente = new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha()))));
        assertEquals("Salsicha, Ketchup, Mostarda, Batata Palha, Ovo de Codorna", ingrediente.getIngredientes());

    }

    @Test
    void deveRetornarPrecoSalsichaKetchupMostardaBatataPalhaOvoCodornaQueijoRalado(){

        Ingrediente ingrediente = new QueijoRalado(new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha())))));
        assertEquals(11f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsichaKetchupMostardaBatataPalhaOvoCodornaQueijoRalado(){

        Ingrediente ingrediente = new QueijoRalado(new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha())))));
        assertEquals("Salsicha, Ketchup, Mostarda, Batata Palha, Ovo de Codorna, Queijo Ralado", ingrediente.getIngredientes());

    }

    @Test
    void deveRetornarPrecoSalsichaKetchupMostardaBatataPalhaOvoCodornaQueijoRaladoPureBatata(){

        Ingrediente ingrediente = new PureBatata(new QueijoRalado(new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha()))))));
        assertEquals(14f, ingrediente.getPreco());

    }

    @Test
    void deveRetornarIngredientesSalsichaKetchupMostardaBatataPalhaOvoCodornaQueijoRaladoPureBatata(){

        Ingrediente ingrediente = new PureBatata(new QueijoRalado(new OvoCodorna(new BatataPalha(new Mostarda(new Ketchup(new Salsicha()))))));
        assertEquals("Salsicha, Ketchup, Mostarda, Batata Palha, Ovo de Codorna, Queijo Ralado, Pure de Batata", ingrediente.getIngredientes());

    }
}
