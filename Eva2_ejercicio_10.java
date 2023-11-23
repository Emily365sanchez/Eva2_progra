/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio_10;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author invitado
 */
public class Eva2_ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "12345"; // Cambia esto por la cadena que deseas validar

       try {
           // Intentamos convertir la cadena a BigInteger
           BigInteger bigInteger = new BigInteger(input);
           System.out.println(input + " es un número entero válido");
       } catch (NumberFormatException e) {
           // Si lanzamos una excepción, la cadena no es un número entero válido
           System.out.println(input + " no es un número entero válido");
       }

       try {
           // Intentamos convertir la cadena a BigDecimal
           BigDecimal bigDecimal = new BigDecimal(input);
           System.out.println(input + " es un número válido");
       } catch (NumberFormatException e) {
           // Si lanzamos una excepción, la cadena no es un número válido
           System.out.println(input + " no es un número válido");
           
            String input = "12345"; // Cambia esto por la cadena que deseas validar

       if (input.matches("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?")) {
           System.out.println(input + " es un número válido");
       } else {
           System.out.println(input + " no es un número válido");
       }
   }
}
    

       }
   
   

    

