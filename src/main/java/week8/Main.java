package week8;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student first = new Student("1", "Paul");
        students.add(first);
        Students.add(new Student("2","John"));

        for(Student s: students) {
            System.out.println("Details of Student "+ s);
        }

    }
}