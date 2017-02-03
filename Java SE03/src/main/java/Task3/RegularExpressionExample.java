package Task3;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 02.02.2017.
 */
public class RegularExpressionExample {
    public static void main(String[] args) {
        FileReader file;
        Pattern pattern= Pattern.compile("\\([Р|р]ис\\u002E\\s*\\d+\\)");
        Pattern pattern1=Pattern.compile("(\\u002E+\\s*[\\u0430E-\\u044F\\u0410E-\\u042F]{1})");
        Matcher m,m1;
        String[] split;
        ArrayList<String>sentences=new ArrayList<String>();
        ArrayList<Integer>nums=new ArrayList<Integer>();
        int col=0;
        try{
            file=new FileReader("D:/Home Work/Java SE03/src/main/resources/text.txt");
            BufferedReader buffer=new BufferedReader(file);
            String line="";

            while (( line=buffer.readLine())!=null) {
                System.out.println(line);
                m=pattern.matcher(line);
                m1=pattern1.matcher(line);
                split=pattern1.split(line);
                for(int i=0;i<split.length;i++){
                    Matcher k=pattern.matcher(split[i]);
                    if(k.find()&&m1.find())
                    {
                        col=col+1;
                        System.out.println(m1.group(0).substring(m1.group(0).indexOf("\u002E")+1)+split[i]);
                    }

                }
                while(m.find()){
                    Integer num=Integer.parseInt(m.group(0).substring(m.group(0).indexOf("\u002E")+2,m.group(0).indexOf(")")));
                    nums.add(num);
                }
            }

            buffer.close();
            }catch(IOException e){
            System.out.println("Error of reading file");
        }
        System.out.println("Количество предложений с сссылками: "+col);
            for (int i=0;i<nums.size()-1;i++) {
                if (nums.get(i) > nums.get(i + 1))
                System.out.println("Автор не ссылается на рисунки последовательно");
            }
    }
}
