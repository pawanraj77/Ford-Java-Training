public class Client {
    public static void main(String[] args){
        Account firstAccount = new Account(1, "ford", 5000.0);

        BankService bankService = new BankServiceImpl();
        System.out.println(firstAccount);
        try {
            Double newBalance = bankService.addFundsToAccount(firstAccount, 750.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(firstAccount);
        try {
            bankService.addFundsToAccount(null, -750.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.addFundsToAccount(firstAccount, 750.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.withdrawFundsFromAccount(firstAccount, 1500.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(firstAccount);

    }
}
