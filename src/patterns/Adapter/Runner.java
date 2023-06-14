package patterns.Adapter;

public class Runner implements Road {
    private final Road road;

    public Runner(Road road) {
        this.road = road;
    }

    public void runOnTheRoad() {
        System.out.println("Let's run");
        road.run();
        System.out.println("Finish");
    }

    @Override
    public void run() {

    }
}
