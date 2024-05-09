/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Jesus
 */
public class Persona {
private String nombre;
private String apellido;
private double peso;
private double altura;
private String sexo;

public Persona(String nombre, String apellido, double peso, double altura, String sexo){
    this.nombre = nombre;
    this.apellido = apellido;
    this.altura = altura;
    this.peso = peso;
    this.sexo = sexo;    
}
public Persona(){
    
}

public void Saludo(){
    System.out.println("Hola: "+nombre);
}

public void llamar(){
    System.out.println("Llamando a "+nombre+" Consulta tu WhatsApp");
}

public void frecuenciacardiaca(int frecuenciacardiaca){
    System.out.println("La frecuencia cardiaca de la persona es: "+frecuenciacardiaca+" Nombre: "+nombre);
    
}

public void setnombre(String nombre){
    this.nombre = nombre;
}
public String getnombre(){
    return nombre;
}
public void setapellido(String apellido){
    this.apellido = apellido;
}
public String getapellido(){
    return apellido;
}
public void setaltura(double altura){
    this.altura = altura;
}
public double getaltura(){
    return altura;
}
public void setpeso(double peso){
    this.peso = peso;
}
public double getpeso(){
    return peso;
}
public void setsexo(String sexo){
    this.sexo = sexo;
    
}
public String getsexo(){
    return sexo;
}

@Override
public String toString(){
    return "PERSONA {"+"\nNOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\n ALTURA: "+altura+"\nPESO: "+peso+"\nSEXO: "+sexo;
}


}
