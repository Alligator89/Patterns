package patterns.Proxy;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("Request to RealSubject...");
    }
}
