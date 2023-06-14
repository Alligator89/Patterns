package patterns.Strategy;

public class Context {
    private float value1 = 2;

    private float value2 = 3;
    private final Strategy strategy;

    public float getValue1() {
        return value1;
    }

    public void setValue1(float value1) {
        this.value1 = value1;
    }

    public float getValue2() {
        return value2;
    }

    public void setValue2(float value2) {
        this.value2 = value2;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float value1, float value2) {
        return strategy.calculation(value1, value2);
    }
}
