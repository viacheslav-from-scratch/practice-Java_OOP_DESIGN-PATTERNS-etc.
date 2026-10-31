package test3;

public class DefaultCard {
    protected static String lastClientName = "Unknown";
    protected String name;

    private int DEFAULT_CARD_ID = 20100090;
    private int nextId = 1;
    private int CardId;
    private double balance = 0;
    private String CardType;

    public DefaultCard(String name) {
        CardId = DEFAULT_CARD_ID;
        DEFAULT_CARD_ID = nextId++;
        this.name = name;
        DefaultCard.lastClientName = name;
        this.balance = 0.0;
        this.CardType = "Default";
    }

    public DefaultCard(double balance) {
        CardId = DEFAULT_CARD_ID;
        DEFAULT_CARD_ID = nextId++;
        this.name = DefaultCard.lastClientName;
        this.balance = balance;
        this.CardType = "Default";
    }

    public int getCardId() {
        return this.CardId;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean depositBalance(double money){
        if (money <= 0) {
            System.out.println("Try: You have deposited amount: " + money + "$");
            System.out.println("Fail: Your amount can't be negative or 0");
            return false;
        }
        System.out.println("Try: You have deposited amount: +" + money + "$");

        System.out.print("Success: Your balance is growing, from " + balance);
        balance += money;
        System.out.print("$ to " + balance + "$\n");
        return true;
    }

    public boolean withdrawBalance(double money){
        if (balance-money <= 0){
            System.out.println("Fail: Your amount can't be bigger than balance");
            return false;
        }

        if (money > balance){
            System.out.println("Fail: Your amount withdraw more than your balance");
            System.out.println(money + ">" + balance);
            return false;
        }
        balance -= money;
        return true;
    }

    public void printInfo(){
        System.out.println("CardType: " + CardType + " " + "CardId: " + CardId + " " + "Name: " + name + " " + "Balance: " + balance + "$ ");
    }
}
