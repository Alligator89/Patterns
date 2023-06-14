package patterns.Proxy;

public class ConcreteProxy implements Proxy {
    private RealSubject realSubject = new RealSubject();

    public void request() {
        System.out.println("Before...");
        realSubject.request();
        System.out.println("After...");
    }
}
