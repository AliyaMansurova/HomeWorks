package Task3;
import Task2.Stationary;

/**
 * Created by User on 26.01.2017.
 */
public class Pen extends Stationary {
    private String color;
    private String producer;

    public Pen() {
        this.setName("Pen");
        this.setPrice(0);
        this.setColor("");
        this.setProducer("");
    }

    public Pen(double price, String color, String producer) {
        this.setName("Pen");
        this.setPrice(price);
        this.setColor(color);
        this.setProducer(producer);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
