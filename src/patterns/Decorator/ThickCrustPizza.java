package patterns.Decorator;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        description = "ThickCrustPizza with tomato sauce";
    }

    public double cost() {
        return 5.0;
    }
}
