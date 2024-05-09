
package Videojuegos_JLS;


public class Videojuegos {
    private String genero;
    private String nombre;
    private int nivel;
    private String Nousuario;
    private String rango;

    public Videojuegos(String genero, String nombre, int nivel, String Nousuario, String rango) {
        this.genero = genero;
        this.nombre = nombre;
        this.nivel = nivel;
        this.Nousuario = Nousuario;
        this.rango = rango;
    }

   public Videojuegos(){
       
   }

    
    public void iniciar(String nombre, int nivel){
        System.out.println("Cargando . . ."+nombre+" Usuario: "+Nousuario+" Nivel: "+nivel);
    }
    public void terminar(String Nousuario, String rango){
        System.out.println("El usuario "+Nousuario+" ah terminado la partida en el rango: "+rango);
    }
    public void jugar(String Nousuario){
        System.out.println("El usuario "+Nousuario+" se encuentra en partida");
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNousuario() {
        return Nousuario;
    }

    public void setNousuario(String Nousuario) {
        this.Nousuario = Nousuario;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
            @Override
    public String toString() {
        return "\033[31mVideojuego{" + "\n\033[31mGenero=" + genero + ","
                + "\n\033[31mNombre=" + nombre + ", \n\033[31mNivel="
                + nivel + ", \n\033[31mNombre de usuario=" + Nousuario
                + ", \n\033[31mRango del jugador=" + rango + '}';
    }

}
