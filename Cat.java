package Lesson1.Cat;

public class Cat {

   private String name;
   private String color;
   private int age;
   private double weight;
   Cat(String name, String color,int age, double weight ){
this.name=name;
this.color=color;
this.age=age;
this.weight=weight;
}
void voice(){
    System.out.println("Meow-meow");
}
void hungry(){
    System.out.println("MEEEEEEEEEEEEEEOW");
}
void jump(){
       System.out.println("JUMP ON FACE");
}

void badAttitude(){
       System.out.println("Hate every guests");
    }
void run(){
    System.out.println("Run like a crazy");
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}
public int getAge(){
    return age;
}
public double getWeight(){
    return weight;
}
public void setWeight(double weight){
    this.weight=weight;
}
public String toString(){
       return "Cat " +
               "name = " + name + "; "
               + "age = " + age + "; "
               + "color = " + color + "; "
               + "weight = " + weight;
}
}


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
