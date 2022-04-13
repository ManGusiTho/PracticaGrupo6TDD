import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAzucarero {
    Azucarero azucarero;

    @Before
    public void setUp()
    {
        azucarero = new Azucarero(10);
    }

    @Test
    public void HayAzucar(){
        boolean resultado = azucarero.Azucar(5);
        assertTrue(resultado);
        resultado = azucarero.Azucar(10);
        assertTrue(resultado);
    }

    @Test
    public void NoHayAzucar(){
        boolean resultado = azucarero.Azucar(15);
        assertFalse(resultado);
    }

    @Test
    public void RestarAzucar()
    {
        azucarero.darAzucar(5);
        assertEquals(5, azucarero.getCantidadAzucar());
        azucarero.darAzucar(2);
        assertEquals(3, azucarero.getCantidadAzucar());
    }
}
