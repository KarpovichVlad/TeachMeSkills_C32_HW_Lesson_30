package task1;

import java.util.List;

public class CustomPizzaBuilder implements PizzaBuilder {

    private final Pizza pizza;

    public CustomPizzaBuilder(){
       pizza = new Pizza();
   }

    @Override
    public void buildDough(String dough) {
        pizza.setDough(dough);
    }

    @Override
    public void buildSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void buildTopping(List<String> toppings) {
        for (String topping : toppings) {
            pizza.addToppings(topping);
        }

    }

    @Override
    public void buildSauce(String sauce) {
        pizza.setSauce(sauce);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
