package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите тип теста (например, тонкое, толстое): ");
        String dough = sc.nextLine();

        System.out.println("Введите размер пиццы (например, маленькая, средняя, большая): ");
        String size = sc.nextLine();

        List<String> toppings = new ArrayList<>();
        System.out.println("Введите начинку (введите готово, когда закончите): ");
        String topping;
        while (!(topping = sc.nextLine()).equals("готово")) {
            if (!topping.isEmpty()) {
                toppings.add(topping);

            }
        }

        System.out.println("Добавьте соус (например, томатный, чесночный): ");
        String sauce = sc.nextLine();

        PizzaBuilder pizzaBuilder = new CustomPizzaBuilder();

        PizzaDirector director = new PizzaDirector(pizzaBuilder);

        Pizza customPizza = director.constructPizza(dough, size, toppings, sauce);

        customPizza.printPizza();

        sc.close();

    }
}
