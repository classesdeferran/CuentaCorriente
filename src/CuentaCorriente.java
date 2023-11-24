public class CuentaCorriente {

    String nombreTitular;
    double saldo;
    String numCuenta;

    public CuentaCorriente (String nombreTitular, double saldo, String numCuenta ){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public void retirarFondos(double cantidad){
        saldo = saldo - cantidad;
    }

    public void ingresarFondos(double cantidad){
        saldo = saldo + cantidad;
    }

    @Override
    public String toString(){
        return STR."\{this.numCuenta} | \{this.nombreTitular} | \{this.saldo}";
    }


}
