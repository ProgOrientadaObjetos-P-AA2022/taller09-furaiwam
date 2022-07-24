/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tMeses;
    protected String ciudad;

    public Prestamo(Persona benef, int tM, String ciud) {
        beneficiario = benef;
        tMeses = tM;
        ciudad = ciud;
    }

    public void establecerBenef(Persona n) {
        beneficiario = n;
    }

    public void establecerT_meses(int n) {
        tMeses = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public Persona obtenerBenef() {
        return beneficiario;
    }

    public int obtenerT_meses() {
        return tMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s\n"
                        + "Tiempo de préstamo: %d\n"
                        + "Ciudad: %s\n",
                beneficiario,
                tMeses,
                ciudad);

        return cadena;
    }
}
