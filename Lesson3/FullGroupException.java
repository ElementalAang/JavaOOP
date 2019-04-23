package Lesson3;

public class FullGroupException extends Exception {
    public String getMessage(){
        return "Error. Cannot add student because the group is full";
    }
}
