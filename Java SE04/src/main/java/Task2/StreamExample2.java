package Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        FileReader fr;
        FileWriter fw;
        BufferedReader br=null;
        BufferedWriter bw=null;
        Integer countOfWords = 0;
        String fileOut = "D:\\Home Work\\Java SE04\\src\\main\\resources\\outFile2.txt";
        String fileIn = "D:\\Home Work\\Java SE04\\src\\main\\resources\\inFile.txt";
        List<String> keyWords = Arrays.asList("abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const", "continue", "default", "double", "do", "else",
                "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
                "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short",
                "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
                "volatile", "while");
        List<String> wordsForWrite=new ArrayList<>();
        StringBuilder key=new StringBuilder();
        try {
            fr = new FileReader(fileIn);
            fw=new FileWriter(fileOut);
            br = new BufferedReader(fr);
            bw=new BufferedWriter(fw);
            String s;
            while ((s = br.readLine()) != null) {
                key.append(s);
            }
            String m=key.toString();
            for (String word : keyWords) {
                if (m.contains(word)) {
                    wordsForWrite.add(word);
                }
            }
            for(String word:wordsForWrite) {
                System.out.println(word);
                bw.write(word);
                bw.write("\n");
                countOfWords++;
            }
            bw.write("Количество слов:"+countOfWords);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                bw.close();
            } catch (IOException e) {
            }
        }
    }
}
