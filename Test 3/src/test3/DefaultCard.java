package test3;

public class DefaultCard {
    private int CardId;
    private String name;
    private double balance = 0;

    public DefaultCard() {
    }

    public DefaultCard(int cardId, String name, double balance) {
        CardId = cardId;
        this.name = name;
        this.balance = balance;
    }

    public int getCardId() {
        return CardId;
    }

    public void setCardId(int cardId) {
        CardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAll(){
        System.out.println("Personal Default Card ID: " + getCardId() + "\n" +
                "Person: " + getName() + "\n" +
                "Balance: " + getBalance() + "$\n");
    }

    public void addBalance(double money){
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("You can't add negative number or nothing");
        }
    }
    public void subBalance(double money){
        if (balance-money >= 0){
            balance -= money;
        } else {
            System.out.println("You can't sub more than your balance, too much");
        }
    }
}
