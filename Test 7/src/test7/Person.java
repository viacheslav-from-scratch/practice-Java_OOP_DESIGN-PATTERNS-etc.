package test7;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce(){
        System.out.println("Hi, I am " + this.getName());
    }

    public void birthday(){
        this.age = this.age + 1;
        System.out.println(this.getName() + " is now " + this.getAge());
    }

    public void greet(Person other){
        if(other == this){
            System.out.println(this.getName() + " can't greet itself");
        }
        else {
            System.out.println(this.getName() + " says hi to " + other.getName());
        }
    }

    public boolean isOlderThan(Person other){
        if (this.age > other.getAge()) {
            return true;
        }
        return false;
    }
}
