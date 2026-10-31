package test3;

public class Bank {
    public static void main(String[] args) {
        DefaultCard VelislavCard1 = new DefaultCard("Velislav Velislavov");
        VelislavCard1.printInfo();

        DefaultCard IvanovCard1 = new DefaultCard("Ivan Ivanov");
        CreditCard IvanovCard2 = new CreditCard();
        SavingCard IvanovCard3 = new SavingCard();

        IvanovCard1.printInfo();
        IvanovCard2.printInfo();
        IvanovCard3.printInfo();
    }
}
