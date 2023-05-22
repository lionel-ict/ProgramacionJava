package UD8.EJB3;

public class CuentaCorriente {
    
    // Atributos
    protected String titular;
    protected double saldo;
    protected double comisionOperacion; // cuanto se cobra por operación (€)
    protected double comisionMensual; // cuanto se cobra al mes (€)
    protected double interesesMensual; // cuanto renta al mes (%)

    // Constructor
    public CuentaCorriente(String titular, double saldo) throws Exception {
        this.titular = titular;
        setSaldo(saldo);
        comisionOperacion = 1.0;
        comisionMensual = 5;
        interesesMensual = 1;
    }

    // Setter del saldo. Solo acepta valores 0+, si no, lanza excepción
    public void setSaldo(double saldo) throws Exception {
        if (saldo < 0)
            throw new Exception("El nuevo saldo no puede ser " + saldo);
        this.saldo = saldo;
    }

    // Ingresa dinero (aumenta el saldo). Devuelve true si pudo hacerlo, false en caso contrario
    public boolean ingresar(double dinero) {
        if (dinero <= 0)
            return false;
        try {
            setSaldo(this.saldo + dinero - comisionOperacion);
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    // Ingresa dinero (aumenta el saldo). Devuelve true si pudo hacerlo, false en caso contrario
    public void ingresar2(double dinero) throws Exception {
        if (dinero <= 0)
            throw new Exception("No se puede ingresar negativo ni cero");
        setSaldo(this.saldo + dinero - comisionOperacion);
    }

    // Retira dinero (disminuye el saldo). Devuelve true si pudo hacerlo, false en caso contrario
    public boolean retirar(double dinero) {
        if (dinero <= 0)
            return false;
        try {
            setSaldo(this.saldo - dinero - comisionOperacion);
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    // Actualiza el saldo tras la mensualidad (suma intereses y resta comisión mensual)
    public void actualizarMensualidad() throws Exception {
        double nuevoSaldo = this.saldo + (this.saldo * interesesMensual / 100) - comisionMensual;
        setSaldo(nuevoSaldo);
    }

    // Método toString
    public String toString(){
        return "Cuenta de " + this.titular + " saldo: " + this.saldo;
    }

}