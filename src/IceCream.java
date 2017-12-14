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
    }

  
    @Override
    public String toString()
    {
     
       
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
