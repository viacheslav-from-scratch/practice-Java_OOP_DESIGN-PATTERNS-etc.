package test3;

import java.time.Duration;
import java.time.Instant;

public class CreditCard extends DefaultCard{
    private static int CREDIT_CARD_ID = 20200090;
    private static double DEFAULT_BALANCE = 10_000;
    private double WITHDRAW_LIMIT = 1_000;
    private Duration LOCK_TIME = Duration.ofDays(24);
    private int LIMIT_TIMES = 5;
    private int YOUR_TIMES = 0;
    private String CardType;

    private Instant unlockAt = Instant.now().plus(LOCK_TIME);

    public CreditCard() {
        super(DEFAULT_BALANCE);
        this.CardType = "Credit";
    }

    @Override
    public boolean withdrawBalance(double money){
        if (DEFAULT_BALANCE-money <= 0){
            System.out.println("Too much: You can't withdraw more than your balance");
            return false;
        }
        if (WITHDRAW_LIMIT <= money){
            System.out.println("Credit Limit: You can't withdraw more than 1000");
            return false;
        }
        if(WITHDRAW_LIMIT >= money && LIMIT_TIMES > YOUR_TIMES){
            WITHDRAW_LIMIT -= money;
            YOUR_TIMES++;
            System.out.println("Lock Activation: You activate your daily possible withdraw");
            return true;
        }
        DEFAULT_BALANCE -= money;
        return true;
    }

    @Override
    public void printInfo(){
        System.out.println("CardType: " + CardType + " " + " CardId: " + CREDIT_CARD_ID + " " + "Name: " + super.getName() + " " + "Balance: " + this.getBalance() + "$ ");
    }
}
