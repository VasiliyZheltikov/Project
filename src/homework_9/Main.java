package homework_9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Кошка");
        animals.add("Собака");
        animals.add("Птичка");
        animals.add("Рыбка");
        animals.add("Хомячок");
        Animals.setAnimals(animals);
        Animals.addAnimal("Птичка", animals);
        Animals.deleteAnimal("Птичка", animals);
    }
}
