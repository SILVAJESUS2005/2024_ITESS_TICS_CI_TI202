package CuentaBancaria_JLS;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipo;
    private String banco;
    private int nip; 

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, String tipo, String banco) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
        this.banco = banco;
        this.nip = nip; 
    }

//    CuentaBancaria(String juan_Perez, String string, double d, String ahorros, String hsbc) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            
        } 
    }

    public void pagar(double cantidad, String concepto) {
        if (cantidad <= saldo) {
            saldo -= cantidad;

        } 
    }

    public void consultarSaldo() {
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

    public int getNip() {
        return nip; 
    }

    @Override
    public String toString() {
        return "CuentaBancaria: "
                + "\nTitular='" + titular + '\''
                + ", \nNumero de Cuenta='" + numeroCuenta + '\''
                + ", \nSaldo=" + saldo
                + ", \nTipo='" + tipo + '\''
                + ", \nBanco='" + banco + '\''
                + '}';
    }

    public void transferir(CuentaBancaria cuentaDestino, double montoTransferir) {
        if (montoTransferir <= saldo) {
            saldo -= montoTransferir;
            cuentaDestino.depositar(montoTransferir);
        } 
    }
}
