package TestNumber26;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable resultMail = mail;
        for (MailService value : mailServices) {
            resultMail = value.processMail(resultMail);
        }
        return realMailService.processMail(resultMail);
    }
}
