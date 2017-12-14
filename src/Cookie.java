/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beshoy
 */
public class Cookie extends DessertItem{
    
    //instance variables
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12){
        super(name);
    }

    
    @Override
    public String toString()
    {
        
    }

    @Override
    public int getCost() {
        // ratio of number of cookies bought per dozen
        int divisionFactor = number / 12;
        
        //find cost by multiplying ratio by the price per dozen
        int costCookie = pricePer12 * divisionFactor;
        
        //return the cost
        return costCookie;
    }
    
}
