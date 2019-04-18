package Lesson2.Animal;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat(4, 8, true, "Milk", "Home");
        System.out.println(cat.getAge());

        System.out.println(cat.hashCode());
        cat.getVoice();

        System.out.println(cat);

        Animal an=cat;

        Animal[]zoo=new Animal[10];
        zoo[0]=cat;
    }
}