package test6;

public class Main {
    static void main(String[] args) {
        Person anna = new Person("Anna");
        Person bob = new Person("Bob");

        System.out.println("anna = " + anna);
        anna.whoAmI();

        System.out.println("bob = " + bob);
        bob.whoAmI();
    }
}
