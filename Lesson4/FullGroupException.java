package Lesson4.Lesson4;

public class FullGroupException extends Exception {
    @Override
    public String getMessage(){
        return "Error. Cannot add student because the group is full";
    }
}
