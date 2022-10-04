package Task2.problem2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(3,5);
        System.out.println("Координаты мяча(x,y): "+ ball.getX() + "   " + ball.getY());
        ball.setX(5);
        ball.setY(4);
        System.out.println("Новые координаты мяча(x,y): "+ ball.getX() + "   " + ball.getY());
        ball.setXY(10,10);
        System.out.println("Новые координаты мяча(x,y): "+ ball.getX() + "   " + ball.getY());
        ball.move(+5,-2);
        System.out.println(ball.toString());
    }
}
