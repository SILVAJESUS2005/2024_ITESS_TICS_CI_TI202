/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* POO
* TI202 JLS
* 22 DE FEBRERO DEL 2024
* PROGRAMA QUE IMPRIME LOS DATOS DE UN ARREGLO FINITO, DE FORMA INVERTIDA.
* jesuslopezsilva206@gmail.com
 */
package practicas.poo;

import java.util.Arrays;

public class Arrays_invertidos {
    public static void main(String[] args) {
        int cont =0;

        int [] array2, array={1,2,3,4,5};
     array2 = new int [array.length];
        for(int i=array.length-1; i >= 0; i--){
            if (cont < (array.length)){
                array2[cont] = array[i];
                cont++;
            }
        }
         System.out.println(Arrays.toString(array));
         System.out.println(Arrays.toString(array2));
                
    }
         


   
}
