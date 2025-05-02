package homework_5;

import java.util.Scanner;

public class ATM {
    String count20;
    String count50;
    String count100;
    String amountATM;

    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму пополнения банкомата: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int addMoneyAmount = scanner.nextInt();
                int amount = Integer.parseInt(amountATM);
                if (addMoneyAmount >= 1) {
                    amount += addMoneyAmount;
                    System.out.println("Банкомат пополнен на: " + addMoneyAmount + " RUB");
                    amountATM = String.valueOf(amount);
                    break;
                } else {
                    System.out.println("Сумма пополнения не может быть меньше 1");
                    System.out.print("Введите сумму пополнения банкомата: ");
                }
            } else {
                System.out.println("Ошибка ввода данных");
                System.out.print("Введите сумму пополнения банкомата: ");
                scanner.next();
            }
        }
    }

    public boolean giveMoney(String countMoney) {
        if (Integer.parseInt(countMoney) <= Integer.parseInt(amountATM) && Integer.parseInt(countMoney) > 19) {
            int countGiven100 = 0;
            int countGiven50 = 0;
            int countGiven20 = 0;
            int money = Integer.parseInt(countMoney);
            while (money > 0) {
                if (money / 100 > 0) {
                    countGiven100++;
                    money -= 100;
                } else if (money / 50 > 0) {
                    countGiven50++;
                    money -= 50;
                } else if (money / 20 > 0) {
                    countGiven20++;
                    money -= 20;
                } else {
                    money = 0;
                }
            }
            System.out.println("Выдано купюр номиналом 100: " + countGiven100);
            System.out.println("Выдано купюр номиналом 50: " + countGiven50);
            System.out.println("Выдано купюр номиналом 20: " + countGiven20);
            return true;
        } else {
            return false;
        }
    }

    public ATM(String count100, String count50, String count20) {
        this.count100 = count100;
        this.count50 = count50;
        this.count20 = count20;
        this.amountATM = String.valueOf(Integer.parseInt(count100) * 100 +
                Integer.parseInt(count50) * 50 +
                Integer.parseInt(count20) * 20);
    }
}
