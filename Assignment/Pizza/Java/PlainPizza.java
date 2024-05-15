package Assignment.Pizza.Java;

/**
 * PlainPizza
 */
public class PlainPizza implements Pizza {

    @Override
    public String getDiscription() {
        
        return "Here is your Pizza" ;
    }

    @Override
    public double getCost() {
        return 12.0 ; 
    }

    
}