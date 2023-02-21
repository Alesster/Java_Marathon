package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder strbld = new StringBuilder();
        String str = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            str +=i + " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(str);

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 200001; i++) {
            strbld.append(i + " ");
        }
        long stopTime1 = System.currentTimeMillis();
        System.out.println(strbld);
        System.out.println("Длительность работы String: " + (stopTime - startTime) + " ms");
        System.out.println("Длительность работы StringBuilder: " + (stopTime1 - startTime1) + " ms");
    }
}
