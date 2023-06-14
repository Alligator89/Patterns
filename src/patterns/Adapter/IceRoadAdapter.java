package patterns.Adapter;

public class IceRoadAdapter implements Road {
    private final IceRoad road;

    public IceRoadAdapter() {
        road = new IceRoad();
    }

    public void run() {
        road.walk();
    }
}
