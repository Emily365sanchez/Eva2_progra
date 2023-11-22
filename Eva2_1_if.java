/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_1_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tata = new Scanner(System.in);
        int califa;
        System.out.println("introduce la calificacion");
        califa = tata.nextInt();
        
        if (califa >=70){ //if (expreicon a evaluar)
            System.out.println("Aprovado viaje a EUA");
            System.out.println("Felicidades!!");
        }else //else----> si no
            System.out.println("No acreditado ponte a chamvear");
            
        System.out.println("Fin del programa");
    }
}
    
    

