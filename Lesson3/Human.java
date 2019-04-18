package Lesson3;

public class Human {
    private int age;
    private String name;
    private String surname;
    private String sex;
    private double height;
    private double weight;
    private String race;
    private String hairColor;

    public Human(int age, String name, String surname, String sex, double height, double weight, String race, String hairColor) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.hairColor = hairColor;
    }
    public Human(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void Information(){
        System.out.println("Name - " +name +
        "Surname - " +surname +
         "Age - " +age +
         "Sex - " + sex +
         "Height - " + height +
         "Weight - " + weight  +
          "Race - " +race +
          "Hair Color - " + hairColor);
    }
}


