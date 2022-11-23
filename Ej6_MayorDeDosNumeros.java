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
public class Ej6_MayorDeDosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.*/
        Scanner leer = new Scanner(System.in); 
        System.out.println("Bienvenido, por favor ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos números ingresados son mayores a 25");
        }else if (num1 > 25){
            System.out.println("El primer número ingresado es mayor a 25");
        }else if (num2 > 25){
            System.out.println("El segundo número ingresado es mayor a 25");
        }else{
            System.out.println("Ninguno de los números ingresados es mayor a 25");
        }
    }
    
}
