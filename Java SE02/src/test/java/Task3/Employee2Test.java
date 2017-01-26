package Task3;

import Task2.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 26.01.2017.
 */
public class Employee2Test {
    @Test
    public void addStandartSet() throws Exception {
        Employee2 employee=new Employee2("Nick");
        System.out.println(employee.getName());
        employee.showStationary(employee);
    }

}