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
public class Tienda { 

    /**
     * @param args the command line arguments
     */
    // SE COMENTA CON CTRL + SHIT + C
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//variable para ingreso por teclado
        
        Products product = new Products();//comunicacion con otro archivo del proyecto
        
        System.out.println(product);
    }
    
}
