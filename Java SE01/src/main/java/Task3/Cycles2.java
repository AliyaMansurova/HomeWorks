package Task3;
import java.util.Scanner;
/**
 * Created by User on 29.12.2016.
 */
public class Cycles2 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите значение a:");
        a=Double.parseDouble(scanner.nextLine());
        System.out.println("Введите значение b:");
        b=Double.parseDouble(scanner.nextLine());
        System.out.println("Введите значение h:");
        h=Double.parseDouble(scanner.nextLine());
        if (a > b)
            System.out.println("Некорректное условие");
        else {
            while (a <= b) {
                double k = Function(a);
                System.out.printf("x="+a+"\t"+"F(x)="+k+"\n");
                a=a+h;
            }
        }
    }
    private static double Function(double x) {

        return( Math.tan(Math.toRadians(2*x))-3);
    }
}
