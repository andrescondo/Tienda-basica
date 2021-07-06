/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.IOException;

/**
 *
 * @author Andres Condo twitter @andreescondo
 */
public class clearConsole {
    
    public clearConsole(){
        try{
            String os = System.getProperty("os.name"); //muestra el nombre del SO
            
            if(os.contains("Windows 10")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Funciona?");
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
            
        } catch(IOException | InterruptedException e){
            System.out.println(e);
        }
    }
    
}
