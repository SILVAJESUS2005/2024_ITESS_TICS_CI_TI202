
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



public class Coordinate {

private double xmin;
private double xmax;
private double ymin;
private double ymax;
private double width;
private double height;

    public Coordinate(double xmin, double xmax, double ymin, double ymax, double width, double height) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
        this.width = width;
        this.height = height;
        
    }

    public double getXmin() {
        return xmin;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public double getXmax() {
        return xmax;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public double getYmin() {
        return ymin;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }

    public double getYmax() {
        return ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

    public double toScreenX(double xr){
        return (xr-xmin)*width/(xmax-xmin);
    }
    public double toScreenY(double yr){
        return height-(yr-ymin)*height/(ymax-ymin);
    }


}
