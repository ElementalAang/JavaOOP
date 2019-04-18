package Lesson3;

import java.util.Arrays;
import Lesson3.FullGroupException;

public class Group {
    public Student[]students=new Student[10];

    public Group(Student[]students){
        this.students=students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void AddStudent(Student student){
            try {
                for (int i=0;i<students.length;i++){
                    if(students[i]==null){
                        students[i]=student;
                        System.out.println("Student" +student + "has succesfuly added to the group");
                        return;

                    } throw new FullGroupException();
                }
            }catch (FullGroupException e){
                System.out.println(e.getMessage());
            }
    }

    public void DelStudent(Student student){
        for (int i=0;i<students.length;i++){
            if (students[i]==student){
                students[i]=null;
                System.out.println("Student" +student + "has succesfuly deleted from the group");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    }

