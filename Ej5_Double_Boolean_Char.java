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
public class Ej5_Double_Boolean_Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.*/
        Scanner leer = new Scanner(System.in);
        boolean bandera = leer.nextBoolean();
        double decimal = leer.nextDouble();
        char letra = leer.next().charAt(0);
        System.out.println("La bandera es " + bandera + " el número es " + decimal + " y la letra es " + letra);
        
       
       
        
    }
    
}
