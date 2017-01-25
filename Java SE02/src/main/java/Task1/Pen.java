package Task1;

public class Pen {
    private String name;
    private String color;

    public static void main(String[] args) {
        Pen Pen1 = new Pen("Pen1", "red");
        Pen Pen2 = new Pen("Pen2", "red");
        Pen Pen3 = new Pen("Pen1", "blue");
        Pen Pen4 = new Pen("Pen2", "red");
        System.out.println(Pen1.toString());
        System.out.println(Pen2.toString());
        System.out.println(Pen3.toString());
        System.out.println(Pen4.toString());
        System.out.println("Pen1.equals(Pen2)=" + Pen1.equals(Pen2));
        System.out.println("Pen2.equals(Pen4)=" + Pen2.equals(Pen4));
        System.out.println("Pen1.hashcode=" + Pen1.hashCode());
    }

    public Pen() {
        this.name = "";
        this.color = "";
    }

    public Pen(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } else if(!(o instanceof Pen)) {
            return false;
        } else if(null == o) {
            return false;
        } else {
            Pen pen = (Pen)o;
            return !this.getName().equals(pen.getName())?false:this.getColor().equals(pen.getColor());
        }
    }

    public String toString() {
        return "Pen{name=\'" + this.name + '\'' + ", color=\'" + this.color + '\'' + '}';
    }

    public int hashCode() {
        int result = this.getName().hashCode();
        result = 31 * result + this.getColor().hashCode();
        return result;
    }
}