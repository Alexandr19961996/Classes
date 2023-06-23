package TestNumber29;

public interface SendMail<T> {
    String getFrom();

    String getTo();

    T getContent();
}
