package Lesson2.Animal.Homework;

public class main {
    public static void main(String[]args){
        Rectangle rectangle=new Rectangle(new Point(1.0,2.0), new Point(4.0, 3.0), new Point(4.3, 5.0), new Point(2.3, 4.5));
        Rectangle rectangleOne=new Rectangle(new Point(4.0,8.0), new Point(4.3, 2.0), new Point(4.9, 5.6), new Point(3.3, 4.4));
        Square square=new Square(new Point(5.4, 3.4), new Point(2.5, 2.3), new Point(5.4, 6.7), new Point(3.2, 1.5));
        Triangle triangle=new Triangle(new Point(3.4, 5.8), new Point(5.8, 9.0), new Point(6.8, 9.0));
        Triangle triangleOne=new Triangle(new Point(3.7, 6.8), new Point(8.8, 9.2), new Point(6.3, 9.1));



        Board board=new Board();
        board.put(rectangle);
        board.put(square);
        board.put(triangle);
        board.info();

        board.put(triangleOne);
        board.delete(rectangle);
        board.put(rectangleOne);
        board.info();
    }
}
