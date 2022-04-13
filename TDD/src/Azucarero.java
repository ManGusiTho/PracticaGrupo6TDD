public class Azucarero {

    private int CantidadAzucar;

    public void setCantidadAzucar(int cantidadAzucar) {
        this.CantidadAzucar = cantidadAzucar;
    }
    public int getCantidadAzucar() {
        return CantidadAzucar;
    }

    public boolean Azucar(int cantidadAzucar){
        return this.CantidadAzucar >= cantidadAzucar;
    }
    public void darAzucar(int cantidadAzucar){
        this.CantidadAzucar -= cantidadAzucar;
    }

    public Azucarero(int cantidadAzucar){
        this.setCantidadAzucar(cantidadAzucar);
    }
}
