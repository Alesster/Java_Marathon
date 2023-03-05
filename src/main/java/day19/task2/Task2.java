package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        String path = "src\\main\\resources\\taxi_cars.txt";
        File file = new File(path);
        Map<Integer, Point> map = new HashMap<>();

        Scanner scan = null;
        try {
            scan = new Scanner(file);
            while (scan.hasNext()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                int key = Integer.parseInt(data[0]);
                int x = Integer.parseInt(data[1]);
                int y = Integer.parseInt(data[2]);
                map.put(key, new Point(x, y));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
//        System.out.println(map);

        Scanner cons = new Scanner(System.in);
        String line = cons.nextLine();
        String[] coordinates = line.split(" ");
        int x1 = Integer.parseInt(coordinates[0]);
        int y1 = Integer.parseInt(coordinates[1]);
        int x2 = Integer.parseInt(coordinates[2]);
        int y2 = Integer.parseInt(coordinates[3]);
//        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
//        int x1 = 0;
//        int y1 = 20;
//        int x2 = 20;
//        int y2 = 0;

        List<Integer> idSquare = new ArrayList<>();
        int countCar = 0;
        for (Map.Entry<Integer, Point> cars : map.entrySet()) {
            Integer key = cars.getKey();
            int x = cars.getValue().getX();
            int y = cars.getValue().getY();
            if (x1 < x2 && y1 < y2) {
                if (x > x1 && x < x2 && y > y1 && y < y2) {
                    idSquare.add(key);
                    countCar++;
                }
            } else if (x1 > x2 && y1 < y2) {
                if (x < x1 && x > x2 && y > y1 && y < y2) {
                    idSquare.add(key);
                    countCar++;
                }
            } else if (x1 < x2 && y1 > y2) {
                if (x > x1 && x < x2 && y < y1 && y > y2) {
                    idSquare.add(key);
                    countCar++;
                }
            } else {
                if (x < x1 && x > x2 && y < y1 && y > y2) {
                    idSquare.add(key);
                    countCar++;
            }
        }
    }
            System.out.println(idSquare);
        System.out.println();
        System.out.println(countCar);

}
}

