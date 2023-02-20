package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random rnd = new Random();
        String valuation;
        int val = rnd.nextInt(4) + 2;

        switch (val) {
            case 2:
                valuation = "неудовлетворительно";
                break;
            case 3:
                valuation = "удовлетворительно";
                break;
            case 4:
                valuation = "хорошо";
                break;
            case 5:
                valuation = "отлично";
                break;
            default:
                valuation = "it is not defined";
        }


        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.", this.name, student.getName(), this.subject, valuation);

    }
}
