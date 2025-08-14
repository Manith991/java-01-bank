import controller.AccountController;
import util.Singleton;

import java.util.Scanner;

public class Main {
    private static final AccountController controller = Singleton.getControllerInstance();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1. Create Account
                    2. Find Account by id
                    3. Transfer Money
                    4. View Transaction Details
                    0. Exit""");
            System.out.print("\uD83D\uDCA1 Enter an option: ");
            int op = Integer.parseInt(scanner.nextLine());

            if (op == 0) break;

            switch (op) {
                case 1 -> controller.createAccount();
                case 2 -> controller.findAccountById();
                case 3 -> controller.transferMoney();
                case 4 -> controller.showTransactionDetails();
                default -> System.out.println("Invalid option!");
            }
        }
    }
}


