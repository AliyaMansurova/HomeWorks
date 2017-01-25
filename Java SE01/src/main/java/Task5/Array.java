package Task5;
import java.util.Scanner;
/**
 * Created by User on 29.12.2016.
 */
public class Array {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        length=scanner.nextInt();
        int [][]a= new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i==j||j==length-1-i)
                    a[i][j]=1;
                else
                    a[i][j]=0;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
