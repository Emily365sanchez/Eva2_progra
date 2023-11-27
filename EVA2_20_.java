
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class EVA2_20_ {
    
     public static void main(String[] args) {
        int canti=1000;
        Scanner nono=new Scanner(System.in);
        while(canti >0){
            System.out.println("cuanto desea retirar");
            int retiro = nono.nextInt();
            //acmulador
            //canti = canti - retiro;
            canti-=retiro;
            System.out.println("te quedan $"+canti+" de saldo");
            
                
        }
        
    }
}

