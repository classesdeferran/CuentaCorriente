import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CuentaCorriente cuentaDeJuan = new CuentaCorriente();

        cuentaDeJuan.nombreTitular = "Juan Pérez";
        cuentaDeJuan.numCuenta = "11111";
        cuentaDeJuan.saldo = 30_000;

        String infoJuan = STR."""
                \{cuentaDeJuan.nombreTitular},
                con cuenta \{cuentaDeJuan.numCuenta}
                tiene un saldo de \{cuentaDeJuan.saldo}
                """;
        System.out.println(infoJuan);

        // retirada de dinero
        System.out.println("\n¿Qué cantidad desea retirar?");
        double fondosRetirada = input.nextDouble();

        cuentaDeJuan.retirarFondos(fondosRetirada);

        infoJuan = STR."""
                \{cuentaDeJuan.nombreTitular},
                con cuenta \{cuentaDeJuan.numCuenta}
                tiene un saldo de \{cuentaDeJuan.saldo}
                """;
        System.out.println(infoJuan);

        // ingresar de dinero
        System.out.println("\n¿Qué cantidad desea ingresar?");
        double fondosIngreso = input.nextDouble();

        cuentaDeJuan.ingresarFondos(fondosIngreso);

       infoJuan = STR."""
                \{cuentaDeJuan.nombreTitular},
                con cuenta \{cuentaDeJuan.numCuenta}
                tiene un saldo de \{cuentaDeJuan.saldo}
                """;
       System.out.println(infoJuan);
    }



}