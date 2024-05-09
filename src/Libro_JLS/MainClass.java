
package Libro_JLS;


public class MainClass {
    public static void main(String[] args) {
        
    
    Libro l1 = new Libro();
    
    l1.setTema("Educacion y aprendizaje");
    l1.setPaginas(243);
    l1.setPeso(235);
    l1.setColor("Rojo");
    l1.setPrecio(544);
    
        System.out.println(l1.toString());
    l1.inspirar(" El hacer constantemente ejercicios te facilitara tu progreso en este ambito ", " MATEMATICAS DE UNA FORMA SIMPLE ");
    l1.educar(" Universidad ");
    l1.entretener(" Jugar basquetbol ");
    
    }
}
