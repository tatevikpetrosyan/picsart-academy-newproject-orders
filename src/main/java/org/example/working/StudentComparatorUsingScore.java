package org.example.working;

import java.util.Comparator;

public class StudentComparatorUsingScore implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.score-o2.score;
    }
}
