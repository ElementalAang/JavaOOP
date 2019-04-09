package Lesson1.Cat;

public class Cat {

    String name;
   String color;
   int age;
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
void lick(){
       System.out.println("Lick my face");
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
