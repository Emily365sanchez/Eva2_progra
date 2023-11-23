/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

       while (true) {
           System.out.println("Introduce un número positivo (o cero):");
           int num = scanner.nextInt();
           if (num < 0) {
               break;
           }
           if (num > max) {
               max = num;
           }
           if (num < min) {
               min = num;
           }
       }
    }
    
}
