package patterns.Decorator;

public class ThinCrustPizza extends Pizza {
    public ThinCrustPizza() {
        description = "ThinCrustPizza with tomato sauce";
    }

    public double cost() {
        return 5.0;
    }
}
