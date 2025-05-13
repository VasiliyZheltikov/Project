package homework_6_1;

public class Surgeon extends Doctor {
    @Override
    public void toTreat() {
        System.out.println("Хирург лечит ушибы");
    }
}
