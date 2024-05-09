
package INE_JLS;


public class INE {
    private String nombre;
    private String apellido;
    private String numero;
    private String direccion;
    private int edad;

    public INE(String nombre, String apellido, String numero, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.direccion = direccion;
        this.edad = edad;
    }

    public INE() {

    }

    public void imprimirNombreCompleto() {
        System.out.println("Nombre: " + nombre + " " + apellido);
    }

    public void verificarMayorEdad() {
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }

    public void actualizarDireccion(String nuevaDireccion) {
        direccion = nuevaDireccion;
        System.out.println("La direccion en el INE ha sido actualizada a: " + nuevaDireccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\033[31mINE{" + "\n\033[31mNombre=" + nombre + ","
                + "\n\033[31mApellido=" + apellido + ", \n\033[31mNumero="
                + numero + ", \n\033[31mDireccion=" + direccion
                + ", \n\033[31mEdad=" + edad + '}';
    }
}