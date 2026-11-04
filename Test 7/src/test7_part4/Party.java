package test7_part4;

public class Party {
    private String name;
    private boolean isDancing = false;
    private String dancingWith = "nobody";

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDancing() {
        return isDancing;
    }

    public String getDancingWith() {
        return dancingWith;
    }

    public void inviteDancing(Party partner){
        if (this != partner && !partner.isDancing) {
            System.out.println(this.getName() + " and " + partner.getName() + " are now partners");
            this.isDancing = true;
            partner.isDancing = true;
            this.dancingWith = partner.name;
            partner.dancingWith = this.name;
        } else if (this != partner && partner.isDancing) {
            System.out.println(partner.getName() + " is already dancing with " + partner.getDancingWith());
        } else if (this == partner) {
            System.out.println(this.getName() + " can't dance with itself");
        }
    }

    public void leaveDancing(Party partner){
        if (this != partner) {
            this.isDancing = false;
            partner.isDancing = false;
            this.dancingWith = "nobody";
            partner.dancingWith = "nobody";

            System.out.println(this.getName() + " leaves " + partner.getName());
        }
    }

    public void checkPartner(){
        if(!this.isDancing) {
            System.out.println(this.getName() + " has no partner");
        } else {
            System.out.println(this.getName() + " has partner");
        }
    }

    public void partnerStatus() {
        System.out.println(this.getName() + " partner: " + this.dancingWith);
    }
}
