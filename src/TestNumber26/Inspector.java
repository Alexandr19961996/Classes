package TestNumber26;

import static TestNumber26.Test.BANNED_SUBSTANCE;
import static TestNumber26.Test.WEAPONS;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        MailPackage mailPackage = (MailPackage) mail;
        if (mailPackage.getContent().getContent().contains(WEAPONS) ||
                mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE)) {
            throw new IllegalPackageException();
        }
        if (mailPackage.getContent().getContent().contains("stones")) {
            throw new StolenPackageException();
        }
        return mailPackage;
    }
}
