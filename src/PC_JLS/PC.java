
package PC_JLS;


public class PC {
  
 private String modelo;
 private String marca;
 private double peso;
 private String color;
 private int ram;
 
 public PC(){
     
 }

    public PC(String modelo, String marca, double peso, String color, int ram) {
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
        this.color = color;
        this.ram = ram;
    }
 
 
    public void procesar(String oficio, String propietario){
        System.out.println(propietario+" opto por comprarse una PC del modelo "+modelo+" ya que su oficio demandaba una buena PC el es "+oficio);
    }
    public void almacenar(String acciones){
        System.out.println("Debido al exigente rendimiento de la PC decide almacenar una copia de seguridad de sus "+acciones);   
    }
    public String operar(int idApp){
          if(idApp==1){
                return "PhotoShop";
            }else if (idApp==2){
                return "Filmora";
            }else if (idApp==3){
                return "CapCup";
            }else{
                return "Aplicacion no instalada . . .";
            }
        
    }
        @Override
    public String toString() {
        return "\033[31mPC {" + "\n\033[31mModelo=" + modelo + ","
                + "\n\033[31mMarca=" + marca + ", \n\033[31mPeso="
                + peso + ", \n\033[31mColor=" + color
                + ", \n\033[31mMemoria Ram=" + ram + '}';
    }
}
