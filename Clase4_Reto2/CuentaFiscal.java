package Clase4_Reto2;

import java.util.Objects;

// Clase con encapsulación y validación
public class Cuenta 
{

    private final String rfc;
    private double saldo;

    // Validar el saldo
    public Cuenta (String rfc, double saldo) {
        this.rfc = rfc;
        if (saldo >= 0) 
        {
            this.saldo = saldo;
        } 
        else 
        {
            System.out.println ("El saldo no puede ser negativo. Se asigna el no. 0.");
            this.saldo = 0;
        }
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldo() {
        return saldo;
    }

    // Si el RFC coincide
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    // Mostrar información
    public void mostrarCuenta() {
        System.out.println ("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
