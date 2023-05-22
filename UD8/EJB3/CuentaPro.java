package UD8.EJB3;

public class CuentaPro extends CuentaCorriente {

    public CuentaPro(String titular, double saldo) throws Exception {
        super(titular, saldo);
        comisionOperacion = 0.0;
        comisionMensual = 100.0;
        interesesMensual = 0.0;
    }
    
    

}
