package TestNumber29;

public class Salary implements SendMail<Integer> {
    private String from;
    private String to;
    private int content;

    public Salary(String from, String to, int content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public Integer getContent() {
        return content;
    }
}
