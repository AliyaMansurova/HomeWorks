package Task7;

import Task7.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Created by User on 26.01.2017.
 */
public class BoatTest2 {
    @Test
    public void AnnotationIsWorked(){
        Boat2 boat=new Boat2();
        assertThat(boat.method(Boat2.class),is(true));
        assertThat(boat.method(String.class),is(false));
            }

}