/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_numeros_pares_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_Numeros_pares_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner nono = new Scanner(System.in);
        int valor, residuo;
        
        System.out.println("Introduce el valor a evaluar");
        valor = nono.nextInt();
        
        residuo = valor%2;
        if (residuo==0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }
}
    
    

