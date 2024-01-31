public class BankServiceImpl implements BankService{


    @Override
    public Double addFundsToAccount(Account accountObj, Double amount) throws AccountException{
        if(accountObj == null){
//            System.out.println("amount cant be null");
//            return null;
            throw new AccountException("account cant be null");
        }
        if(amount < 0){
//            System.out.println("Amount should be >=1 Rs. ");
//            return null;
            throw new AccountException("Amount should be >=1 Rs.");
        }
        accountObj.setBalance(accountObj.getBalance()+amount);
        return accountObj.getBalance();

    }

    @Override
    public Double withdrawFundsFromAccount(Account account, Double amount) throws AccountException {
        if(account == null){
//            System.out.println("amount cant be null");
//            return null;
            throw new AccountException("account cant be null");

        }
        if(amount <0){
//            System.out.println("Amount cant be negative ");
//            return null;
            throw new AccountException("account cant be negative");
        }
        account.setBalance(account.getBalance()-amount);
        return account.getBalance();

    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount) {
        if(fromAccount == null || toAccount==null){
            System.out.println("amount cant be null");
            return null;
        }
        if(amount <fromAccount.getBalance()){
            System.out.println("Amount cant be negative ");
            return null;
        }
        fromAccount.setBalance(fromAccount.getBalance()+amount);
        toAccount.setBalance(toAccount.getBalance()-amount);
    }

    @Override
    public void displayAccountInfo() {

    }
}
