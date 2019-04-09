package Lesson1.Cat.Triangle;


public class Triangle {
    private double osnovanie;
    private double bokStorona1;
    private double bokStorona2;

    Triangle(double osnovanie, double bokStorona1, double bokStorona2){
        this.osnovanie=osnovanie;
        this.bokStorona1=bokStorona1;
        this.bokStorona2=bokStorona2;
    }

    public double getOsnovanie() {
        return osnovanie;
    }

    public void setOsnovanie(double osnovanie) {
        this.osnovanie = osnovanie;
    }

    public double getBokStorona1() {
        return bokStorona1;
    }

    public void setBokStorona1(double bokStorona1) {
        this.bokStorona1 = bokStorona1;
    }

    public double getBokStorona2() {
        return bokStorona2;
    }

    public void setBokStorona2(double bokStorona2) {
        this.bokStorona2 = bokStorona2;
    }

    public double ar() {
        double hp = (osnovanie + bokStorona1 + bokStorona2) / 2;
      double ar=Math.sqrt(hp*(hp-osnovanie)*(hp-bokStorona1)*(hp=bokStorona2));
      return ar;
    }
    public String toString(){
        return "Triangle{" +
                "Основание треугольника = " + osnovanie + ", " +
                "Боковая сторона 1 = " + bokStorona1 + ", " +
                "Боковая сторона 2 = " +bokStorona2;
    }
}


public class main {
    public static void main (String[]args){
        Triangle tr1=new Triangle(5.5, 3.2,3.0);
      Triangle tr2=new Triangle(4.0,3.0,2.0);

      System.out.println(tr1);
      System.out.println(tr2);

      String q1=String.format("%." + 3 + "f", tr1.ar());
      String q2=String.format("%." + 3 + "f", tr2.ar());
      System.out.println("Площадь треугольника tr1 = " + q1);
      System.out.println("Площадь треугольника tr2 = " + q2);
    }
}
