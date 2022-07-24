/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
import paquete2.InitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
 /*
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        do {
            System.out.println("Préstamo de Automóvil   [1]");
            System.out.println("Préstamo Educativo      [2]");
            int opc = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el nombre del beneficiario:");
            String nom = entrada.nextLine();

            System.out.println("Ingrese el apellido del beneficiario:");
            String ap = entrada.nextLine();

            System.out.println("Ingrese el user del beneficiario:");
            String user = entrada.nextLine();

            System.out.println("Ingrese el tiempo del préstamo en meses:");
            int mes = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la ciudad del préstamo:");
            String ciudad = entrada.nextLine();

            Persona p = new Persona(nom, ap, user);
            Prestamo pr = new Prestamo(p, mes, ciudad);

            if (opc == 1) {

                System.out.println("Ingrese el tipo de automóvil:");
                String tipo = entrada.nextLine();
                System.out.println("Ingrese la marca de automóvil:");
                String marca = entrada.nextLine();
                System.out.println("Ingrese el nombre del garante:");
                String n = entrada.nextLine();
                System.out.println("Ingrese el apellido del garante");
                String a = entrada.nextLine();
                System.out.println("Ingrese el user del garante ");
                String us = entrada.nextLine();
                System.out.println("Ingrese el valor del automóvil:");
                double v = entrada.nextDouble();
                entrada.nextLine();

                Persona g = new Persona(n, a, us);
                PrestamoAutomovil pA = new PrestamoAutomovil(p, mes, ciudad,
                        tipo, marca, g, v);
                pA.calcularValorM();
                cadena = String.format("%s\n%s\n", cadena, pA);
            } else {
                if (opc == 2) {
                    System.out.println("Ingrese el nivel de estudio:");
                    String nv = entrada.nextLine();
                    System.out.println("Ingrese el nombre de la "
                            + "institución educativa:");
                    String no = entrada.nextLine();
                    System.out.println("Ingrese las siglas de la "
                            + "institución educativa");
                    String sig = entrada.nextLine();
                    System.out.println("Ingrese el valor de la carrera:");
                    double v = entrada.nextDouble();

                    InitucionEducativa iE = new InitucionEducativa (no, sig);
                    PrestamoEducativo pE = new PrestamoEducativo(p, mes, ciudad,
                            nv, iE, v);
                    cadena = String.format("%s\n%s\n", cadena, pE);
                }
            }
            System.out.println("¿Desea salir?");
            String op = entrada.nextLine();
            if (op != "No") {
                bandera = false;
            }
        } while (bandera);
        System.out.println(cadena);
    }
}