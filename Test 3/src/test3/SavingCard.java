package test3;

public class SavingCard extends DefaultCard{
    private static int SAVING_CARD_ID = 20300090;
    private static double DEFAULT_BALANCE = 0;
    private double balance;
    private int CardId;
    private String CardType;

    public SavingCard() {
        super(DEFAULT_BALANCE);
        this.CardId = SAVING_CARD_ID;
        this.CardType = "Saving";
        this.balance = DEFAULT_BALANCE;
    }

    @Override
    public void printInfo(){
        System.out.println("CardType: " +CardType+ "  CardId: " + CardId + " Name: " + name + " Balance: " + balance + "$");
    }
}
