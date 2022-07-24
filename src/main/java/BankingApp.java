import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Hi! Good to see you.");
        account.createAccount();
        int option;
        do {
            System.out.println("What would you like to do? \n 1.Your account information. \n 2. New deposit. \n 3. New withdrawal. \n 4. Exit ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    account.showAccount();

                    break;
                case 2:
                    account.depo();
                    break;


            }
        }
        while (option != 4);
    }


}
