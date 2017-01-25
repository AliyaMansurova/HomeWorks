package Task2;
import java.util.Scanner;
/**
 * Created by User on 29.12.2016.
 */
public class Cycles1 {

    public static void main(String[] args) {
        double eps;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите значение eps:");
        eps=Double.parseDouble(scanner.nextLine());
        int k=minNumberOfN(eps);
        System.out.println("Минимальный номер элемента:"+k);
    }
    private static int minNumberOfN(double eps) {
        double a;
        int n = 1;
        if (eps > 0.25) {
            System.out.println("Значение а всегда меньше е");
            return 0;
        } else {
            if (eps == 0.25) {
                return 2;
            } else {
                do {
                    a = 1 / Math.pow(++n, 2);
                }
                while (a >= eps);
                return n;
            }
        }
    }
}
