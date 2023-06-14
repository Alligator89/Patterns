package patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteProxy();
        subject.request();
    }
}
