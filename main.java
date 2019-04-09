package Lesson1.Cat.Triangle;



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
