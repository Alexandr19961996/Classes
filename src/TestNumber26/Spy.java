package TestNumber26;

import java.util.logging.Level;
import java.util.logging.Logger;

import static TestNumber26.Test.AUSTIN_POWERS;

public class Spy implements MailService {
    public static Logger logger;

    public Spy(Logger logger) {
        Spy.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailMessage mailMessage = (MailMessage) mail;
        if (mail.getTo().equals(AUSTIN_POWERS)) {
            logger.log(Level.WARNING, "Detected target mail correspondence: from " +
                    mail.getFrom() + " to " + mail.getTo() + "\"" + mailMessage.getMessage() + "\"");
        } else {
            logger.log(Level.INFO, "Usual correspondence: from " +
                    mail.getFrom() + " to " + mail.getTo() + "\"" + mailMessage.getMessage() + "\"");
        }
        return mailMessage;
    }
}
