package test7_part3;

public class Battle {
    private String name;
    private int hp;
    private boolean stronger;

    public Battle(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void hit(Battle enemy){
        enemy.hp -= 20;

        if (this == enemy) {
            System.out.println(this.getName() + " can't attack itself");
        } else {
            System.out.println(this.getName() + " hits " + enemy.getName());
        }
    }

    public void checkHp(){
        System.out.println(this.getName() + " has " + this.getHp() + " hp");
    }

    public void isStronger(Battle enemy){
        if (this.getHp() > enemy.getHp()) {
            stronger = true;
        }

        System.out.println(this.getName() + " stronger: " + stronger);
    }
}
