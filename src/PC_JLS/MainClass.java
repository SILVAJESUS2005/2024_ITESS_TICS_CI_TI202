
package PC_JLS;


public class MainClass {
    public static void main(String[] args) {
        
        PC pc1 = new PC("Pavilion x360 Convertible", "HP", 1.56, "Dorado", 8);
        System.err.println(pc1.toString());
        pc1.procesar("EDITOR DE VIDEOS PARA YOUTUBE", "JESUS LOPEZ SILVA");
        pc1.almacenar("fotos y videos");
        System.out.println("Abriendo . . . " + pc1.operar(2));
        
        
    }
    
}
