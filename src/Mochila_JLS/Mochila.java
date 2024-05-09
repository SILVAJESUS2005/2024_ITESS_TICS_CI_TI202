package Mochila_JLS;

public class Mochila {

    private String size;
    private double precio;
    private String marca;
    private double peso;
    private String color;

    public Mochila(String size, double precio, String marca, double peso, String color) {
        this.size = size;
        this.precio = precio;
        this.marca = marca;
        this.peso = peso;
        this.color = color;
    }

    public Mochila() {

    }

    public void transporte(String nombre, String lugar1, String lugar2) {
        System.out.println("La mochila de la marca " + marca + " se utilizo para transportar los utiles escolares de " + nombre + " desde su casa hasta la escuela");

    }

    public void organizacion(String espacios) {
        System.out.println("La mochila de la marca contiene un total de " + espacios + " para almacenar nuestros productos de uso personal");

    }

    public void movilidad(String objeto) {
        System.out.println("Se transporto " + objeto + "en una mochila de la marca " + marca + " gracias a la capacidad de esta la cual es: " + size);

    }

    @Override
    public String toString() {
        return "\033[31mMochila {" + "\n\033[31mCapacidad=" + size + ","
                + "\n\033[31mPrecio=" + precio + ", \n\033[31mMarca del producto="
                + marca + ", \n\033[31mPeso del articulo=" + peso
                + ", \n\033[31mColor del articulo=" + color + '}';
    }
}
