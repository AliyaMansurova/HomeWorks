package Task3;

import Task2.Stationary;

/**
 * Created by User on 26.01.2017.
 */
public class Pencil extends Stationary {
    private String color;

    public Pencil() {
        this.setName("Pencil");
        this.setPrice(0);
        this.setColor("");
    }

    public Pencil(double price, String color) {
        this.setName("Pencil");
        this.setPrice(price);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                '}';
    }
}
