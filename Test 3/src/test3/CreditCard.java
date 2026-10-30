package test3;

import java.util.Date;

public class CreditCard extends DefaultCard{
    private int CardId = getCardId()+1;
    private String name = getName();
    private double balance = 10000;
    private Date time = new Date();
    private long timeLock = time.getTime() + 24000;

    public CreditCard(int cardId, String name, double balance, Date time, int timeLock) {
        CardId = cardId;
        this.name = name;
        this.balance = balance;
        this.time = time;
        this.timeLock = timeLock;
    }

    public CreditCard() {

    }

    @Override
    public int getCardId() {
        return CardId;
    }

    @Override
    public void setCardId(int cardId) {
        CardId = cardId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public long getTimeLock() {
        return timeLock;
    }

    public void setTimeLock(int timeLock) {
        this.timeLock = timeLock;
    }

    @Override
    public void displayAll(){
        System.out.println("Personal Credit Card ID: " + getCardId() + "\n" +
                "Person: " + getName() + "\n" +
                "Balance: " + getBalance() + "$\n");
    }

    @Override
    public void addBalance(double money){
        if (money > 0) {
            balance += money;
        } else {
            System.out.println("You can't add negative number or nothing");
        }
    }

    @Override
    public void subBalance(double money){
        if (balance-money >= 0){
            balance -= money;
        } else {
            System.out.println("You can't sub more than your balance, too much");
        }
        if (1000 >= money){
            System.out.println(time);
        } else {
            System.out.println("You can't sub more than 1000$, because credit limit");
        }
    }
}
