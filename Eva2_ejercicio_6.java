/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

      System.out.print("Introduce un número entero positivo: ");
      int numero = scanner.nextInt();

      String binario = Integer.toBinaryString(numero);

      System.out.println("El equivalente en binario es: " + binario);
  }
}
    
    

