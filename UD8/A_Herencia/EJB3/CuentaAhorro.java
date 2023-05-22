package UD8.A_Herencia.EJB3;

public class CuentaAhorro extends CuentaCorriente {

    static final int MAX_OPERACIONES = 3;
    private int contadorOperaciones = 0;

    public CuentaAhorro(String titular, double saldo) throws Exception {
        super(titular, saldo);
        //comisionOperacion;
        comisionMensual = 0.0;
        interesesMensual = 10.0;
    }

    public boolean ingresar(double dinero) {
        if (contadorOperaciones < MAX_OPERACIONES && super.ingresar(dinero)){
            contadorOperaciones++;
            return true;
        }
        else
            return false;
    }

    public boolean retirar(double dinero) {
        if (contadorOperaciones < MAX_OPERACIONES && super.retirar(dinero)){
            contadorOperaciones++;
            return true;
        }
        else
            return false;
    }
    
    public void actualizarMensualidad() throws Exception {
        contadorOperaciones = 0;
        super.actualizarMensualidad();
    }


}
