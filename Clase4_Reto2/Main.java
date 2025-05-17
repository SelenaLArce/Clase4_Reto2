package Clase4_Reto2;

public class Main {
    public static void main(String[] args) {

        // Impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("LOAS012345678", 7500.0);

        // Cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("LOAS012345678", 2300.0);

        // Información
        System.out.println ("Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                           " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Si el RFC es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println ("RFC válido para esta cuenta?: " + rfcValido);
    }
}
