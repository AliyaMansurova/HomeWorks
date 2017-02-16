package Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;
        Integer countOfWords = 0;
        String fileOut = "D:\\Home Work\\Java SE04\\src\\main\\resources\\outFile.txt";
        String fileIn = "D:\\Home Work\\Java SE04\\src\\main\\resources\\inFile.txt";
        List<String> keyWords = Arrays.asList("abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const", "continue", "default", "double", "do", "else",
                "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
                "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short",
                "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
                "volatile", "while");
        List<byte[]> wordsForWrite = new ArrayList<>();
        try {
            inFile = new FileInputStream(fileIn);
            System.out.println("Файл открыт для чтения");
            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable + " байт");
            byte[] bytesReaded = new byte[bytesAvailable];
            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println("Считано: " + count + " байт");
            String byteToString = new String(bytesReaded);
            for (String word : keyWords) {
                if (byteToString.contains(word)) {
                    wordsForWrite.add(word.getBytes());
                }
            }

            outFile = new FileOutputStream(fileOut);
            System.out.println("Файл открыт для записи");
            for (byte[] b : wordsForWrite) {
                outFile.write(b);
                outFile.write("\n".getBytes());
                countOfWords++;
            }
            outFile.write("Количество слов:".getBytes());
            outFile.write(countOfWords.toString().getBytes());
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
