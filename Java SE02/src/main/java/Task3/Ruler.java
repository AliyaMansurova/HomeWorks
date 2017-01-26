package Task3;

import Task2.Stationary;

/**
 * Created by User on 26.01.2017.
 */
public class Ruler extends Stationary {
    private double lengthInMm;
    private String producer;

    public Ruler() {
        this.setName("Ruler");
        this.setPrice(0);
        this.setLengthInMm(0);
        this.setProducer("");
    }

    public Ruler(double price, double length, String producer) {
        this.setName("Ruler");
        this.setPrice(price);
        this.setLengthInMm(length);
        this.producer = producer;
    }

    public double getLengthInMm() {
        return lengthInMm;
    }

    public void setLengthInMm(double lengthInMm) {
        this.lengthInMm = lengthInMm;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Ruler{" +
                "lengthInMm=" + lengthInMm +
                ", producer='" + producer + '\'' +
                '}';
    }
}
