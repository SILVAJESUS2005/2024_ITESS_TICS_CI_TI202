package Persona_JLS;

public class MainClass {

    public static void main(String[] args) {

        Persona p1 = new Persona();

        p1.setNombre("Genaro");
        p1.setApellido("Hernandez");
        p1.setEdad(18);
        p1.setPeso(65);
        p1.setAltura(175);
        System.out.println(p1.toString());

        p1.respirar("90", "120");
        p1.comer("pollo a la arrachera", 360);
        p1.sanitario("MASCULINO");

    }
}
