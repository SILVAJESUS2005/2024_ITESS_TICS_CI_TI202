
package Alumno_JLS;


public class ClassMain {

    public static void main(String[] args) {
        Alumno a1= new Alumno();
        
        a1.setMatricula(2023192110);
        a1.setPromedio(97);
        a1.setCmaterias(8);
        a1.setEscuela("ITESS");
        a1.setHorario(" 8 am a 2 pm");
         
        System.out.println(a1.toString());
        
        a1.aplicar("Aplicar a administrar las direcciones IP de una RED");
        a1.aprender("Aprendizaje en clase y en trabajos");
        a1.participar(2);
        
    }  
}
