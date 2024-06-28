interface Product{
    void create();
}

class ConcreteProductA implements Product{
    @Override
    public void create(){
        System.out.println("Product A created");
    }
}

class ConcreteProductB implements Product{
    @Override 
    public void create(){
        System.out.println("Product B created");
    }
}

abstract class Creator{
    abstract Product factoryMethod();

    public void someOperation(){
        Product product = factoryMethod();
        product.create();
    }
}

class ConcreteCreatorA extends Creator{
    @Override
    Product factoryMethod(){
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator{
    @Override
    Product factoryMethod(){
        return new ConcreteProductB();
    }
}


/**
 * Factory
 */
public class Factory {

    public static void main(String[] args) {
        Creator create = new ConcreteCreatorA();
        create.someOperation();

        create = new ConcreteCreatorB();
        create.someOperation();
    }
    
}