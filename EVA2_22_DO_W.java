
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
public class EVA2_22_DO_W {
    
    final static String NOMBRE_USUARIO = "Admin";
final static String PASSWORD = "Admin";
        
    public static void main(String[] args) {
        String usuario;
        String pwd;
        Scanner nono=new Scanner(System.in );
        
        do{
            System.out.println("introduce el usuario");
            usuario=nono.nextLine();
            System.out.println("introduce el contrasena");
            pwd=nono.nextLine();
        }while((!usuario.equals(NOMBRE_USUARIO)) || (!pwd.equals(PASSWORD)));
    }
}

