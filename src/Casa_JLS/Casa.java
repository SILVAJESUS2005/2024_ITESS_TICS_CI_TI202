
package Casa_JLS;

public class Casa {
    private String size;
    private int niveles;
    private String color;
    private String material;
    private String acabado;
    
    public Casa(){
        
    }

    public Casa(String size, int niveles, String color, String material, String acabado) {
        this.size = size;
        this.niveles = niveles;
        this.color = color;
        this.material = material;
        this.acabado = acabado;
    }
    
    public void vivienda(String propietario){
        System.out.println("La casa es de "+propietario+" Y es de color "+color+" La cual tiene unas medidas de "+size);
        
    } 
   public void refugio(String grupo){
       System.out.println("Tras anunciar en las noticias las acciones delictivas del grupo "+grupo+" el propietario de la casa se refugio dentro de ella");
       
       
   } 
   
   public void almacenar(String npropietario, String producto){
       System.out.println(npropietario+" almacena "+producto+" en su casa, de tal manera que se ahorra un gasto de rentar una bodega, gracias a que su casa es del tamaño "+size);
   }

 @Override
    public String toString() {
        return "\033[31mCasa {" + "\n\033[31mDimensiones=" + size + ","
                + "\n\033[31mLa casa es de =" + niveles + ", Niveles \n\033[31mColor de la casa="
                + color + ", \n\033[31mLa casa esta construida con =" + material
                + ", \n\033[31mLa casa tiene un acabado de =" + acabado + '}';
    }
}
