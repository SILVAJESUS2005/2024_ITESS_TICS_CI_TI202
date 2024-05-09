
package Lapiz_JLS;



public class Lapiz {
    private String color;
    private String marca;
    private double longitud;
    private String tipoPunta;
    private double peso;

    public Lapiz(String color, String marca, double longitud, String tipoPunta, double peso) {
        this.color = color;
        this.marca = marca;
        this.longitud = longitud;
        this.tipoPunta = tipoPunta;
        this.peso = peso;
    }

    public Lapiz() {

    }

    public void iniciar(String marca) {
        System.out.println("El lapiz de marca " + marca + " esta listo para ser utilizado.");
    }

    public void terminar(String marca) {
        System.out.println("El lapiz de marca " + marca + " ha sido guardado.");
    }
    
     public void borrar(String marca) {
        System.out.println("El lapiz de marca " + marca + " ha borrado el texto en el que se equivoco el escritor.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoPunta() {
        return tipoPunta;
    }

    public void setTipoPunta(String tipoPunta) {
        this.tipoPunta = tipoPunta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\033[31mLapiz{" + "\n\033[31mMarca=" + marca + ","
                + "\n\033[31mColor=" + color + ", \n\033[31mLongitud="
                + longitud + " cm, \n\033[31mTipo de punta=" + tipoPunta
                + ", \n\033[31mPeso en gramos del lapiz=" + peso + '}';
    }
}
