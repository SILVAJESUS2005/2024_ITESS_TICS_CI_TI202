/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Jesus
 */
public class Main {
    public static void main(String[] args) {
        
    
    INE persona1 = new INE();
    
    persona1.setNombre("Jesus");
    persona1.setCURP("JESUSLOPEZCURP");
    persona1.setApellido("Lopez Silva");
    persona1.Datos();
    persona1.MostrarDatos();
    
        System.out.println(persona1.toString());
        
    INE persona2 = new INE("Daniel", "Salas", "DANIELSALASCURP",18, "MORELOS #31");
    System.out.println(persona2.toString());
   
    }
   
}
