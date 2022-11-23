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
public class Ej10_4Numeros_Asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **  */
       Scanner leer = new Scanner(System.in);
       int num1 = leer.nextInt();
       if (num1 <= 20){
           System.out.print(num1);
        for (int i = 0; i < num1; i++) { 
             System.out.print("*");
        }
       }else {
           System.out.println("El número ingresado es incorrecto");
       }System.out.println(" "); 
       int num2 = leer.nextInt();
       if (num2 <= 20){
           System.out.print(num2);
           for (int i = 0; i < num2; i++) {
               System.out.print("*");    
           }
       }else{
           System.out.println("El número ingresado es incorrecto");
       }System.out.println(" ");
       int num3 = leer.nextInt();
       if (num3 <= 20){
           System.out.print(num3);
           for (int i = 0; i < num3; i++) {
               System.out.print("*");  
           }
       }else{
           System.out.println("El número ingresado es incorrecto");
       }System.out.println(" ");
       int num4 = leer.nextInt();
       if (num4 <= 20){
           System.out.print(num4);
           for (int i = 0; i < num4; i++) {
               System.out.print("*");
           }
       }else{
           System.out.println("El número ingresado es incorrecto");
       }System.out.println(" ");
        }
    }
    

