package task2_a;

import java.time.LocalDate;
import java.time.Period;

class Student {
    private String name;
    private LocalDate birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    public Student(String name, LocalDate birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Возраст: " + getAge() + ", Группа: " + group + ", ID: " + studentId + ", Средний балл: " + averageScore;
    }

    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Иван", LocalDate.of(2000, 5, 10), "CS101", 12345, 4.9);
        System.out.println(student1);
        System.out.println("Отличник: " + student1.isExcellentStudent());
    }
}
