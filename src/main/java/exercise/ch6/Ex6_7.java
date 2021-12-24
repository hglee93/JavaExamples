package exercise.ch6;

class MyPoint {

    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
}
public class Ex6_7 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}
