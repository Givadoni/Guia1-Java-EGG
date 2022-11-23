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
public class Ej13y14_VectorNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*EJERCICIO 13: Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. EJERCICIO 14: Utilizando un Bucle for, 
        aloja en el vector Equipo, los nombres de tus compañeros de equipo*/
        Scanner leer=new Scanner(System.in); 
        System.out.println("Bienvenido, por favor ingrese la cantidad de integrantes de su equipo");
        int num = leer.nextInt();
        String[] Equipo = new String [num]; 
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre");
            Equipo[i]=leer.next();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(Equipo[i]);
            
        }
    }
    
}
