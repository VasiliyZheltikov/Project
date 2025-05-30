package homework_9;

import java.util.ArrayList;

public class Animals {

    private static ArrayList<String> animals = new ArrayList<>();

    public static ArrayList<String> getAnimals() {
        return animals;
    }

    public static void setAnimals(ArrayList<String> animals) {
        Animals.animals = animals;
    }

    public static void addAnimal(String animal, ArrayList<String> animals) {
        animals.addFirst(animal);
    }

    public static void deleteAnimal(String animal, ArrayList<String> animals) {
        animals.remove(animals.lastIndexOf(animal));
    }
}
