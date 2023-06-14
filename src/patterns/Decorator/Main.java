package patterns.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);
        System.out.println(greekPizza.getDescription() + " $" + greekPizza.cost());
    }
}
