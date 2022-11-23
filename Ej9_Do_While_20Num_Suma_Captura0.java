/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Gisele
 */
public class Ej9_Do_While_20Num_Suma_Captura0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        do {
            int num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
            } else if (num > 0) {
                suma = suma + num;
            }
            cont++;
        } while (cont < 20);
        System.out.println("La suma de los números positivos ingresados es " + suma);
    }

}
