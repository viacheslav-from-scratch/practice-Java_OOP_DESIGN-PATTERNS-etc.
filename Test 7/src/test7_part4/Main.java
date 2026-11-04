package test7_part4;

public class Main {
    static void main(String[] args) {
        Party anna = new Party("Anna");
        Party bob = new Party("Bob");
        Party clara = new Party("Clara");

        anna.inviteDancing(bob);

        clara.inviteDancing(bob);

        anna.inviteDancing(anna);

        bob.leaveDancing(anna);

        anna.checkPartner();

        clara.inviteDancing(bob);

        anna.inviteDancing(bob);

        anna.partnerStatus();
        bob.partnerStatus();
        clara.partnerStatus();
    }
}

//Anna and Bob are now partners
//Bob is already dancing with Anna
//Anna can't dance with itself
//Bob leaves Anna
//Anna has no partner
//Clara and Bob are now partners
//Bob is already dancing with Clara
//Anna partner: nobody
//Bob partner: Clara
//Clara partner: Bob
