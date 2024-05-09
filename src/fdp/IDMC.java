/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fdp;
/**
 * PRACTICA 5: INDICE DE MASA CORPORAL
 * @author JESUS lÓPEZ SILVA
 * DESCRIPCIÓN: ESTE PROGRAMA TE REALIZA Y TE DA TU IMC DE ACUERDO A DATOS PROPORCIONADOS POR EL USUARIO
 * DICHOS DATOS ARROJAN EL IMC DE LA PERSONA Y LE DAN UNA PEQUEÑA DESCRIPCIÓN, EN QUE ESTADO SE ENCUENTRA.
 */
public class IDMC {
    public static void main(String args[]){
          int peso = 57;
          double altura = 1.74;
          double IMC = peso/(altura*altura);
        System.out.println("La persona tiene una masa = "+peso+" kilogramos y estatura = "+altura+" metros");
    if (IMC<16){
        System.out.println("La persona tiene delgadez severa.");
    }else if (IMC<17){
        System.out.println("La persona tiene delgadez moderada");
    }else if (IMC<18.5){
        System.out.println("La persona tiene delgadez leve");
    }else if(IMC<25){
        System.out.println("La persona tiene peso normal");
    }else if(IMC<30){
        System.out.println("La persona tiene sobrepeso");
    }else if(IMC<35){
        System.out.println("La persona tiene obesidad leve");
    }else if(IMC<40){
        System.out.println("La persona tiene obesidad media");
    }else{
        System.out.println("La persona tiene obesidad mórbida");
    }
    } 
}
 