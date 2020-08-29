/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Descuentos {
    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);
        String genero = "";
        double calculo = 0;
        double salario = 0;
        System.out.println("Ingrese su genero");
        genero = descuento.nextLine();
        System.out.println("Ingrese su salario");
        salario = descuento.nextDouble();
        
        switch (genero) {
            case "F":
            case "Femenino":
            case "f":

                if (salario > 300) {
                    double nuevoSalario = (double) salario - (salario * 0.625);
                    System.out.println("Su salario es " + nuevoSalario);
                } else {
                    System.out.println("Su salario es " + salario);
                }
                break;
            case "M":
            case "Masculino":
            case "m":
                double salariohombre = salario - (salario * 0.13);
                if (salario >= 300) {
                    double salarioAFP = salariohombre - (salariohombre * 0.625);
                    System.out.println("Su salario es " + salarioAFP);
                } else {
                    System.out.println("Su salario es " + salariohombre);
                }
        }

    }
}
