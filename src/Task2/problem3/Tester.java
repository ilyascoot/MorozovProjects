package Task2.problem3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        int colvo;

        Scanner in = new Scanner(System.in);

        colvo = in.nextInt();

        for (int i = 0; i < colvo; i++){
            Point point1 = new Point (i*1.2, i*1.4);
            Circle circle1 = new Circle(point1, i+1.2);
            circles.add(circle1);
        }
        for (int i = 0; i < colvo; i++){
            System.out.println(circles.get(i).toString());
        }
        System.out.println();
        for (int i = 0; i < colvo; i++){
            Point point2 = new Point(i+3,i+5);
            circles.get(i).moveCen(point2);
            System.out.println(circles.get(i).toString());
        }
    }
}