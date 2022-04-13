import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {

    @Test
    public void HayVasos()
    {
        Vaso vasosPequenos = new Vaso(2,10);
        boolean resultado = vasosPequenos.Vasos(1);
        assertTrue(resultado);
    }

    @Test
    public void NoHayVasos()
    {
        Vaso vasosPequenos = new Vaso(1,10);
        boolean resultado = vasosPequenos.Vasos(2);
        assertFalse(resultado);
    }

    @Test
    public void RestarVasos()
    {
        Vaso vasosPequenos = new Vaso(5,10);
        vasosPequenos.darVaso(1);
        assertEquals(4,vasosPequenos.getCantidadVaso());
    }
}
