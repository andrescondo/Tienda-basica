/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author AndresCondo @andreescondo
 */
public class Store { 

    /**
     * @param args the command line arguments
     */
    // SE COMENTA CON CTRL + SHIT + C
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//variable para ingreso por teclado
//        clearConsole cc; TESTEARLO DESPUES


        boolean exit = true;
        
        while(exit){
            System.out.println("1.- Vender");
            System.out.println("2.- Ver Bodega");
            System.out.println("3.- Comprar distribuidor");
            System.out.println("4.- Salir");
            
            System.out.println("Eliga alguna opción:");
            String option = sc.nextLine();
            
            switch(option){
                case "1":
                    System.out.println("Opcion uno");
                    market m = new market();
                    break;
                case "2":
                    System.out.println("Opcion dos");
              
                    break;
                    
                case "4":
                    exit = false;
                    break;
            }
        }
    }

}
