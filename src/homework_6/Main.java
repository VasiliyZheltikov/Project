package homework_6;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "");
        Patient patient2 = new Patient(2, "");
        Patient patient3 = new Patient(3, "");

        Therapist therapist = new Therapist();
        patient1.doctor = therapist.assignDoctor(patient1.treatmentPlan);
        patient2.doctor = therapist.assignDoctor(patient2.treatmentPlan);
        patient3.doctor = therapist.assignDoctor(patient3.treatmentPlan);
    }
}
