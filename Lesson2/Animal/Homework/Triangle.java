package Lesson2.Animal.Homework;


public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr (){
        return Point.length(a,b)+Point.length(b,c)+Point.length(a,c);
    }
    @Override
    public double getArea(){
        double per=(Point.length(a,b)+ Point.length(b,c)+Point.length(a,c))/2;
        return Math.sqrt(per*(per-Point.length(a,b)*(per-Point.length(b,c))*(per-Point.length(a,c))));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
