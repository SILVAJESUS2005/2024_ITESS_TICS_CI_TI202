
package Libro_JLS;


public class Libro {
   
    private String color;
    private String tema;
    private double precio;
    private int paginas;
    private double peso;

    public Libro(String color, String tema, double precio, int paginas, double peso) {
        this.color = color;
        this.tema = tema;
        this.precio = precio;
        this.paginas = paginas;
        this.peso = peso;
    }
    
    public Libro(){
        
    }
    
    public void inspirar(String mensaje, String nombre){
        System.out.println("El libro "+nombre+" del tema "+tema+" nos da un mensaje inspiracional que dice "+mensaje);
        
    }
    public void educar(String grado){
        System.out.println("El libro del tema "+tema+" esta enfocado en el aprendizaje de la comunidad estudiantil de "+grado);
        
    }
    public void entretener(String actividad){
        System.out.println("La persona dejo de realizar la actividad: "+actividad+" para ponerse a leer el libro sobre "+tema+ " que le costo "+precio);
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
     @Override
    public String toString() {
        return "\033[31mLibro {" + "\n\033[31mColor=" + color + ","
                + "\n\033[31mTema=" + tema + ", \n\033[31mPrecio="
                + precio + ", \n\033[31mPagunas=" + paginas
                + ", \n\033[31mPeso en Kg del libro=" + peso + '}';
    }
}
