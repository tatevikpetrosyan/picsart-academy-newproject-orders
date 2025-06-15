package org.example.enumHomework;

public enum     Season {
    WINTER("7"),
    SPRING("15"),
    SUMMER("28"),
    AUTUMN("22");

    private String temp;
    Season(String temp) {
        this.temp = temp;
    }

    public String getAverageTemp() {
        return this.temp;
    }
}
