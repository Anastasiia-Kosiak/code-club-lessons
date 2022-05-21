package lesson.eleven;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setName("Vitalii");
        professor.setAge(34);
        professor.setSubject("Математика");
        // ---
        Student student = new Student();
        student.setName("Veronika");
        student.setAge(14);
        student.setAverageGrade(10.7);
        // абстрактиний клас - його об'єкти не можна створювати
        // абстрактний клас можна наслідувати
    }
}
