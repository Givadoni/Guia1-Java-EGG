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
public class Ej12_Metodo_Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son. */
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, por favor ingrese dos números para verificar si son múltiplos");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        esMultiplo(num1,num2);
    }
    public static void esMultiplo(int num1,int num2){
        if ((num1 % num2)==0){
            System.out.println("El primer número es múltiplo del segundo");
        }else{
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}
