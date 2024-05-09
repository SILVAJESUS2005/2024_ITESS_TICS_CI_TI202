/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 *
 * @author Jesus
 */
public class INE {
    
    private String Nombre;
    private String Apellido;
    private String CURP;
    private int Edad;
    private String Domicilio;
    
    
    public INE(String Nombre, String Apellido, String CURP, int Edad, String Domicilio){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CURP = CURP;
        this.Edad = Edad;
        this.Domicilio = Domicilio;
        
    }
    
   public INE(){
       
   }
   public void MostrarDatos(){
       System.out.println("El nombre es "+Nombre+" y su curp es: "+CURP);
   }
   
   public String Datos(){
       return "El nombre es " +Nombre; 
   }
   
   public String getNombre(){
       return Nombre;
   }
   public void setNombre(String Nombree){
       this.Nombre = Nombree;
   }
   public String getCURP(){
       return CURP;
   }
   public void setCURP(String CURP){
       this.CURP=CURP;
   }
   public String getApellido(){
       return Apellido;
   }
   public void setApellido(String Apellido){
       this.Apellido = Apellido;
   }
   @Override
   public String toString(){
       return "INE { "+"\n Nombre: "+Nombre+"\nApellido: "+Apellido+
               "\nCURP: "+CURP+"\nEdad: "+Edad+"\nDomicilio: "+Domicilio;
   }
   
}
