
package Practicas_ModeladoUML_JLS;


public class Objeto {
    public class Alumno {
  private int matricula;
private double promedio;
private int cmaterias;
private String escuela;
private String horario;

    public Alumno(int matricula, double promedio, int cmaterias, String escuela, String horario) {
        this.matricula = matricula;
        this.promedio = promedio;
        this.cmaterias = cmaterias;
        this.escuela = escuela;
        this.horario = horario;
    }

public Alumno(){
    
}

public void aprender(String conocimientos){
    System.out.println("El alumno con matricula "+matricula+" completo "+cmaterias+" materias, y gracias a esto obtuvo "+conocimientos);    
}

public void aplicar(String aplicar){
    System.out.println("El alumno con matricula "+matricula+" esta realizando sus practicas profesionales en las que aplico "+aplicar+" gracias al conocimiento adquirido en "+escuela);
      
} 

public void participar(int aumento){
    double promedio2=promedio+aumento;
    System.out.println("El alumno con matricula "+matricula+" cuenta con un promedio de "+promedio+" pero participo asi que su promedio subio "+aumento+" puntos, quedando en "+promedio2+" de promedio");
    
}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getCmaterias() {
        return cmaterias;
    }

    public void setCmaterias(int cmaterias) {
        this.cmaterias = cmaterias;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "\033[31m1. Alumno {" + "\n\033[31mMatricula=" + matricula + ","
                + "\n\033[31mPromedio=" + promedio + ", \n\033[31mCantidad de materias="
                + cmaterias + ", \n\033[31mEscuela=" + escuela
                + ", \n\033[31mEl horario es=" + horario + '}';
    }
}
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
        return "\033[31m2. Casa {" + "\n\033[31Dimensiones=" + size + ","
                + "\n\033[31mLa casa es de =" + niveles + ", Niveles \n\033[31mColor de la casa="
                + color + ", \n\033[31mLa casa esta construida con =" + material
                + ", \n\033[31mLa casa tiene un acabado de =" + acabado + '}';
    }
}
    public class CuentaBancaria {
    

    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipo; // Nuevo atributo: tipo de cuenta
    private String banco; // Nuevo atributo: nombre del banco

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, String tipo, String banco) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.banco = banco;
    }

    public CuentaBancaria() {

    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha depositado $" + cantidad + " en la cuenta.");
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta.");
        } else {
            System.out.println("Fondos insuficientes para realizar la operación.");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: $" + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "\033[31m3. CuentaBancaria{" +
                "\n\033[31mTitular='" + titular + '\'' +
                ", \n\033[31mNumero de Cuenta='" + numeroCuenta + '\'' +
                ", \n\033[31mSaldo=" + saldo +
                ", \n\033[31mTipo='" + tipo + '\'' +
                ", \n\033[31mBanco='" + banco + '\'' +
                '}';
    }
}
}
