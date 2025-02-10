package task1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String dough;
    private String size;
    private List<String> toppings;
    private String sauce;

   public Pizza(){
       toppings = new ArrayList<String>();
   }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void addToppings(String toppings) {
        this.toppings.add(toppings);
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void printPizza() {
        System.out.println("Pizza with " + dough + " dough, size: " + size +
                ", toppings: " + toppings + ", sauce: " + sauce);
    }
}
