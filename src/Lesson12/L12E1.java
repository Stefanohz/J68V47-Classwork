package Lesson12;

public class L12E1 {

    public static void displayStudent(Student thisStudent){
        System.out.format("(%d) %s %s %n",thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        // create student object and display
        Student student1 = new Student();
        displayStudent(student1);
        // update values of student object and display

    }
}