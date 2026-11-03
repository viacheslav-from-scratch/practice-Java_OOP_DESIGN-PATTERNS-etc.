package test7;

public class Main {
    static void main(String[] args) {
        Person anna = new Person("Anna", 20);
        Person bob = new Person("Bob", 25);

        anna.introduce();
        bob.introduce();

        anna.birthday();

        anna.greet(bob);
        bob.greet(anna);
        // error
        anna.greet(anna);

        System.out.println("Anna older: " + anna.isOlderThan(bob));
    }
}
