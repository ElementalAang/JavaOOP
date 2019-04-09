package Lesson1.Cat;

public class main {
    public static void main(String[]args){
        Cat cat1=new Cat("Johny", "Grey", 5, 3.6);
        System.out.println(cat1.toString());
        cat1.hungry();
        cat1.voice();
        System.out.println("");

        Cat cat2=new Cat("Jacky", "Black", 2, 2.0);
        cat2.setName("Vasya");
        System.out.println(cat2.toString());
        cat2.run();
        System.out.println("");

        Cat cat3=new Cat("Maya", "Ashen", 6, 4.3);
        System.out.println(cat3.toString());
        cat3.lick();
        cat3.badAttitude();
        cat3.jump();
        cat3.lick();
    }
}
