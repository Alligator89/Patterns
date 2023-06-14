package patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeStrategy(context.getValue1(), context.getValue2()));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeStrategy(context.getValue1(), context.getValue2()));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeStrategy(context.getValue1(), context.getValue2()));
    }
}

