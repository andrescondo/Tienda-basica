/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author AndresCondo  twitter @andreescondo 
 */
public class Products {
    private String name;
    private double price;
    private int amount;
    private int id;
    
    public  Products(){
        System.out.println("Productos");
    }
    
    public Products(String n, double p, int a, int i){
        this.name = n;
        this.price = p;
        this.amount = a;
        this.id = i;
        
//NOTA: CUANDO ES SET, SIEMPRE SE USA VOID  
// CUANDO ES GET, DEPENDE DEL TIPO DE VARIABLE
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
     public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    
    
    
    
}
