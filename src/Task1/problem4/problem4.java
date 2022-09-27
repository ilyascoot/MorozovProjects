package Task1.problem4;
import java.util.Scanner;

public class problem4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.println("Введите размер массива");
        size = in.nextInt();
        int[] mass = new int[size];
        System.out.println("Введите числа массива");
        for(int i = 0; i<size; i++)
        {
            mass[i] = in.nextInt();
        }
        int k=0,j=0;
        int sum=0, sum1=0;
        while (k<size)
        {
            sum+=mass[k];
            k++;
        }
        do {
           sum1+=mass[j];
           j++;
        }
        while (j<size);
        int max=0, min=999999999;
        for(int i=0;i<size;i++)
        {
            if (mass[i]>max)
            {
                max=mass[i];
            }
            if (mass[i]<min)
            {
                min=mass[i];
            }
        }
        System.out.println("Сумма массива с использованием while: " + sum);
        System.out.println("Сумма массива с использованием do while: " + sum1);
        System.out.println("Минимальное число массива: " + min);
        System.out.println("Максимальное число массива: " + max);
    }
}
