package equals;

public class Student {
    private int id;
    private String name;
    private int age;
    private int score;
    private int level;

    public Student(int id, String name, int age, int score, int level) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        return this.age == ((Student) obj).age && this.score == (((Student) obj).score);
    }
}
