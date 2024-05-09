
package Alumno_JLS;

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
        return "\033[31mAlumno {" + "\n\033[31mMatricula=" + matricula + ","
                + "\n\033[31mPromedio=" + promedio + ", \n\033[31mCantidad de materias="
                + cmaterias + ", \n\033[31mEscuela=" + escuela
                + ", \n\033[31mEl horario es=" + horario + '}';
    }
}
