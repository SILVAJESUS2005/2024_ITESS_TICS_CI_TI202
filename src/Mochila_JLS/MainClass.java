
package Mochila_JLS;


public class MainClass {
  
     public static void main(String[] args) {
        Mochila m1 = new Mochila("Grande", 3000, "ADIDAS", 2, "Azul");
        System.out.println(m1.toString());
        m1.transporte("Jesus","CASA","ITESS");
        m1.organizacion("6");
        m1.movilidad("25 LIBROS");
        
    }
}
