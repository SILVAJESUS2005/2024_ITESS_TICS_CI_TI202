/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Jesus
 */
public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        
        p1.setnombre("Jesus");
        p1.setapellido("Lopez");
        p1.setaltura(1.74);
        p1.setpeso(60);
        p1.setsexo("Masculino");
        
        p1.Saludo();
        p1.frecuenciacardiaca(90);
        
        System.out.println(p1.toString());
    }
}
