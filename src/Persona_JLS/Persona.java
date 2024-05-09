
package Persona_JLS;

public class Persona {
   
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, String apellido, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Persona(){
        
    }
    
    public void respirar (String pulso, String presion){
        System.out.println(nombre+" tiene un pulso de "+pulso+" y una presion arterial de "+presion);       
    }
    public void comer (String comida, int calorias ){
        System.out.println(nombre+" esta comiendo"+comida+" la cual contiene "+calorias+"calorias");      
}
    public void sanitario(String genero){
        System.out.println(nombre+" entro al sanitario de "+genero);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
                @Override
    public String toString() {
        return "\033[31mPersona{" + "\n\033[31mNombre=" + nombre + ","
                + "\n\033[31mApellido=" + apellido + ", \n\033[31mEdad="
                + edad + ", \n\033[31mPeso en Kg=" + peso
                + ", \n\033[31mAltura en Cm=" + altura + '}';
    }
}
