import Task2.Employee;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Created by User on 25.01.2017.
 */

public class Test2 {
    @Test
    void PriceOfStationary{
        Employee employee=new Employee();
        employee.addStationary("Pen",1.2);
        employee.addStationary("Pencil",3.4);
        assertThat(employee.SumPrice(),is(4.6));
        }
    }
