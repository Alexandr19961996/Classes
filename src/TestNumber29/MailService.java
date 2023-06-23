package TestNumber29;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<SendMail<T>> {
    private Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new Map<>();
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(SendMail<T> tSendMail) {
        mailBox.computeIfAbsent(tSendMail.getTo(), k -> new ArrayList<>()).add(tSendMail.getContent());
    }

    private static class Map<K, V> extends HashMap<K, V> {
        @Override
        public V get(Object key) {
            return (super.get(key) == null) ? (V) new ArrayList<>() : super.get(key);
        }
    }
}

