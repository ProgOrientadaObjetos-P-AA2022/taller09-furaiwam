/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.InitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo  extends Prestamo {

    private String nivel;
    private InitucionEducativa c_educ;
    private double v_c;
    private double vM;

    public PrestamoEducativo(Persona b, int mes, String ciud, String niv,
                             InitucionEducativa c_ed, double v_C) {
        super(b, mes, ciud);
        nivel = niv;
        c_educ = c_ed;
        v_c = v_C;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toUpperCase();
    }

    public void establecerN_est(String n) {
        nivel = n;
    }

    public void establecerC_educ(InitucionEducativa n) {
        c_educ = n;
    }

    public void establecerValor(double n) {
        v_c = n;
    }

    public void calcularValorM() {
        vM = (v_c / tMeses) - (10 / 100 * (v_c / tMeses));
    }

    public String obtenerN_est() {
        return nivel;
    }

    public InitucionEducativa obtenerC_educ() {
        return c_educ;
    }

    public double obtenerValor() {
        return v_c;
    }

    public double obtenerValorM() {
        return vM;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%s\n"
                        + "Nivel de estudio: %s\n"
                        + "Centro educativo: %s\n"
                        + "Garante: %s\n"
                        + "Valor de la carrera: %.2f\n"
                        + "Valor mensual de pago préstamo del valor de la carrera: %.2f\n",
                cadena,
                nivel,
                c_educ,
                v_c,
                vM);
        return cadena;
    }
}
