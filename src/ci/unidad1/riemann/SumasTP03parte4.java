
package ci.unidad1.riemann;

public class SumasTP03parte4 extends SumasRiemann {
    
    public SumasTP03parte4(double[] x, double[] w) {
        super(x, w);
    }
    @Override
    public double funcion (double x){
        return x*x;
    }
   
}
