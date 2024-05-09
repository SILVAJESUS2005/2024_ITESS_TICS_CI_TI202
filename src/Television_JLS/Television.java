
package Television_JLS;

public class Television {
    private String color;
    private String marca;
    private double resolucion;
    private String SO;
    private double peso;

    public Television(String color, String marca, double resolucion, String SO, double peso) {
        this.color = color;
        this.marca = marca;
        this.resolucion = resolucion;
        this.SO = SO;
        this.peso = peso;
    }
    
    public Television(){
        
    }
    
        public void iniciar(String marca, String resolucion) {
        System.out.println("La TV de la marca  " + marca + " ha empezado a mostrar contenido con una resolucion de: " + resolucion);
    }
        public void terminar(String marca, String color){
            System.out.println("La TV "+marca+" de color "+color+" Se esta apagando");
            
        }
        
        public void pausar(String marca, String resolucion){
            System.out.println("La TV"+marca+" se ha pausado la imagen con una resolucion de "+resolucion);
        }
        
         @Override
    public String toString() {
        return "Television{" + "\nMarca=" + marca + ","
                + "\nColor=" + color + ", \nResolucion="
                + resolucion + ", \n Sistema operativo=" + SO
                + ", \nPeso en Kg de la TV=" + peso + '}';
    }
}
