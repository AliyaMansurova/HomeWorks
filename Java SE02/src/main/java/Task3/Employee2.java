package Task3;

import Task2.Stationary;

import java.util.ArrayList;

/**
 * Created by User on 25.01.2017.
 */
public class Employee2 {
    private String name;
    ArrayList<Stationary> stationary = new ArrayList();

    public Employee2(String name, ArrayList<Stationary> stationary) {
        this.name = name;
        this.stationary = stationary;
        this.addStandartSet();
    }
    public Employee2(String name)
    {
        new Employee2(this.name,this.stationary);
        this.setName(name);
        this.addStandartSet();

    }
    public Employee2() {
        new Employee2(this.name,this.stationary);
        this.addStandartSet();
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
    public void addStandartSet(){
        Pen pen=new Pen(12.5,"blue","Erich Krause");
        Pencil pencil=new Pencil(23,"red");
        Notebook notebook=new Notebook(35.5,48);
        this.stationary.add(pen);
        this.stationary.add(pencil);
        this.stationary.add(notebook);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stationary> getStationary() {
        return stationary;
    }

    public void setStationary(ArrayList<Stationary> stationary) {
        this.stationary = stationary;
    }

    public void showStationary(Employee2 e){
        System.out.print("Name:"+e.getName());
        for(Stationary s:e.getStationary())
        {
            System.out.println(s.toString());
        }

    }
}