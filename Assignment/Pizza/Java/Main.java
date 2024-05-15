package Assignment.Pizza.Java;

/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        Pizza plainpizza = new PlainPizza();
        System.out.println("Description : " + plainpizza.getDiscription());
        System.out.println("Cost : $" + plainpizza.getCost());

        Pizza onion = new Onion(plainpizza);
        System.out.println("Description : " + onion.getDiscription());
        System.out.println("Cost : $" + onion.getCost());

        Pizza cheese = new Cheese(plainpizza);
        System.out.println("Description : " + cheese.getDiscription());
        System.out.println("Cost : $" + cheese.getCost());

        Pizza cheese2 = new Cheese(onion);
        System.out.println("Description : " + cheese2.getDiscription());
        System.out.println("Cost : $" + cheese2.getCost());

    }
    
}