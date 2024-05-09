
package Videojuegos_JLS;


public class MainClass {
   
    public static void main(String[] args) {
    
    Videojuegos juego1 = new Videojuegos();
    
    juego1.setGenero("Terror, Accion");
    juego1.setNivel(61);
    juego1.setNombre("Free Fire");
    juego1.setNousuario("xChuy");
    juego1.setRango("Heroico");
   
    System.out.println(juego1.toString());
    
    juego1.iniciar("Free Fire", 33);
    juego1.terminar("xChuy", "Heroico");
    juego1.jugar("xChuy");
    }
}
