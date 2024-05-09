
package INE_JLS;


public class MainClass {
    public static void main(String[] args) {
        
        INE i1 =new INE();
        
        i1.setNombre("JESUS");
        i1.setApellido("LOPEZ SILVA");
        i1.setNumero("4661087122");
        i1.setDireccion("CRISTOBAL COLON #26");
        i1.setEdad(19);
        System.out.println(i1.toString());
        i1.imprimirNombreCompleto();
        i1.actualizarDireccion("Privada 10 de Mayo");
        i1.verificarMayorEdad();
    }
}
