/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);

       System.out.print("Introduce la base: ");
       int base = scanner.nextInt();

       System.out.print("Introduce el exponente: ");
       int exponente = scanner.nextInt();

       long resultado = 1;

       for(int i = 1; i <= exponente; i++) {
           resultado = resultado * base;
       }

       System.out.println("El resultado es: " + resultado);
   }
}
   
