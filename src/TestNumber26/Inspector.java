package TestNumber26;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
        MailPackage mailPackage = (MailPackage) mail;
        if (mailPackage.getContent().getContent().contains("WEAPONS") ||
                mailPackage.getContent().getContent().contains("BANNED_SUBSTANCE")) {
            throw new IllegalPackageException();
        }
        if (mailPackage.getContent().getContent().contains("stones")) {
            throw new StolenPackageException();
        }
        return mailPackage;
    }
}
