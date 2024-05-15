package Assignment.Pizza.Java;

/**
 * Cheese
 */
public class Cheese extends ToppingDecorator {

    public  Cheese (Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDiscription(){
        return pizza.getDiscription() + " , with extra cheese yummy !!!!!";
    }
    
    @Override
    public double getCost(){
        return pizza.getCost() + 4.5;
    }

   
}