package homework_student_management_system;

public class Subject {
    private String title;
    private Lecturer lecturer;

    public Subject(String title, Lecturer lecturer) {
        this.title= title;
        this.lecturer = lecturer;

    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", lecturer=" + lecturer +
                '}';
    }
}
