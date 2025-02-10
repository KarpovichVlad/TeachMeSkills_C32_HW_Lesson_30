package task1;

import java.util.List;

public interface PizzaBuilder {
    void buildDough(String dough);
    void buildSize(String size);
    void buildTopping(List<String> topping);
    void buildSauce(String sauce);
    Pizza getPizza();
}
