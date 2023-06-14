package patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Dima")
                .withSurname("Ivanov")
                .withAge(32)
                .build();
        System.out.println(myPerson.getName() + "\n" + myPerson.getSurname() + "\n" + myPerson.getAge());
    }
}
