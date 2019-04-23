package Lesson4.Homework;

public class FullGroupException extends Exception {
    @Override
    public String getMessage(){
        return "Error. Cannot add student because the group is full";
    }
}
