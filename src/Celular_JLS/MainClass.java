/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular_JLS;

/**
 *
 * @author Jesus
 */
public class MainClass {

    public static void main(String[] args) {
        Cel Cel1 = new Cel("Samsung", "S24", 7.1, 14.1, 108, 256);
        System.out.println(Cel1.toString());
        Cel1.llamar("Carmelo", "466-123-88-77");
        String SMS = Cel1.mensaje("Carmelo", "466-123-88-77", ">:");
        System.out.println(SMS);
        System.out.println("Abriendo . . . " + Cel1.abrirApp(2)+"\n");

//        Cel Cel2 = new Cel("iPhone", "11", 5.6, 17, 24, 64);
//        System.out.println(Cel2.toString());
//        Cel2.llamar("Miguel", "466-135-34-21");
//        String SMS2 = Cel2.mensaje("Miguel", "466-135-34-21", "Hola como estas? ");
//        System.out.println(SMS2);
//        System.out.println("Abriendo . . . " + Cel1.abrirApp(2));

    Cel cel2 = new Cel();
    System.out.println(cel2.toString());
    String SMS2 = "POCO S3";
    cel2.setMarca("Xiaomi");
    cel2.setAlmacenamiento(256 );
    cel2.setCamaraT(60);
    cel2.setModelo(SMS2);
    cel2.setPulgadas(7.1);
    cel2.setVersionSO(14);
    String SMS3 = cel2.mensaje("Miguel", "466-135-34-21", "Hola como estas? ");
    cel2.llamar(SMS3, SMS2);
    
   
    

    }
}
