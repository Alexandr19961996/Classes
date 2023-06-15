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
        Sendable result = null;
        for (MailService value : mailServices) {
            result = value.processMail(mail);
        }
        return getRealMailService().processMail(result);
    }
}
