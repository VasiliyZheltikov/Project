package homework_4_tic_tac_toe;

import java.util.Objects;
import java.util.Scanner;

public class Tic_tac_toe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] game_field = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        int player = 1; // порядковый номер игрока
        boolean flag = false; // признак завершения игры
        int count_line; // кол-во совпадающших элементов в строке
        int count_column; // кол-во совпадающших элементов в столбце
        int count_main_diagonal; // кол-во совпадающших элементов в главной диагонали
        int count_secondary_diagonal; // кол-во совпадающших элементов в побочной диагонали
        int move = 0; // номер хода
        int input;
        System.out.println("Добро пожаловать в игру ''Крестики - нолики''!");
        System.out.println("Все координаты клеток имеют значения от 1 до 3");
        System.out.println("Сначала указывается координата по горизонтали, потом по вертикали");
        while (!flag) {
            System.out.print("Введите координату клетки для хода в формате XX (строка, столбец): ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                move++;
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
                    move--;
                    continue;
                }
            } else {
                System.out.println("Ошибка ввода данных. Тип данных не поддерживается");
                move--;
                scanner.next();
                continue;
            }
            System.out.println("   " + "1" + "   " + "2" + "   " + "3");
            System.out.println("  -----------");
            for (int i = 0; i < game_field.length; i++) {
                for (int j = 0; j < game_field.length; j++) {
                    if (j == 0) {
                        System.out.print(i + 1 + "| " + game_field[i][j] + " | ");
                    } else if (j == game_field.length - 1) {
                        System.out.print(" | " + game_field[i][j] + " |");
                    } else {
                        System.out.print(game_field[i][j]);
                    }
                }
                System.out.println();
                System.out.println("  -----------");
            }
            for (int i = 0; i < game_field.length; i++) {
                count_line = 0;
                count_column = 0;
                count_main_diagonal = 0;
                count_secondary_diagonal = 0;
                for (int j = 0; j < game_field.length - 1; j++) {
                    if (!Objects.equals(game_field[i][j], " ")) { // проверка 3 одинаковых в каждой строке
                        String temp = game_field[i][j + 1];
                        if (Objects.equals(game_field[i][j], temp)) {
                            count_line++;
                        }
                    }
                    if (!Objects.equals(game_field[j][i], " ")) { // проверка 3 одинаковых в каждом столбце
                        String temp = game_field[j + 1][i];
                        if (Objects.equals(game_field[j][i], temp)) {
                            count_column++;
                        }
                    }
                    if (!Objects.equals(game_field[j][j], " ")) { // проверка 3 одинаковых в главной диагонали
                        String temp = game_field[j + 1][j + 1];
                        if (Objects.equals(game_field[j][j], temp)) {
                            count_main_diagonal++;
                        }
                    }
                    if (!Objects.equals(game_field[j][game_field.length - j - 1], " ")) { // проверка 3 одинаковых в побочной диагонали
                        String temp = game_field[game_field.length + j - 2][game_field.length - j - 2];
                        if (Objects.equals(game_field[j][game_field.length - j - 1], temp)) {
                            count_secondary_diagonal++;
                        }
                    }
                }
                if (count_line == 2 || count_column == 2 || count_main_diagonal == 2 || count_secondary_diagonal == 2) {
                    if (player - 1 == 1) {
                        System.out.println("Победил игрок № 1");
                        flag = true;
                        break;
                    } else {
                        System.out.println("Победил игрок № 2");
                        flag = true;
                        break;
                    }
                } else if (move > 8) {
                    System.out.println("Ничья");
                    flag = true;
                    break;
                }
            }
        }
    }
}