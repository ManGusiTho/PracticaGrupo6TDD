import static org.junit.Assert.*;
import org.junit.Test;


public class TestCafetera {

    @Test
    public void HayCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        boolean resultado = cafetera.Cafe(5);
        assertTrue(resultado);
    }

    @Test
    public void NoHayCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        boolean resultado = cafetera.Cafe(11);
        assertFalse(resultado);
    }

    @Test
    public void RestarCafe()
    {
        Cafetera cafetera = new Cafetera(10);
        cafetera.DarCafe(7);
        assertEquals(3,cafetera.getCantidadDeCafe());
    }
}
