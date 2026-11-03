package test7_part2;

public class Main {
    static void main(String[] args) {
        Person anna = new Person("Anna");
        Person bob = new Person("Bob");
        Person clara = new Person("Clara");
        boolean ball = true;

        anna.hasBall(ball);

        anna.pass(bob);

        bob.hasBall(ball);

        anna.hasBall(!ball);

        bob.pass(clara);

        clara.hasBall(ball);

        clara.pass(clara);

        anna.checkBall(!ball);
        bob.checkBall(!ball);
        clara.checkBall(ball);
    }
}

//Anna has the ball
//Anna passes to Bob
//Bob has the ball
//Anna doesn't have the ball
//Bob passes to Clara
//Clara has the ball
//Clara can't pass to itself
//Anna has ball: false
//Bob has ball: false
//Clara has ball: true
