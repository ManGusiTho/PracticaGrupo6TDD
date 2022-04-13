public class Vaso {

    private int cantidadVaso;
    private int Contenido;

    public int getCantidadVaso() {
        return cantidadVaso;
    }
    public int contenido() {
        return Contenido;
    }
    public void setCantidadVaso(int cantidadVaso) {
        this.cantidadVaso = cantidadVaso;
    }
    public void setContenido(int contenido) {
        this.Contenido = contenido;
    }
    public boolean Vasos(int cantidadvaso){
        return this.cantidadVaso >= cantidadvaso;
    }
    public void darVaso(int cantidadvaso){
        this.cantidadVaso -= cantidadvaso;
    }
    public Vaso(int cantidadvaso, int contenido) {
        this.setContenido(contenido);
        this.setCantidadVaso(cantidadvaso);
    }
}
