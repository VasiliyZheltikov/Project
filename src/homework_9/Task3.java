package homework_9;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    private static String[] mass;

    public static void main(String[] args) {
        Task3.setMass(new String[]{"a", "b", "a", "c", "b", "d", "e", "f", "e"});
        displayPluralitySign(Task3.getMass());
    }

    public static String[] getMass() {
        return mass;
    }

    public static void setMass(String[] mass) {
        Task3.mass = mass;
    }

    public static void displayPluralitySign(String[] mass) {
        Map<String, Boolean> result = new HashMap<>();
        String element;
        for (int i = 0; i < mass.length; i++) {
            element = mass[i];
            boolean sign = false;
            if (result.containsKey(element)) {
                continue;
            } else {
                for (int j = i + 1; j < mass.length; j++) {
                    if (result.containsKey(element)) {
                        break;
                    } else if (element.equals(mass[j])) {
                        sign = true;
                        break;
                    }
                }
                result.put(element, sign);
            }
        }
        System.out.println(result);
    }
}