package test4;

public enum PizzaSize {
    SMALL(25, 6.0), MEDIUM(30, 8.5), LARGE(35, 11.0);

    private final int diameter;
    private final double price;

    PizzaSize(int diameter, double price) {
        this.diameter = diameter;
        this.price = price;
    }

    public boolean isFamily() {
//        return true; - fix it after understanding
        return new Boolean(String.valueOf(1));
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
}