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
    }

 
    
    @Override
    public String toString()
    {
       
    }
    
    //calculate cost of candy
    @Override
    public int getCost() {
        //round up weight 
        int weightUp = (int)(Math.round(weight));
        
        //calculate cost
        int costCandy = weightUp * pricePerLbs;
        
        //return cost in cents
        return costCandy;
    }
}
