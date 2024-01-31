public interface BankService {
    Double addFundsToAccount(Account accountObj, Double amount) throws AccountException;
    Double withdrawFundsFromAccount(Account account, Double amount) throws AccountException;
    Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount);
    void displayAccountInfo();
}
