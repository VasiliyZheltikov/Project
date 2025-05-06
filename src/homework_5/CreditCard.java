package homework_5;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    String accountNumber = "";
    String accountAmount;

    public void topUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму пополнения кредитной карты " + accountNumber + ": ");
        while (true) {
            if (scanner.hasNextInt()) {
                int topUpAmount = scanner.nextInt();
                int amount = Integer.parseInt(accountAmount);
                if (topUpAmount >= 1) {
                    amount += topUpAmount;
                    System.out.println("Счёт пополнен на: " + topUpAmount + " RUB");
                    accountAmount = String.valueOf(amount);
                    break;
                } else {
                    System.out.println("Сумма пополнения не может быть меньше 1");
                    System.out.print("Введите сумму пополнения кредитной карты: ");
                }
            } else {
                System.out.println("Ошибка ввода данных");
                System.out.print("Введите сумму пополнения кредитной карты: ");
                scanner.next();
            }
        }
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму снятия со счёта кредитной карты " + accountNumber + ": ");
        int amount = Integer.parseInt(String.valueOf(accountAmount));
        while (true) {
            if (scanner.hasNextInt()) {
                int withdrawAmount = scanner.nextInt();
                if (withdrawAmount >= 1 && amount >= withdrawAmount) {
                    amount -= withdrawAmount;
                    System.out.println("Со счёта снято: " + withdrawAmount + " RUB");
                    accountAmount = String.valueOf(amount);
                    break;
                } else if (withdrawAmount < 1) {
                    System.out.println("Сумма снятия не может быть меньше 1");
                } else if (Integer.parseInt(String.valueOf(amount)) < withdrawAmount) {
                    System.out.println("На Вашем счёте недостаточно средств, проверьте баланс");
                    System.out.print("Введите сумму снятия со счёта кредитной карты: ");
                }
            } else {
                System.out.println("Ошибка ввода данных");
                System.out.print("Введите сумму снятия со счёта кредитной карты: ");
                scanner.next();
            }
        }
    }

    public void getInfoAboutAccount() {
        System.out.println("На счету кредитной карты № " + accountNumber + " находится " + accountAmount + " RUB");
    }

    public CreditCard(String accountAmount) {
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int number = random.nextInt(10);
            accountNumber += String.valueOf(number);
        }
        this.accountAmount = accountAmount;
        System.out.println("Выдана кредитная карта № " + accountNumber + " с лимитом " + accountAmount);
    }
}
