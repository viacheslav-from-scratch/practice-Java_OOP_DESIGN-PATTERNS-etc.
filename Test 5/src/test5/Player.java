package test5;

public class Player {
    private final String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void takeDamage(int amount){
        this.hp = this.hp - amount;
        System.out.println(name + " has " + hp + " hp");
    }

    public void attack(Player target, int damage) {

    }
}
