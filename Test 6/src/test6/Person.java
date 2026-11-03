package test6;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void whoAmI(){
        System.out.println("this = " + this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
