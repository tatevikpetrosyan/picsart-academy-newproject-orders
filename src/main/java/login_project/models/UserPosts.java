package login_project.models;

public class UserPosts {
    private static int count = 0;
    private int id;
    private String content;
    private User writer;

    public UserPosts() {
        id = count + 1;
        count++;
    }

    public UserPosts (User writer, String content) {
        id = count + 1;
        count++;
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getWriter() {
        return writer;
    }

    public void setWriter(User writer) {
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserPosts{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", writer=" + writer +
                '}';
    }
}
