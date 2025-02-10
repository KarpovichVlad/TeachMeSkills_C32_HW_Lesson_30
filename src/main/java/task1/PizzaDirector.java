package task1;

import java.util.List;

public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder ) {
        this.builder = builder;

    }
    public Pizza constructPizza(String dough, String size, List<String> topping, String sauce ) {
        builder.buildDough(dough);
        builder.buildSize(size);
        builder.buildTopping(topping);
        builder.buildSauce(sauce);
        return builder.getPizza();

    }
}
