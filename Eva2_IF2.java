/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_if2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_IF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner nono = new Scanner (System.in);
        int valor1;
        int valor2;
        System.out.println("introduce el valor 1");
        valor1 = nono.nextInt();
        System.out.println("introduce el valor 2");
        valor2 = nono.nextInt();
        if(valor1>valor2)
            System.out.println("El valor mas grande es:"+ valor1 );
        else{
            if(valor1==valor2)
                System.out.println("Ambos valores son iguales");
            else
                System.out.println("El valor mas grande es:"+valor2);    
        }
    }
}
    
    

