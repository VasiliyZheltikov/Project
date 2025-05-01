package homework_4_tic_tac_toe;

import java.util.Objects;
import java.util.Scanner;

public class Tic_tac_toe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] game_field = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        int player = 1; // порядковый номер игрока
        boolean flag = false; // признак завершения игры
        int count; // кол-во совпадающших элементов в строке / столбце / диагонали
        int input;
        while (!flag) {
            System.out.print("Введите номер столбца и строки в формате XX (столбец, строка): ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                int column = input / 10 - 1;
                int line = input % 10 - 1;
                if (column > 2 || column < 0 || line > 2 || line < 0) {
                    System.out.println("Ошибка ввода данных. Выход за границы игрового поля");
                    continue;
                }
                if (Objects.equals(game_field[column][line], " ")) {
                    if (player % 2 != 0) {
                        game_field[column][line] = "X";
                        player++;
                    } else {
                        game_field[column][line] = "0";
                        player--;
                    }
                } else {
                    System.out.println("Поле уже занято, введите другое значение");
                    continue;
                }
            } else {
                System.out.println("Ошибка ввода данных. Тип данных не поддерживается");
                scanner.next();
                continue;
            }
            System.out.println("-------------");
            for (int i = 0; i < game_field.length; i++) {
                for (int j = 0; j < game_field.length; j++) {
                    if (j == 0) {
                        System.out.print("| " + game_field[i][j] + " | ");
                    } else if (j == game_field.length - 1) {
                        System.out.print(" | " + game_field[i][j] + " |");
                    } else {
                        System.out.print(game_field[i][j]);
                    }
                }
                System.out.println();
                System.out.println("-------------");
            }
            // если главная диагональ ==
            // если побочная диагональ ==
            for (int i = 0; i < game_field.length; i++) {
                count = 0;
                for (int j = 0; j < game_field.length - 1; j++) {
                    if (!Objects.equals(game_field[i][j], " ")) { // проверка 3 одинаковых в каждой строке
                        String temp = game_field[i][j + 1];
                        if (Objects.equals(game_field[i][j], temp)) {
                            count++;
                        } else {
                            break;
                        }
                    } else if (!Objects.equals(game_field[j][i], " ")) { // проверка 3 одинаковых в каждом столбце
                        String temp = game_field[j + 1][i];
                        if (Objects.equals(game_field[j][i], temp)) {
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println("ПОБЕДА");
                    flag = true;
                }
            }
        }
    }
}
