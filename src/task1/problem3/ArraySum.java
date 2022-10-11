package task1.problem3;
import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int size;
        System.out.println("Введите длину массива");
        size = in.nextInt();
        System.out.println("Введите числа массива");
        int[] mass = new int[size];
        double sum=0;
        for(int i=0; i<size;i++)
        {
            mass[i]=in.nextInt();
            sum+=mass[i];
        }
        double size1 = size;
        double sr=sum/size1;
        System.out.println("Сумма чисел равна: " + sum);
        System.out.println("Среднее арифметическое равно: "+ sr);
    }
}
