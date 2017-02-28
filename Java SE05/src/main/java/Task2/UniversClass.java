package Task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.FileNameMap;
import java.util.Properties;

/**
 * Created by User on 26.02.2017.
 */
public class UniversClass {
    public void getKey(String fileName) throws Exception {
        Properties properties = new Properties();
        try {
            FileInputStream fIs = new FileInputStream(fileName);
            properties.load(fIs);
            String key = properties.getProperty("key1");
            if (key == null)
                throw new Exception("Properties have not this key");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void main(String[] args) throws Exception {
        String file= "D:\\Home Work\\Java SE05\\src\\main\\resources\\Task2";
        UniversClass uC=new UniversClass();
        uC.getKey(file);
    }

}
