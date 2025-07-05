package equals;

public class Equals {
    public static void main(String[] args) {
        Student student1 = new Student(1,"aaa", 20, 95, 5);
        Student student2 = new Student(2,"bbb",20,95,5);

        System.out.println(student1.equals(student2));

    }
}
