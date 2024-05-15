package Assignment.Pizza.Java;

/**
 * Onion
 */
public class Onion extends ToppingDecorator {

    public Onion(Pizza pizza) {
        super(pizza);
        
    }

    @Override
    public String getDiscription() {
        return pizza.getDiscription() + ", With Extra Onion ";
    }
        
    @Override
    public double getCost() {
        return pizza.getCost() + 1.5 ; 
    }


    
}