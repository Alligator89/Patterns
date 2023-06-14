package patterns.Prototype;

public class HumanPrototype extends Human {
    public static void main(String[] args) {
        Human human1 = new Human("Dima", "Petrov", 30);

        Human human2 = (Human) human1.getClone();
    }
}
