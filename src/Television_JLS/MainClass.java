
package Television_JLS;


public class MainClass {
            public static void main(String[] args) {
        Television tv = new Television("Negro", "Samsung", 1080, "Android", 12);
        System.err.println(tv.toString());
        tv.iniciar("Samsung", "1080");
        tv.pausar("Samsung", "1080");
        tv.terminar("Samsung","Negro");
        
}
}
