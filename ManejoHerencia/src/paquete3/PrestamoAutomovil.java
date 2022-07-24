/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona gte1;
    private double valor;
    private double vM;

    public PrestamoAutomovil(Persona b, int mes, String ciud, String t,
                             String m, Persona g, double v) {
        super(b, mes, ciud);
        tipo = t;
        marca = m;
        gte1 = g;
        valor = v;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerGarante(Persona n) {
        gte1 = n;
    }

    public void establecerValor(double n) {
        valor = n;
    }

    public void calcularValorM() {
        vM = valor / tMeses;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return gte1;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorM() {
        return vM;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%s\n"
                        + "Tipo de automovil: %s\n"
                        + "Marca: %s\n"
                        + "Garante: %s\n"
                        + "Valor del automóvil: %.2f\n"
                        + "Valor mensual de pago préstamo automóvil: %.2f\n",
                cadena,
                tipo,
                marca,
                gte1,
                valor,
                vM);
        return cadena;
    }
}
