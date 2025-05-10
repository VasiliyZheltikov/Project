package homework_6;

public class Therapist extends Doctor {
    @Override
    public void toTreat() {
        System.out.println("Терапевт лечит простуду");
    }

    public String assignDoctor(int treatmentPlan) {
        System.out.print("Пациенту назначен врач: ");
        if (treatmentPlan == 1) {
            System.out.println("хирург");
            Surgeon surgeon = new Surgeon();
            surgeon.toTreat();
            return "хирург";
        } else if (treatmentPlan == 2) {
            System.out.println("дантист");
            Dentist dentist = new Dentist();
            dentist.toTreat();
            return "дантист";
        } else {
            System.out.println("терапевт");
            Therapist therapist = new Therapist();
            therapist.toTreat();
            return "терапевт";
        }
    }
}
