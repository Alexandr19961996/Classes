package TestNumber4;

public class Test {
    public static void main(String[] args) {
        BankClient bankClient = new BankClient();
        BankWorker bankWorker = new BankWorker() {
            @Override
            public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
                String resultOfCheck = null;
                switch (resultOfCheck) {
                    case "Кредит одобрен" -> {
                        return true;
                    }
                    case "Плохая кредитная история" -> throw new BadCreditHistoryException();
                    case "Проблемы с законом" -> throw new ProblemWithLawException();
                }
                return false;
            }
        };
    }

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException e) {
            return false;
        }
        return false;
    }
}
