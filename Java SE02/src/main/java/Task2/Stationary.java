package Task2;

public class Stationary {
    private String name;
    private double price;

    public Stationary() {
        this.name="";
        this.price=0;
    }

    public Stationary(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}