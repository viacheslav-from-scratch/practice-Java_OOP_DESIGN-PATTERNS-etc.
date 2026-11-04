package test7_part3;

public class Main {
    static void main(String[] args) {
        Battle anna = new Battle("Anna", 100);
        Battle bob = new Battle("Bob", 70);

        anna.hit(bob);
        bob.checkHp();
        bob.hit(anna);
        anna.checkHp();
        anna.hit(anna);
        anna.isStronger(bob);
    }
}

//Anna hits Bob
//Bob has 50 hp
//Bob hits Anna
//Anna has 80 hp
//Anna can't attack itself
//Anna stronger: true
