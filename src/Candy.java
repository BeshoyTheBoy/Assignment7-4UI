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
    
    public Candy(String name, double weight, int pricePerLbs){
        super(name);
    }

 
    
    @Override
    public String toString()
    {
       
    }

    @Override
    public int getCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
