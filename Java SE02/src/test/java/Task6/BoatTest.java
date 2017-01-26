package Task6;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by User on 26.01.2017.
 */
public class BoatTest {
    @Test
    public void  TestNullBoat(){
        Boat boat=new Boat();
        assertThat(boat.getEngine().getPower(),is(0.0));
        assertThat(boat.getEngine().getModel(),is(""));
        assertThat(boat.isStarted(),is(false));
    }
    @Test
    public void TestThatBoatStarted(){
     Boat.Engine engine=new Boat().new Engine("F",125);
     Boat boat=new Boat("BMW",engine);
     assertThat(boat.getEngine().getPower(),is(125.0));
     assertThat(boat.getEngine().getModel(),is("F"));
     assertThat(boat.isStarted(),is(true));
     boat.start(boat);


    }

}