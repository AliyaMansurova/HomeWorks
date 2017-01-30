package Task1;

import org.junit.Test;

import java.util.logging.Level;

import static org.junit.Assert.*;

/**
 * Created by User on 30.01.2017.
 */
public class CrazyLoggerTest {
    @Test
    public void TestForLogger() throws Exception {
        CrazyLogger logger=new CrazyLogger();
        logger.addLog(Level.FINE,"FINE");
        logger.addLog(Level.CONFIG,"CONFIG");
        logger.search("N");

    }

}