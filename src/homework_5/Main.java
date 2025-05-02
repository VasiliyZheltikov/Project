package homework_5;

public class Main {

    public static void main(String[] args) {
// ЗАДАНИЕ № 1
        CreditCard creditCard1 = new CreditCard("10000");
        CreditCard creditCard2 = new CreditCard("20000");
        CreditCard creditCard3 = new CreditCard("30000");

        creditCard1.topUp();
        creditCard2.topUp();
        creditCard3.withdraw();

        creditCard1.getInfoAboutAccount();
        creditCard2.getInfoAboutAccount();
        creditCard3.getInfoAboutAccount();

// ЗАДАНИЕ № 2
        ATM atm = new ATM("0", "0", "0");
        atm.addMoney();
        System.out.println("Успешность выполнения операции " + atm.giveMoney("172"));
    }
}
