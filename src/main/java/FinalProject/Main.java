package FinalProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Обозначения: "$" - корабль, "_" - пустое поле, "*" - ореол, "X" - подбит, "0" - мимо
 */

public class Main {
    public static void main(String[] args) throws
            ScannerException {

// Задаём поля для двух игроков как пустые
        ObjectList[][] field1 = new ObjectList[10][10];
        for (ObjectList[] row : field1) {
            Arrays.fill(row, ObjectList.EMPTY);
        }
        ObjectList[][] field2 = new ObjectList[10][10];
        for (ObjectList[] row : field2) {
            Arrays.fill(row, ObjectList.EMPTY);
        }
        BattleField battleField1 = new BattleField(field1);
        BattleField battleField2 = new BattleField(field2);

// Создаём объект для кораблей как массив
        ObjectList[] ship = ObjectList.values();

        Scanner scan = new Scanner(System.in);

// Секция для ввода координат кораблей
        for (int i = 0; i <= 1; i++) {

            System.out.printf("Расставляем корабли на поле %d\n", i + 1);

            System.out.println("Введи координаты 4-х палубного корабля (Линкор), формат: x,y;x,y;x,y;x,y");
            while (true) {
                String line = scan.nextLine();
                String[] strline = line.split(";");

                if (strline.length == ship[0].getValue()) {
                    try {
                        if (i == 0) {
                            field1 = insertShip(strline, field1, ship[0]);
                        } else {
                            field2 = insertShip(strline, field2, ship[0]);
                        }
                    } catch (ScannerException e) {
                        System.out.println("Не должно быть пробелов или клетки должны быть заполнены горизонтально или вертикально, либо поле не пустое.\n" +
                                "Введите правильные координаты и нажмите Enter");
                        continue;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Введите числа от 0 до 9");
                        continue;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Введите координаты правильно, целые числа от 0 до 9 через запятую.");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Это Линкор: введите 4 координаты");
                    continue;
                }
            }
            if (i == 0) {
                battleField1.printField();
            } else {
                battleField2.printField();
            }

            for (int k = 1; k <= 2; k++) {
                System.out.printf("Введите координаты 3-х палубного корабля (Крейсер), %d из двух, формат: x,y;x,y;x,y\n", k);
                while (true) {
                    String line = scan.nextLine();
                    String[] strline = line.split(";");

                    if (strline.length == ship[1].getValue()) {
                        try {
                            if (i == 0) {
                                field1 = insertShip(strline, field1, ship[1]);
                            } else {
                                field2 = insertShip(strline, field2, ship[1]);
                            }
                        } catch (ScannerException e) {
                            System.out.println("Не должно быть пробелов или клетки должны быть заполнены горизонтально или вертикально, либо поле не пустое.\n" +
                                    "Введите правильные координаты и нажмите Enter");
                            continue;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Введите числа от 0 до 9");
                            continue;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Введите координаты правильно, целые числа от 0 до 9 через запятую.");
                            continue;
                        }

                        break;
                    } else {
                        System.out.println("Это Крейсер: введите 3 координаты");
                        continue;
                    }
                }


                if (i == 0) {
                    battleField1.printField();
                } else {
                    battleField2.printField();
                }
            }

            for (int k = 1; k <= 3; k++) {
                System.out.printf("Введите координаты 2-х палубного корабля (Эсминец), %d из трёх, формат: x,y;x,y\n", k);
                while (true) {
                    String line = scan.nextLine();
                    String[] strline = line.split(";");

                    if (strline.length == ship[2].getValue()) {
                        try {
                            if (i == 0) {
                                field1 = insertShip(strline, field1, ship[2]);
                            } else {
                                field2 = insertShip(strline, field2, ship[2]);
                            }
                        } catch (ScannerException e) {
                            System.out.println("Не должно быть пробелов или клетки должны быть заполнены горизонтально или вертикально, либо поле не пустое.\n" +
                                    "Введите правильные координаты и нажмите Enter");
                            continue;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Введите числа от 0 до 9");
                            continue;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Введите координаты правильно, целые числа от 0 до 9 через запятую.");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Это Эсминец: введите 2 координаты");
                        continue;
                    }
                }

                if (i == 0) {
                    battleField1.printField();
                } else {
                    battleField2.printField();
                }
            }

            for (int k = 1; k <= 4; k++) {
                System.out.printf("Введите координаты 1-но палубного корабля (Торпедный катер), %d из четырёх, формат: x,y\n", k);
                while (true) {
                    String line = scan.nextLine();
                    String[] strline = line.split(";");

                    if (strline.length == ship[3].getValue()) {
                        try {
                            if (i == 0) {
                                field1 = insertShip(strline, field1, ship[3]);
                            } else {
                                field2 = insertShip(strline, field2, ship[3]);
                            }
                        } catch (ScannerException e) {
                            System.out.println("Не должно быть пробелов или клетки должны быть заполнены горизонтально или вертикально, либо поле не пустое.\n" +
                                    "Введите правильные координаты и нажмите Enter");
                            continue;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Введите числа от 0 до 9");
                            continue;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Введите координаты правильно, целые числа от 0 до 9 через запятую.");
                            continue;
                        }
                        break;
                    } else {
                        System.out.println("Это Торпедный катер: введите 1 координату");
                        continue;
                    }
                }

                if (i == 0) {
                    battleField1.printField();
                } else {
                    battleField2.printField();
                }
            } // Конец ввода координат кораблей

// Очистка экрана
            if (i == 0) {
                battleField1.printField();
                System.out.println("Чтобы очистить экран наберите clean");
                String clean = scan.nextLine();
                if (clean.equals("clean")) {
                    for (int j = 0; j < 100; j++) {
                        System.out.println();
                    }
                }
            } else {
                battleField2.printField();
                System.out.println("Чтобы очистить экран наберите clean");
                String clean = scan.nextLine();
                if (clean.equals("clean")) {
                    for (int j = 0; j < 100; j++) {
                        System.out.println();
                    }
                }
            }
        }

// Начало боя. Ходы игроков

// создаём поля для черновиков
        ObjectList[][] field1_draft = new ObjectList[10][10];
        for (ObjectList[] row : field1_draft) {
            Arrays.fill(row, ObjectList.EMPTY);
        }
        ObjectList[][] field2_draft = new ObjectList[10][10];
        for (ObjectList[] row : field2_draft) {
            Arrays.fill(row, ObjectList.EMPTY);
        }
        BattleField battleField1_draft = new BattleField(field1_draft);
        BattleField battleField2_draft = new BattleField(field2_draft);

        boolean pass1 = false, pass2 = false;
        int count1 = 0, count2 = 0;
        int countLinkor1 = 0, countKruiser1 = 0, countDestroyer1 = 0;
        int countLinkor2 = 0, countKruiser2 = 0, countDestroyer2 = 0;

        System.out.println();
        System.out.println("Начало игры");
        System.out.println();

        int firstPass = new Random().nextInt(2) + 1;
        if (firstPass == 1) {
            pass1 = true;
        } else {
            pass2 = true;
        }

        while (true) {
            if (count1 == 10) {
                System.out.println();
                System.out.println("Выиграл игрок 1");
                System.out.println();
                System.out.println("Карта игрока 1");
                battleField1.printField();
                System.out.println("Карта игрока 2");
                battleField2.printField();
                break;
            } else if (count2 == 10) {
                System.out.println();
                System.out.println("Выиграл игрок 2");
                System.out.println();
                System.out.println("Карта игрока 2");
                battleField2.printField();
                System.out.println("Карта игрока 1");
                battleField1.printField();
                break;
            }

            // Ход 1-го игрока
            if (pass1) {
                System.out.println("Ход игрока 1.");
                System.out.println("Введите p чтобы распечатать карту");
                String p = scan.nextLine();
                if (p.equals("p")) {battleField1.printField();}
                System.out.println("Введите pd чтобы распечатать черновик карты 2");
                String pd = scan.nextLine();
                if (pd.equals("pd")) {battleField2_draft.printField();}

                System.out.println("Введите координату x,y");
                while (true) {
                    int x, y;
                    try {
                        String line = scan.nextLine();
                        String[] str = line.split(",");
                        x = Integer.parseInt(str[0]);
                        y = Integer.parseInt(str[1]);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Введите координату правильно x,y");
                        continue;
                    }

                    if (field2[x][y].equals(ObjectList.EMPTY) || field2[x][y].equals(ObjectList.AURA)) {
                        System.out.println("Мимо!");
                        field2[x][y] = ObjectList.NOKILL;
                        field2_draft[x][y] = ObjectList.NOKILL;
                        pass1 = false;
                        pass2 = true;
                        System.out.println("Наберите clean, чтобы очистить экран");
                        String clean = scan.nextLine();
                        if (clean.equals("clean")) {
                            for (int j = 0; j < 50; j++) {
                                System.out.println();
                            }
                        }
                        break;
                    } else if (field2[x][y].equals(ObjectList.LINKOR)) {
                        countLinkor1++;
                        if (countLinkor1 == ObjectList.LINKOR.getValue()) {
                            System.out.println("Утопил!");
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            count1++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            break;
                        }

                    } else if (field2[x][y].equals(ObjectList.KRUISER)) {
                        countKruiser1++;
                        if (countKruiser1 == ObjectList.KRUISER.getValue()) {
                            System.out.println("Утопил!");
                            countKruiser1 = 0;
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            count1++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            break;
                        }
                    } else if (field2[x][y].equals(ObjectList.DESTROYER)) {
                        countDestroyer1++;
                        if (countDestroyer1 == ObjectList.DESTROYER.getValue()) {
                            System.out.println("Утопил!");
                            countDestroyer1 = 0;
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            count1++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field2[x][y] = ObjectList.KILL;
                            field2_draft[x][y] = ObjectList.KILL;
                            break;
                        }
                    } else if (field2[x][y].equals(ObjectList.TORPEDSHIP)) {
                        System.out.println("Утопил!");
                        field2[x][y] = ObjectList.KILL;
                        field2_draft[x][y] = ObjectList.KILL;
                        count1++;
                        break;
                    }
                }
            // Ход 2-го игрока
            } else if (pass2) {
                System.out.println("Ход игрока 2.");
                System.out.println("Введите p чтобы распечатать карту");
                String p = scan.nextLine();
                if (p.equals("p")) {battleField2.printField();}
                System.out.println("Введите pd чтобы распечатать черновик карты 1");
                String pd = scan.nextLine();
                if (pd.equals("pd")) {battleField1_draft.printField();}

                System.out.println("Введите координату x,y");
                while (true) {
                    int x, y;
                    try {
                        String line = scan.nextLine();
                        String[] str = line.split(",");
                        x = Integer.parseInt(str[0]);
                        y = Integer.parseInt(str[1]);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Введите координату правильно x,y");
                        continue;
                    }

                    if (field1[x][y].equals(ObjectList.EMPTY) || field1[x][y].equals(ObjectList.AURA)) {
                        System.out.println("Мимо!");
                        field1[x][y] = ObjectList.NOKILL;
                        field1_draft[x][y] = ObjectList.NOKILL;
                        pass2 = false;
                        pass1 = true;
                        System.out.println("Наберите clean, чтобы очистить экран");
                        String clean = scan.nextLine();
                        if (clean.equals("clean")) {
                            for (int j = 0; j < 50; j++) {
                                System.out.println();
                            }
                        }
                        break;
                    } else if (field1[x][y].equals(ObjectList.LINKOR)) {
                        countLinkor2++;
                        if (countLinkor2 == ObjectList.LINKOR.getValue()) {
                            System.out.println("Утопил!");
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            count2++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            break;
                        }

                    } else if (field1[x][y].equals(ObjectList.KRUISER)) {
                        countKruiser2++;
                        if (countKruiser2 == ObjectList.KRUISER.getValue()) {
                            System.out.println("Утопил!");
                            countKruiser2 = 0;
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            count2++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            break;
                        }
                    } else if (field1[x][y].equals(ObjectList.DESTROYER)) {
                        countDestroyer2++;
                        if (countDestroyer2 == ObjectList.DESTROYER.getValue()) {
                            System.out.println("Утопил!");
                            countDestroyer2 = 0;
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            count2++;
                            break;
                        } else {
                            System.out.println("Попадание!");
                            field1[x][y] = ObjectList.KILL;
                            field1_draft[x][y] = ObjectList.KILL;
                            break;
                        }
                    } else if (field1[x][y].equals(ObjectList.TORPEDSHIP)) {
                        System.out.println("Утопил!");
                        field1[x][y] = ObjectList.KILL;
                        field1_draft[x][y] = ObjectList.KILL;
                        count2++;
                        break;
                    }
                }
            }


        }
    } // Конец программы main


// ****************** Метод для ввода координат кораблей *********************
    public static ObjectList[][] insertShip(String[] strline, ObjectList[][] field, ObjectList ship) throws
            ScannerException {
        int length = ship.getValue();
        int[] x = new int[2 * strline.length];
// Задние координат корабля
        for (int i = 0; i < length; i++) {
            try {
                String[] xy = strline[i].split(",");
                x[i] = Integer.parseInt(xy[0]);
                x[i + length] = Integer.parseInt(xy[1]);
            } catch (IllegalArgumentException e) {
                field[x[i]][x[i + length]] = ObjectList.EMPTY;
                throw new IllegalArgumentException();
            }
            if (i >= 1) {
                if (x[i] == x[i - 1] + 1 || x[i + length] == x[i + length - 1] + 1) {
                    System.out.printf("Координаты %d,%d введены без пробелов.\n", x[i], x[i + length]);
                } else {
                    field[x[i - 1]][x[i + length - 1]] = ObjectList.EMPTY;
                    field[x[i]][x[i + length]] = ObjectList.EMPTY;
                    throw new ScannerException("Не должно быть пробелов.");
                }
                if (x[i] == x[i - 1] || x[i + length] == x[i + length - 1]) {
                    System.out.printf("Координаты %d,%d введены горизонтально или вертикально.\n", x[i], x[i + length]);
                } else {
                    field[x[i - 1]][x[i + length - 1]] = ObjectList.EMPTY;
                    field[x[i]][x[i + length]] = ObjectList.EMPTY;
                    throw new ScannerException("Клетки должны быть заполнены горизонтально или вертикально.");
                }
            }
            try {
                if (field[x[i]][x[i + length]].equals(ObjectList.EMPTY)) {
                    field[x[i]][x[i + length]] = ship;
                } else {
                    field[x[i]][x[i + length]] = ObjectList.EMPTY;
                    throw new ScannerException("Поле не пустое, есть другой корабль или его ореол");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
// Создание орелов
        if (length > 1) {
// Если корабль расположен горизонтально
            if (x[0] == x[1]) {
                int length2 = 2 * length - 1;
                // x1-1 >= 0
                if (x[length] - 1 >= 0) {
                    field[x[0]][x[length] - 1] = ObjectList.AURA;
                }
                // x4+1 <= 9
                if (x[length2] + 1 <= 9) {
                    field[x[0]][x[length2] + 1] = ObjectList.AURA;
                }
                // y1-1 >= 0
                if (x[0] - 1 >= 0) {
                    for (int i = length; i <= length2; i++) {
                        field[x[0] - 1][x[i]] = ObjectList.AURA;
                    }
                }
                // y1 +1 <=9
                if (x[0] + 1 <= 9) {
                    for (int i = length; i <= length2; i++) {
                        field[x[0] + 1][x[i]] = ObjectList.AURA;
                    }
                }
                // x1-1 >=0 AND y1-1 >=0
                if (x[length] - 1 >= 0 && x[0] - 1 >= 0) {
                    field[x[0] - 1][x[length] - 1] = ObjectList.AURA;
                }
                // x1-1 >=0 AND y1+1<=9
                if (x[length] - 1 >= 0 && x[0] + 1 <= 9) {
                    field[x[0] + 1][x[length] - 1] = ObjectList.AURA;
                }
                // x4 <=9 AND y1-1 >=0
                if (x[length2] + 1 <= 9 && x[0] - 1 >= 0) {
                    field[x[0] - 1][x[length2] + 1] = ObjectList.AURA;
                }
                // x4 <=9 AND y1+1 <=9
                if (x[length2] + 1 <= 9 && x[0] + 1 <= 9) {
                    field[x[0] + 1][x[length2] + 1] = ObjectList.AURA;
                }

            }
// Если корабль расположен вертикально
            if (x[length] == x[length + 1]) {
                int length2 = length - 1;
                // y1-1 >= 0
                if (x[0] - 1 >= 0) {
                    field[x[0] - 1][x[length]] = ObjectList.AURA;
                }
                // y4+1 <= 9
                if (x[length2] + 1 <= 9) {
                    field[x[length2] + 1][x[length]] = ObjectList.AURA;
                }
                // x1-1 >= 0
                if (x[length] - 1 >= 0) {
                    for (int i = 0; i <= length2; i++) {
                        field[x[i]][x[length] - 1] = ObjectList.AURA;
                    }
                }
                // x1 +1 <=9
                if (x[length] + 1 <= 9) {
                    for (int i = 0; i <= length2; i++) {
                        field[x[i]][x[length] + 1] = ObjectList.AURA;
                    }
                }
                // y1-1 >=0 AND x1-1 >=0
                if (x[0] - 1 >= 0 && x[length] - 1 >= 0) {
                    field[x[0] - 1][x[length] - 1] = ObjectList.AURA;
                }
                // y1-1 >=0 AND x1+1<=9
                if (x[0] - 1 >= 0 && x[length] + 1 <= 9) {
                    field[x[0] - 1][x[length] + 1] = ObjectList.AURA;
                }
                // y4+1 <=9 AND x1-1 >=0
                if (x[length2] + 1 <= 9 && x[length] - 1 >= 0) {
                    field[x[length2] + 1][x[length] - 1] = ObjectList.AURA;
                }
                // y4+1 <=9 AND x1+1 <=9
                if (x[length2] + 1 <= 9 && x[length] + 1 <= 9) {
                    field[x[length2] + 1][x[length] + 1] = ObjectList.AURA;
                }
            }
// Создание ореолов для одно-палубного корабля
        } else {
            if (x[1] - 1 >= 0) {
                field[x[0]][x[1] - 1] = ObjectList.AURA;
            }
            if (x[1] + 1 <= 9) {
                field[x[0]][x[1] + 1] = ObjectList.AURA;
            }
            if (x[0] - 1 >= 0) {
                field[x[0] - 1][x[1]] = ObjectList.AURA;
            }
            if (x[0] + 1 <= 9) {
                field[x[0] + 1][x[1]] = ObjectList.AURA;
            }
            if (x[1] - 1 >= 0 && x[0] - 1 >= 0) {
                field[x[0] - 1][x[1] - 1] = ObjectList.AURA;
            }
            if (x[1] - 1 >= 0 && x[0] + 1 <= 9) {
                field[x[0] + 1][x[1] - 1] = ObjectList.AURA;
            }
            if (x[1] + 1 <= 9 && x[0] - 1 >= 0) {
                field[x[0] - 1][x[1] + 1] = ObjectList.AURA;
            }
            if (x[1] + 1 <= 9 && x[0] + 1 <= 9) {
                field[x[0] + 1][x[1] + 1] = ObjectList.AURA;
            }
        }
        return field;
    }
}

