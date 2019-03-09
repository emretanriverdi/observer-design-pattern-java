

public class Student implements Observer {

    private String studentName;

    Student(String studentName) {
        this.studentName = studentName;
    }

    public void update(String courseName) {
        System.out.println(courseName + " is available to select by " + studentName);
    }
}