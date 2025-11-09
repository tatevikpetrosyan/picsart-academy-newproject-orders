package homework_student_management_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();
    static List<String> subjectList = new ArrayList<>();
    static List<String> lecturerList = new ArrayList<>();
    static boolean isActive = true;

    public static void main(String[] args) {
        //Նկարագրություն
        //Ստեղծեք ուսանողների կառավարման համակարգ, որը թույլ է տալիս՝
        //ավելացնել ուսանող,
        //խմբագրել ուսանողի տվյալները,
        //խմբագրել առարկաները
        //խմբագրել դասախոսերին
        //հաշվարկել միջին գնահատական ըստ առարկաների։
        //Պետք է օգտագործել
        //OOP,
        //List / ArrayList,
        //Comparator / Comparable ուսանողներին դասակարգելու համար,
        //Exception handling (օր.՝ եթե գնահատականը բացասական է),

        while (isActive) {
            System.out.println("Type 1 for creating student");
            System.out.println("Type 2 for editing student details");
            System.out.println("Type 3 for add subjects and lecturers");
            System.out.println("Type 4 for editing subjects");
            System.out.println("Type 5 for editing lecturers");
            System.out.println("Type 6 for assign a score to student");
            System.out.println("Type 7 for calculating student average score");
            System.out.println("Type 8 for exit system");

            String input = scanner.nextLine();

            switch (input) {
                case "1": {
                    createStudent();
                }
                break;
                case "2":
                    editStudentDetails();
                    break;
                case "3":
                    addSubjectAndLecturer();
                    break;
                case "4":
                    editSubjects();

                    break;
                case "5":
                    editLecturers();

                    break;
                case "6":
                    try {
                        assignScore();
                    } catch (NegativeScoreException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "7":
                    calculateAverage();
                    break;
                case "8":
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void createStudent() {

        System.out.println("Type student name");
        String name = scanner.nextLine();
        System.out.println("Type student age");
        int age = scanner.nextInt();
        scanner.nextLine();
        Student st = new Student(name, age);
        studentList.add(st);
        System.out.println("Student created");
        Collections.sort(studentList);
        System.out.println(studentList);

    }

    public static void editStudentDetails() {
        System.out.println("Type student name for editing");
        String name = scanner.nextLine();
        boolean found = false;

        for (Student st : studentList) {

            if (st.getName().equals(name)) {
                System.out.println("Type N for editing name");
                System.out.println("Type A for editing age");
                String input1 = scanner.nextLine();
                switch (input1) {
                    case "N":
                        System.out.println("Type new name");
                        st.setName(scanner.nextLine());
                        break;
                    case "A":
                        System.out.println("Type new age");
                        st.setAge(scanner.nextInt());
                        scanner.nextLine();
                        break;
                    default:
                        System.out.println("Should be either N or A");
                }
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Type correct student name");

        }
    }

    public static void addSubjectAndLecturer() {
        System.out.println("Type Subjects with spaces");
        String titles = scanner.nextLine();
        String[] splittedTitles = titles.split(" ");
        for (String title : splittedTitles) {
            subjectList.add(title);
        }
        System.out.println("Type Lecturers with spaces");
        String lecturers = scanner.nextLine();
        String[] splittedLecturers = lecturers.split(" ");
        for (String i : splittedLecturers) {
            lecturerList.add(i);
        }

    }

    public static void editSubjects() {
        System.out.println("All subject list");
        for (int i = 0; i < subjectList.size(); i++) {
            System.out.println((i) + ". " + subjectList.get(i));
        }

        System.out.println("Enter subject number to edit");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new subject name");
        String newSubject = scanner.nextLine();
        subjectList.set(number, newSubject);
        System.out.println("Subject updated");

    }

    public static void editLecturers() {
        System.out.println("All lecturers list");
        for (int i = 0; i < lecturerList.size(); i++) {
            System.out.println((i) + ". " + lecturerList.get(i));
        }

        System.out.println("Enter number to edit");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new lecturer name");
        String newLecturer = scanner.nextLine();
        lecturerList.set(number, newLecturer);
        System.out.println("Lecturer updated");
    }

    public static void assignScore() throws NegativeScoreException {
        System.out.println("Student name");
        String name = scanner.nextLine();
        System.out.println("Subject");
        String subject = scanner.nextLine();
        System.out.println("type a score");
        int score = scanner.nextInt();
        scanner.nextLine();
        if (score < 0) {
            throw new NegativeScoreException("Score should be from 0 to 100");
        }
        for (Student st : studentList) {
            if (st.getName().equals(name)) {
                st.addScore(subject, score);
            }
        }

    }

    public static void calculateAverage() {
        System.out.println("Student name");
        String name = scanner.nextLine();
        int avg = 0;
        for (Student st : studentList) {
            if (st.getName().equals(name)) {
                int sum = 0;
                for (int score : st.subjectScores.values()) {
                    sum = sum + score;
                }
                int count = st.subjectScores.size();
                avg = sum / count;

            }

        }
        System.out.println("Average score is " + avg);
    }

}
