package org.example.anonimous_inner_class;

public abstract class Animal {
    private String name;

    public abstract void move();
    public abstract void eat();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void drink() {
        System.out.println("drinking.....");
    }


}
