/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serie_JLS;

/**
 *
 * @author Jesus
 */
public class MainClass {
        public static void main(String[] args) {
        Serie serie1 = new Serie("Terror bajo el agua", "Terror", 1.56, "Dianna, Mike, Carmelo", 12);
        System.out.println(serie1.toString());
        serie1.iniciar("Terror bajo el agua", "2");
        serie1.pausar("1.56", "6");
        serie1.terminar("Terror bajo el agua","12");
        
    }
}
