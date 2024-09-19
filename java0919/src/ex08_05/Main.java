package ex08_05;

import ex08_05.Student;

public class Main {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "유현주");
        Student Kim = new Student(2019206028, "박현경");
        Student Lee = new Student(2019153237, "윤이나");

        System.out.printf("Student 객체의 수 : %d", Student.count);
    }
}
