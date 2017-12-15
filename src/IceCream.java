/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beshoy
 */
public class IceCream extends DessertItem{

    //instance variables
    private int cost;
    
    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }

  
    @Override
    public String toString(){
      //make a new string to add to
        String space = "";
        //add name of item to it
        String name = super.getName();
        space += name;
        
        //convert cost to dollars and cents
        String costDollar = DessertShoppe.cents2dollarsAndCents(getCost());
        
        
        //find left over number of spaces
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - (costDollar.length() + name.length()); i++){
            space += " ";
        }
        
        //add the cost after
        space += costDollar;
        
        return space;
    }
    

    @Override
    public int getCost() {
        return cost;
    }
    
}
