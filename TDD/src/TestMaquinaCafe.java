import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaCafe {

    Cafetera cafetera;
    Vaso pequenos;
    Vaso medianos;
    Vaso grandes;
    Azucarero azucarero;
    MaquinaCafe maquinaCafe;

    @Before
    public void setUp()
    {
        cafetera = new Cafetera(50);
        pequenos = new Vaso(5,10);
        medianos = new Vaso(5,20);
        grandes = new Vaso(5,30);
        azucarero = new Azucarero(20);

        maquinaCafe = new MaquinaCafe();
        maquinaCafe.setCafetera(cafetera);
        maquinaCafe.setPequenos(pequenos);
        maquinaCafe.setMedianos(medianos);
        maquinaCafe.setGrandes(grandes);
        maquinaCafe.setAzucarero(azucarero);
    }

    @Test
    public void VasoPequeno()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        assertEquals(maquinaCafe.pequenos,vaso);
    }

    @Test
    public void VasoMediano()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("mediano");
        assertEquals(maquinaCafe.medianos,vaso);
    }

    @Test
    public void VasoGrande()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("grande");
        assertEquals(maquinaCafe.grandes,vaso);
    }

    @Test
    public void NoVaso()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        String resultado = maquinaCafe.VasoConCafe(vaso,10,2);
        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void NoCafe(){
        cafetera = new Cafetera(5);
        maquinaCafe.setCafetera(cafetera);
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        String resultado = maquinaCafe.VasoConCafe(vaso,1,2);
        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void NoAzucar()
    {
        azucarero = new Azucarero(2);
        maquinaCafe.setAzucarero(azucarero);
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        String resultado = maquinaCafe.VasoConCafe(vaso,1,3);
        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void restarCafe()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        maquinaCafe.VasoConCafe(vaso,1,3);
        int resultado = maquinaCafe.getCafetera().getCantidadDeCafe();
        assertEquals(40,resultado);
    }

    @Test
    public void restarVaso()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        maquinaCafe.VasoConCafe(vaso,1,3);
        int resultado = maquinaCafe.getPequenos().getCantidadVaso();
        assertEquals(4,resultado);
    }

    @Test
    public void restarAzucar(){
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        maquinaCafe.VasoConCafe(vaso, 1, 3);
        int resultado = maquinaCafe.getAzucarero().getCantidadAzucar();
        assertEquals(17, resultado);
    }

    @Test
    public void DevolverFelicitaciones()
    {
        Vaso vaso = maquinaCafe.TomarTamanoVaso("pequeno");
        String resultado = maquinaCafe.VasoConCafe(vaso,1,3);
        assertEquals("Felicitaciones",resultado);
    }
}
