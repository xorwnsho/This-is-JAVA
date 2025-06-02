package exception.sec06;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(3000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
