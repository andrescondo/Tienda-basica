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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String name;
        
        System.out.println("Ingresa un nombre");
        
        name = sc.next();
        
        System.out.println(name);
        
    }
    
}
