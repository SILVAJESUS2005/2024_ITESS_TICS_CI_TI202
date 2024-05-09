package Serie_JLS;

public class Serie {

    private String nombre;
    private String genero;
    private double duracion;
    private String personajes;
    private int capitulos;

    public Serie() {

    }

    public Serie(String nombre, String genero, double duracion, String personajes, int capitulos) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.personajes = personajes;
        this.capitulos = capitulos;
    }

    public void iniciar(String nombre, String capitulo) {
        System.out.println("Cargando serie:  " + nombre + " . . .  Capitulo: " + capitulo);
    }

    public String pausar(String duracion, String capitulos) {
        String minuto = "36,23 min";
        System.out.println("Se pauso en el capitulo " + capitulos + " . . . en el minuto: " + minuto);
        return null;

    }
       public String terminar(String nombre, String capitulos) {

        System.out.println("TERMINASTE LA SERIE " + nombre + " . . . cantidad de capitulos vistos: " + capitulos);
        return null;

    }
    

    @Override
    public String toString() {
        return "\033[31mSerie{" + "\n\033[31mNombre=" + nombre + ","
                + "\n\033[31mGenero=" + genero + ", \n\033[31mDuracion="
                + duracion + ", \n\033[31mPersonajes principales=" + personajes
                + ", \n\033[31mCapitulos=" + capitulos + '}';
    }

}
