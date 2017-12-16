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
        
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    
    @Override
    public String toString(){
        //make a new string to add to
        String space = "";
        
        //convert cost to dollars and cents
        String costDollar = DessertShoppe.cents2dollarsAndCents(getCost());
        
        //first string with number of cookies and price per dozen
        String info = number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz";

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

    @Override
    public int getCost() {
        // ratio of number of cookies bought per dozen
        double divisionFactor = 12 / number;
        
        //find cost by dividing ratio by the price per dozen
        double costCookie = pricePer12 / divisionFactor;
        
        //round up number to turn it into integer
        int costCookieUp = (int)(Math.round(costCookie));
        
        //return the cost
        return costCookieUp;
    }
    
}
