package org.example.working;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
}
