public class CuentaCorriente {

    String nombreTitular;
    double saldo;
    String numCuenta;

    public void retirarFondos(double cantidad){
        saldo = saldo - cantidad;
    }

    public void ingresarFondos(double cantidad){
        saldo = saldo + cantidad;
    }


}
