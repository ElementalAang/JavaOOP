package Lesson2.Animal.Homework;

public class Board {
    private Shape[] prt = new Shape[4];

    public Board() {
        super();
    }
    public void put(Shape shape){
        for(int i=0;i<prt.length;i++){
            if(prt[i]==null){
                prt[i]=shape;
                System.out.println("Shape " + shape.getClass().getSimpleName() + " was succesfully added to board");
                return;
            }
        }
    }
    public void delete(Shape shape){
        for(int i=0;i<prt.length;i++){
            if(prt[i]==shape){
                prt[i]=null;
                System.out.println("Shape " + shape.getClass().getSimpleName() + " was succesfully deleted from board");
                return;
            }
        }
    }
    public void info(){
        double TotalArea=0;
        System.out.println("Board has figures: ");
        for(Shape shape:prt){
            if(shape!=null){
                TotalArea+=shape.getArea();
                System.out.println(shape);
            }
        }
        System.out.println("Total area is:" + TotalArea);
    }
}

