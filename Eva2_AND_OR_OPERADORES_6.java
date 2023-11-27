/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_and_or_operadores_6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_AND_OR_OPERADORES_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner nono = new Scanner (System.in);
        System.out.println("ingresa la calificacion");        
        int califa = nono.nextInt();
        //vamosa  evaluar
        if((califa >=0) && (califa<=100)){
            System.out.println("la calificacion "+califa+" es valida!!");
            if (califa>=70)
                System.out.println("acreditado");
            else
                System.out.println("no acreditado");
        }else
            System.out.println("la calificacion "+califa+" no es valida");
        
        
        
        
    }
}
    

