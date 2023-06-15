package TestNumber26;

public class Thief implements MailService {
    private final int minimalCostIfPackage;
    private int stolenValue;

    public Thief(int minimalCostIfPackage) {
        this.minimalCostIfPackage = minimalCostIfPackage;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage mailPackage = (MailPackage) mail;
        if (mailPackage.getContent().getPrice() > minimalCostIfPackage) {
            stolenValue += mailPackage.getContent().getPrice();
            return new MailPackage(mail.getFrom(), mail.getTo(), new Package(("stones instead of " +
                    mailPackage.getContent().getContent()), 0));
        }
        return mailPackage;
    }
}
