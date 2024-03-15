
/*
* ITESS-TICS-2024
* ENERO-JUNIO 2024
* CALCULO INTEGRAL
* TI202 JLS
* 15 DE MARZO DEL 2024
* Convertir un punto a una cordenada de pantalla.
* jesuslopezsilva206@gmail.com
 */
package tools;

public class CoordinateTest {

    public static void main(String... args) {
        //CENTER
        Coordinate coor = new Coordinate(-2, 2, -2, 2, 1080, 960);

        System.out.println("Test Center");
        System.out.println("xr: 0 --> xs: " + coor.toScreenX(0));
        System.out.println("yr: 0 --> ys: " + coor.toScreenY(0));

        //Left upper corner

        System.out.println("Test Left upper corner");
        System.out.println("xr: -2 --> xs: " + coor.toScreenX(-2));
        System.out.println("yr: 2 --> ys: " + coor.toScreenY(2));

        //Right  upper corner

        System.out.println("Test Left upper corner");
        System.out.println("xr: 2 --> xs: " + coor.toScreenX(2));
        System.out.println("yr: -2 --> ys: " + coor.toScreenY(-2));

    }

}
