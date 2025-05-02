package homework_5;

public class Main {

    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard("10000");
        CreditCard creditCard2 = new CreditCard("20000");
        CreditCard creditCard3 = new CreditCard("30000");

        creditCard1.topUp();
        creditCard2.topUp();
        creditCard3.withdraw();

        creditCard1.getInfoAboutAccount();
        creditCard2.getInfoAboutAccount();
        creditCard3.getInfoAboutAccount();
    }
}
