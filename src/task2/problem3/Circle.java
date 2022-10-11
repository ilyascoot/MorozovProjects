package task2.problem3;

public class Circle {
    private Point cen;
    private double rad;

    public Circle(Point cen, double rad) {
        this.cen = cen;
        this.rad = rad;
    }

    public Point getCen() {
        return cen;
    }

    public void setCen(Point cen) {
        this.cen = cen;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public void moveCen(Point newPoint){
        cen = newPoint;
    }

    public String toString() {
        return "X: " + cen.getX() + "; Y: " + cen.getY() + "; Radius: " + rad;
    }
}
