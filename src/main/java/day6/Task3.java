package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Джон Смит", "Астрофизика");
        Student student = new Student("Фёдор Васечкин");

        teacher.evaluate(student);
    }
}
