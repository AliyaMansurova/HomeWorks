package Task2;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by User on 25.01.2017.
 */
public class Employee {
    private String name;
    ArrayList<Stationary> stationary = new ArrayList();

    public Employee(String name, ArrayList<Stationary> stationary) {
        this.name = name;
        this.stationary = stationary;
    }

    public Employee() {
        new Employee(this.name,this.stationary);
    }

    public static void main(String[] args) {
       /* Employee employee=new Employee();
        employee.addStationary("Pen",1.2);
        employee.addStationary("Pencil",3.4);
        System.out.print(employee.SumPrice());*/

    }
    public void addStationary(String name,double price) {
        Stationary stationary = new Stationary(name,price);
        this.stationary.add(stationary);
    }
    public double SumPrice() {
        double s = 0;
        if (this.stationary.isEmpty()) {
            s = 0;
        } else {
            for (int i = 0; i < this.stationary.size(); i++) {
                s = s + this.stationary.get(i).getPrice();
            }

        }
        return s;
    }
}