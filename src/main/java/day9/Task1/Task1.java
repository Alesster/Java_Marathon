package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Kim Pupkin", "Art group");
        Teacher teacher = new Teacher("Vasilisa Varum", "Art of flight");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
