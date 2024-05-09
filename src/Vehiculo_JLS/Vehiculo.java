package Vehiculo_JLS;

public class Vehiculo {

    private int llantas;
    private String marca;
    private String color;
    private int velocidad;
    private int año;

    public Vehiculo() {

    }

    public Vehiculo(int llantas, String marca, String color, int velocidad, int año) {
        this.llantas = llantas;
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.año = año;
    }

    public void avanza(String marca, String velocidad) {
        System.out.println("El vehiculo de la marca:  " + marca + " . . .  Acaba de iniciar su recorrido a una velocidad de: " + velocidad + " Km/hr");
    }

    public void frena(String marca, String velocidad) {
        System.out.println("El vehiculo de la marca:  " + marca + " . . .  Se ha detenido a " + velocidad + " Km/hr");
    }

    public void pita(String marca, String color) {
        System.out.println("El vehiculo de la marca:  " + marca + " . . .  y de color: " + color + " Ha producido un sonido");
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
        @Override
    public String toString() {
        return "\033[31mVehiculo{" + "\n\033[31mllantas=" + llantas + ","
                + "\n\033[31mmarca=" + marca + ", \n\033[31mvelocidad="
                + velocidad + ", \n\033[31mano=" + año
                + ", \n\033[31mColor=" + color + '}';
    }

}
