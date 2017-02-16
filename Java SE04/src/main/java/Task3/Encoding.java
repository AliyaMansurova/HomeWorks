package Task3;

import sun.text.normalizer.UTF16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encoding {
    public static void main(String[] args) {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;
        String fileIn = "D:\\Home Work\\Java SE04\\src\\main\\resources\\Task3UTF8.txt";
        String fileOut = "D:\\Home Work\\Java SE04\\src\\main\\resources\\Task4UTF16.txt";
        try {
            inFile = new FileInputStream(fileIn);
            int bytesAvailable = inFile.available();
            byte[] bytesReaded = new byte[bytesAvailable];
            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            String byteToString = new String(bytesReaded);
            outFile = new FileOutputStream(fileOut);
            outFile.write(byteToString.getBytes("UTF16"));
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл: " + fileIn);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }
                outFile.close();
            } catch (IOException e) {
            }
        }

    }
}
