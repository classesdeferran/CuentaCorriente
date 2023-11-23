import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       String menu = STR."""
               Banco X
               =======
               
               Operaciones disponibles:
               1 - Información de la cuenta
               2 - Retirada de fondos
               3 - Ingresar dinero a la cuenta
               
               Cualquier otra tecla para finalizar
               
               """;

       short eleccion;
       do {
           System.out.println(menu);
           eleccion = input.nextShort();

           switch (eleccion) {


           }

       } while (eleccion == 1 || eleccion == 2 || eleccion ==3 );

        CuentaCorriente cuentaDeJuan = new CuentaCorriente();



        cuentaDeJuan.nombreTitular = "Juan Pérez";
        cuentaDeJuan.numCuenta = "11111";
        cuentaDeJuan.saldo = 30_000;
        System.out.println(cuentaDeJuan);

/*
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


         */

    }



}