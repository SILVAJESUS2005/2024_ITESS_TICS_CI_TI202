/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo_JLS;

/**
 *
 * @author Jesus
 */
public class MainClass {
            public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(4, "Toyota", "Azul", 240, 2012);
        System.err.println(vehiculo1.toString());
        vehiculo1.avanza("Toyota","60");
        vehiculo1.frena("Toyota", "0");
        vehiculo1.pita("Toyota","Azul");
        
       Vehiculo vehiculo2 = new Vehiculo(4, "Hiunday", "Rojo", 300, 2023);
        System.out.println(vehiculo2.toString());
        vehiculo2.avanza("Hiunday","70");
        vehiculo2.frena("Hiunday", "0");
        vehiculo2.pita("Hiunday","Rojo");
        
}
}
