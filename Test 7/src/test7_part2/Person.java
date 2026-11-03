package test7_part2;

public class Person {
    private String name;
    private boolean ball;

    public Person(String name) {
        this.name = name;
        this.ball = true;
    }

    public String getName() {
        return name;
    }

    public void hasBall(boolean ball){
        if (ball){
            System.out.println(this.getName() + " has the ball");
        } else {
            System.out.println(this.getName() + " doesn't have the ball");
        }
    }

    public void pass(Person other){
        if(this == other) {
            System.out.println(this.getName() + " can't passes itself");
        } else {
            System.out.println(this.getName() + " passes to " + other.getName());
        }
    }

    public void checkBall(boolean ball){
        if(ball) System.out.println(this.getName() + " has ball: " + ball);
        else System.out.println(this.getName() + " has ball: " + ball);
    }
}
