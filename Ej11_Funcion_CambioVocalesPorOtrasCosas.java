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
public class Ej11_Funcion_CambioVocalesPorOtrasCosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carÃƒÂ¡cter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *  */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la frase");
        String frase = leer.nextLine();
        frase=frase.toLowerCase();
        String retorno = funcionCambio(frase);
        System.out.println("La frase cambiada es " + retorno);

    }

    public static String funcionCambio(String frase) {
        int longitud = frase.length();
        
        String frase2 = " ";

        for (int i = 0; i < longitud; i++) {
            
            switch (frase.substring(i, i + 1)) {
                case ("a"):
                    frase2 = frase2.concat("@");
                    break;
                case ("e"):
                    frase2 = frase2.concat("#");
                    break;
                case ("i"):
                    frase2 = frase2.concat("i");
                    break;
                case ("o"):
                    frase2 = frase2.concat("%");
                    break;
                case ("u"):
                    frase2 = frase2.concat("*");
                    break;
                default:
                    frase2 = frase2.concat(frase.substring(i, i + 1));
            }

        }
        return frase2;
    }

}