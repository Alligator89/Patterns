package patterns.Observer;

public class Main {
    public static void main(String[] args) {
        Subject store = new Store();
        Observer customer1 = new PassiveCustomer();
        Observer customer2 = new ShopaholicCustomer();
        Observer customer3 = new ShopaholicCustomer();

        store.addSubscriber(customer1);
        store.addSubscriber(customer2);

        store.notifySubscribers();
        store.removeSubscriber(customer1);

        store.addSubscriber(customer3);

        store.notifySubscribers();
    }
}
