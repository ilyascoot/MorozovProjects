package Task1.problem7;

import java.util.Scanner;

public class problem7 {
    public static int fact(int a) {
        int rez=1;
        for (int i=1;i<=a;i++) {
            rez *= i;
        }
        return rez;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int rez1;
        rez1 = fact(a);
        System.out.println("Факториал числа "+ a + " равен: "+ rez1);
    }
}
