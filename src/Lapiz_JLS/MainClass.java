
package Lapiz_JLS;

public class MainClass {
    public static void main(String[] args) {Lapiz lapiz1 = new Lapiz("Negro", "Faber-Castell", 15.0, "HB", 10.5);
      
     Lapiz lapiz2 = new Lapiz();

        lapiz2.setColor("Azul");
        lapiz2.setMarca("BIC");
        lapiz2.setLongitud(14.5);
        lapiz2.setTipoPunta("2B");
        lapiz2.setPeso(8.2);
     System.out.println(lapiz2.toString());
       
     lapiz2.iniciar("BIC");
     lapiz2.terminar("BIC");
     lapiz2.borrar("BIC");
    }
  
}
