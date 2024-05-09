
package Casa_JLS;

public class MainClass {
    
    public static void main(String[] args) {
        
        Casa c1 = new Casa("20x20 metros", 2, "Azul rey", "Cemento y ladrillo","Marmol");
        System.err.println(c1.toString());
        c1.vivienda("Jesus Lopez Silva");
        c1.refugio("CJNG");
        c1.almacenar("JESUS LOPEZ SILVA","Botellas");
        
    }
}
