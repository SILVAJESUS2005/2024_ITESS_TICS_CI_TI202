/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular_JLS;

/**
 *
 * @author Jesus
 */
public class Cel {

    private String Marca;
    private String Modelo;
    private double Pulgadas;
    private double VersionSO;
    private double camaraT;
    private int Almacenamiento;

    public Cel() {
    }

    public Cel(String mar, String mod, double plg, double vSO, double camT, int alm) {
        this.Marca = mar;
        this.Modelo = mod;
        this.Pulgadas = plg;
        this.VersionSO = vSO;
        this.camaraT = camT;
        this.Almacenamiento = alm;
    }

    public void llamar(String contacto, String numeroTel) {
        System.out.println("Llamando a " + contacto + " . . . \n" + numeroTel);
    }

    public String mensaje(String contacto, String numeroTel, String mensaje) {

        return "Enviando a " + contacto + " . . . \n" + numeroTel + ", \n " + mensaje;

    }

        public String abrirApp (int idApp){
            if(idApp==1){
                return "Facebook";
            }else if (idApp==2){
                return "Teams";
            }else if (idApp==3){
                return "WhatsApp";
            }else{
                return "Aplicacion no instalada . . .";
            }
        }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(double Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    public double getVersionSO() {
        return VersionSO;
    }

    public void setVersionSO(double VersionSO) {
        this.VersionSO = VersionSO;
    }

    public double getCamaraT() {
        return camaraT;
    }

    public void setCamaraT(double camaraT) {
        this.camaraT = camaraT;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }
        
        
        
        @Override
        public String toString (){
            return "\033[31mCelular{"+"\n\033[31mMarca="+ Marca + ","
                    +"\n\033[31mModelo=" + Modelo + ", \n\033[31mPulgadas" + 
                    Pulgadas+ ", \n\033[31mVersionSO="+VersionSO+
                    ", \n\033[31mCamaraT="+camaraT+", \n\033[31mAlmacenamiento="+
                    Almacenamiento + '}';
        }
}
