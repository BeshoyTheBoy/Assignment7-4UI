/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beshoy
 */
public class Candy extends DessertItem{
    
    //instance variables
    private double weight;
    private int pricePerLbs;
    
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
        
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

 
    
    @Override
    public String toString(){
       //make a new string to add to
        String space = "";
        
        //convert cost to dollars and cents
        String costDollar = DessertShoppe.cents2dollarsAndCents(getCost());
        
        //first string with number of cookies and price per dozen
        String info = weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";

        space += info + "\n";

        //add name of item to it
        String name = super.getName();
        space += name;
        
        //find left over number of spaces
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - (costDollar.length() + name.length()); i++){
            space += " ";
        }
        
        //add the cost after
        space += costDollar;
        
        return space;
    }
    
    //calculate cost of candy
    @Override
    public int getCost() {
        //calculate cost
        double costCandy = weight * pricePerLbs;
        
        int costCandyUp = (int)(Math.round(costCandy));
        //return cost in cents
        return costCandyUp;
    }
}
