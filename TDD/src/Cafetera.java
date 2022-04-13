public class Cafetera {

    private int CantidadDeCafe;

    public void setCantidadDeCafe(int cantidadDeCafe) {
        this.CantidadDeCafe = cantidadDeCafe;
    }
    public int getCantidadDeCafe() {
        return CantidadDeCafe;
    }

    public boolean Cafe(int cantidadCafe){
        return this.CantidadDeCafe >= cantidadCafe;
    }
    public void DarCafe(int cantidadCafe){
        this.CantidadDeCafe -= cantidadCafe;
    }

    public Cafetera(int cantidadCafe){
        this.setCantidadDeCafe(cantidadCafe);
    }
}
