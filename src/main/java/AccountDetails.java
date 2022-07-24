import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Please type your name.");
        name = scanner.next();
        System.out.println("Please prvide your account number");
        accountNumber = scanner.next();
        System.out.println("Please type your login");
        login = scanner.next();
        System.out.println("Current account balance");
        balance = scanner.nextLong();
    }

    public void showAccount() {
        System.out.println("Your account name is " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Your login name: " + login);
        System.out.println("Current account balance: " + balance);
    }
    public void depo(){
        System.out.println("State the amount of your new deposit:");
        long ammountadd;
        ammountadd = scanner.nextLong();
        balance = ammountadd + balance;
    }
    public void draw(){
        System.out.println("State the amoint of the withdrawal.");
        long ammountsub;
        ammountsub = scanner.nextLong();
        balance = balance - ammountsub;

    }
}

