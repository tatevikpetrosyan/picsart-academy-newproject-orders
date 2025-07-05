package functional_interface;

public class Human {
    private String name;
    private int age;

    Human(String name) {
        this.name = name;
    }
    Human(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return getName();
    }
}
