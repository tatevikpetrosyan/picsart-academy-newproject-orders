package homework_student_management_system;

import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    public Map<String, Integer> subjectScores;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
        this.subjectScores = new HashMap<>();
    }

    public String getName () {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addScore(String subject, int score) {
        subjectScores.put(subject, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjectScores=" + subjectScores +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}
