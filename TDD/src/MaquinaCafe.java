import java.util.Objects;

public class MaquinaCafe {

    protected Cafetera cafetera;
    protected Vaso pequenos;
    protected Vaso medianos;
    protected Vaso grandes;
    protected Azucarero azucarero;

    public Vaso TomarTamanoVaso(String TipoVaso)
    {
        if(Objects.equals(TipoVaso, "pequeno"))
        {
            return pequenos;
        }
        else if(Objects.equals(TipoVaso, "mediano"))
        {
            return medianos;
        }
        else if(Objects.equals(TipoVaso, "grande"))
        {
            return grandes;
        }
        else
            return null;
    }

    public String VasoConCafe(Vaso vaso, int cantidadVaso, int cantidadAzucar){

        if(vaso.equals(this.pequenos) && this.pequenos.Vasos(cantidadVaso)){
            this.pequenos.darVaso(cantidadVaso);
        }
        else if(vaso.equals(this.medianos) && this.medianos.Vasos(cantidadVaso)){
            this.medianos.darVaso(cantidadVaso);
        }
        else if(vaso.equals(this.grandes) && this.grandes.Vasos(cantidadVaso)){
            this.grandes.darVaso(cantidadVaso);
        }
        else
            return "No hay Vasos";

        if(this.azucarero.Azucar(cantidadAzucar)){
            this.azucarero.darAzucar(cantidadAzucar);
        }
        else{
            return "No hay Azucar";
        }

        if(this.cafetera.Cafe(vaso.contenido())){
            this.cafetera.DarCafe(vaso.contenido());
        }
        else{
            return "No hay Cafe";
        }

        return "Felicitaciones";
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }
    public void setPequenos(Vaso pequenos) {
        this.pequenos = pequenos;
    }
    public void setMedianos(Vaso medianos) {
        this.medianos = medianos;
    }
    public void setGrandes(Vaso grandes) {
        this.grandes = grandes;
    }
    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }
    public Cafetera getCafetera() {
        return cafetera;
    }
    public Vaso getPequenos() {
        return pequenos;
    }
    public Azucarero getAzucarero() {
        return azucarero;
    }

}
