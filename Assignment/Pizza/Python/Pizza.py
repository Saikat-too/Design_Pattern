class Pizza:
    def get_Description(self):
        pass
    def get_Cost(self):
        pass

class PlainPizza(Pizza):
    def get_Description(self):
        return "This is your yummy pizza "
    def get_Cost(self):
        return 12.0;

class ToppingDecorator(Pizza):
    def __init__(self , pizza):
        self.pizza=pizza
    def get_Description(self):
        return self.get_Description()
    def get_Cost(self):
        return self.get_Cost()

class Onion(ToppingDecorator):
    def get_Description(self):
        return self.pizza.get_Description() + " , this your extra onion yalal balal la "
    def get_Cost(self):
        return self.pizza.get_Cost() + 1.5 

class Cheese(ToppingDecorator):
    def get_Description(self):
        return self.pizza.get_Description() + " , this is aisa zip lap lapayiii extra cheeseisfif yumm !!!!!!"
    def get_Cost(self):
        return self.pizza.get_Cost() + 4.5

if __name__ == "__main__":
    plain_pizza = PlainPizza()
    print("Description:", plain_pizza.get_Description())
    print("Cost: $", plain_pizza.get_Cost())

    onion_pizza = Onion(plain_pizza)
    print("\nDescription:" , onion_pizza.get_Description())
    print("Cost: $", onion_pizza.get_Cost())

    cheese_pizza = Cheese(onion_pizza)
    print("\nDescription:", cheese_pizza.get_Description())
    print("Cost: $", cheese_pizza.get_Cost())