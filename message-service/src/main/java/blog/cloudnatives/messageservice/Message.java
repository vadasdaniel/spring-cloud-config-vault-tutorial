package blog.cloudnatives.messageservice;

public class Message {
    private final int id;
    private final String subject;
    private final String text;

    public Message(int id, String subject, String text) {
        this.id = id;
        this.text = text;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public String getText() {
        return text;
    }
    public int getId() { return id; }
}
