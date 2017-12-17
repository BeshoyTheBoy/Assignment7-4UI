/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beshoy
 */
public class Sundae extends IceCream{
    
    //instance variables
    private String toppingName;
    private int toppingCost;
    
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
       super(icName, icCost);
       
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    
    
    @Override
    public String toString(){
        //String to add to
        String space = "";
        //Get topping name
        String topping = toppingName + " Sundae with";
        
        //add to String with new line
        space += topping + "\n";
        
        //call toString from IceCream
        String fromIceCream = super.toString();
        
        //Add to the string
        space += fromIceCream;
        
        //return the string
        return space;
    }
    
    @Override
    public int getCost(){
       
        //call cost of ice cream from ice cream class then add topping price on it
        return super.getCost() + toppingCost;
    }
    
}
