package test3;

public class DialogData {
    public String strPerson() {
        return "1. Create a Person\n";
    }
    public String strCardType() {
        return "1. Create a Default Card for that person\n" + "+ Create a Credit Card for that person\n" +
                "+ Create a Saving Card for that person\n";
    }
    public String strName() {
        return "1. write name and surname\n";
    }

    public String strDoYouWantToAddCardTypeCreditCard(){
        return "Do You Want To Add a CardType - CreditCard?\n" + "1. Yes\n" + "2. No\n";
    }

//    public String strName() {
//        return "1. write name and surname\n";
//    }
//    public String strId() {
//        System.out.println("1. ");
//    }
}
