/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_bisiesto_4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_Bisiesto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nono = new Scanner (System.in);
        int year, residuo;
        
        System.out.println("introduce el year");
        year = nono.nextInt();
        residuo = year % 4;
        if(residuo==0){
            residuo = year % 100;
            if(residuo==0){
                residuo=year%400;
                if(residuo==0){
                    System.out.println("es bisiesto");
                }else
                    System.out.println("no es bisiesto");
            }else 
                System.out.println("Es bisiest6o");
        }else
            System.out.println("NO es bisiesto");
            
    }
}
    
   

