package Lesson3;

import java.util.Arrays;


public class Group {
    public Student[]students=new Student[10];
    public String groupName;

    public Group(Student[]students){
        this.students=students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws FullGroupException {
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
    public Student searchStudent(String surname){
        for (Student student : students){
            if (student!=null && student.getSurname().equals(surname)){
                return student;
            }
        }
        return null;
    }

    public void delStudent(long number){
        for (int i=0;i<students.length;i++){
            if (students[i]==null&&students[i].getStudentID()==number){
                students[i]=null;
                return;
            }
        }
    }

    public void sortStudents(){
        for(int i=0;i<students.length;i++){
            for(int j=i+1;j<students.length;j++){
                if (compareStudents(students[i],students[j])>0){
                    Student t=students[i];
                    students[i]=students[j];
                    students[j]=t;
                }
            }
        }
    }
    public int compareStudents(Student a, Student b){
        if(a!=null&&b==null){
            return 1;
        }
        if(a==null&&b==null){
            return 0;
        }
        if (a==null&&b!=null){
            return -1;
        }
        return a.getSurname().compareTo(b.getSurname());
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    }

