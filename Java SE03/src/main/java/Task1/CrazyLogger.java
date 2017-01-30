package Task1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.*;
import java.util.Formatter;
import java.util.Calendar;
/**
 * Created by User on 27.01.2017.
 */
public class CrazyLogger {
    private static Logger log = Logger.getLogger(CrazyLogger.class.getName());
    private static StringBuilder logStr;

    public CrazyLogger() {
        logStr=new StringBuilder();
    }

    public static StringBuilder getLogStr() {
        return logStr;
    }

    public static void setLogStr(StringBuilder logStr) {
        CrazyLogger.logStr = logStr;
    }

    public void addLog(Level level,String msg){
        log.log(level,msg);
        LocalDateTime today = LocalDateTime.now();
        Formatter formatter=new Formatter();
        formatter.format("%td-%tm-%tY:%tH-%tM-",today,today,today,today,today);
        logStr.append(formatter+msg+"\n");
    }

   public void search(String s){
        int index;
        StringBuilder logStr2=new StringBuilder();
        String result=new String();
        logStr2=logStr;
        index=logStr2.indexOf(s);
        if (index<0){System.out.println("Not Found");}
        while (index>0){
           logStr2=logStr2.deleteCharAt(index);
           result=("index of "+s+"="+index+"\n");
           index=logStr2.indexOf(s);
           System.out.print(result);
       }
    }
    public String show()
    {
        return logStr.toString();
    }

}
