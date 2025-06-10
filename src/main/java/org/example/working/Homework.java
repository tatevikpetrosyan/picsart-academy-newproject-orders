package org.example.working;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {
        //Խնդիր 1. Լիստի Բոլոր զույգ թվերի քառակուսիները վերադարձնել նոր ցուցակով
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,5,11,24,1,3,5,8,12,10,1));
        for (int i = 0; i < numbers.size(); i++) {
            int square = numbers.get(i) * numbers.get(i);
            numbers.set(i, square);
        }
        numbers.removeIf(n-> n%2 !=0);
        System.out.println(numbers);

        //Խնդիր 2. Դասավորել ուսանողներին ըստ գնահատականի
        System.out.println("___________");
        Student student3 = new Student("David", 95);
        Student student1 = new Student("Ani", 82);
        Student student2 = new Student("Tatev", 90);
        Student student4 = new Student("Aren", 70);
        Student student5 = new Student("Hayk", 55);
        Student student6 = new Student("Karen", 58);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println(students);
        Collections.sort(students, new StudentComparatorUsingScore());
        System.out.println(students);

        //Խնդիր 3. Գտնել միջին տարիքը հաճախորդների ցանկի
        System.out.println();
        System.out.println("_________________");
        ArrayList<Integer> customerAge = new ArrayList<>(Arrays.asList(18, 25, 30, 25, 28, 34, 35, 23, 45, 19, 21, 47, 31, 50));
        int count = 0;
        for ( int num : customerAge ) {
            count++;
        }
        int sum = 0;
        for (int i = 0; i < customerAge.size(); i++) {
            sum = sum + customerAge.get(i);
        }
        int averageAge = sum/count;
        System.out.println(averageAge);

        //Խնդիր 4. Ֆիլտրել և տպել այն ուսանողներին, ովքեր ունեն գնահատական > 85
        System.out.println();
        System.out.println("_________________");
        students.removeIf(student -> student.score<85);
        System.out.println(students);

        //Խնդիր 5. Ստուգել՝ արդյոք ուսանողների Լիստում կա  “David” անունով ուսանող
        System.out.println();
        System.out.println("_________________");
        for (Student student : students) {
            if (student.name.equals("David")) {
                System.out.println(student);
            }
        }
        //Խնդիր 6. Լիստից հեռացնել բոլոր ուսանողներին, ովքեր ստացել են 60-ից ցածր գնահատական
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        students1.add(student6);
        System.out.println();
        System.out.println("_________________");
        students1.removeIf(student -> student.score<60);
        System.out.println(students1);


        //Խնդիր 7. Վերադարձնել այն հաճախորդների ցուցակը, որոնց անունը սկսվում է “K”-ով
        System.out.println();
        System.out.println("_________________");
        ArrayList<String> customerNames = new ArrayList<>(Arrays.asList("David", "Ani", "Karen", "Kathrine", "Mari"));
        for ( String customerName : customerNames) {
            if (customerName.charAt(0) == 'K') {
                System.out.println(customerName);
            }
        }
    }
}
