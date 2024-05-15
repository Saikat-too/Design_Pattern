package Assignment.Pizza.Java;

/**
 * ToppingDecorator
 */
abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza ;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza ; 
    }
  
    
}