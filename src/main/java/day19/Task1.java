package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;


/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int val = 0;
        String path = "src\\main\\resources\\dushi.txt";
        File file = new File(path);
        Map<String, Integer> map = new HashMap<>();

        try {
            Scanner scan = new Scanner(file, StandardCharsets.UTF_8);
            scan.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scan.hasNext()) {
                String w = scan.next();
                if(map.containsKey(w)) {
                    val = map.get(w)+1;
                }else {
                    val = 1;
                }
                map.put(w,val);
            }

            scan.close();
        } catch (IOException e) {
            System.out.println("Input Output Error");;
        }

        Set<Map.Entry<String, Integer>> entmap = map.entrySet();
        int i = 0;
        List<MapNew> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : entmap){
            String key = entry.getKey();
            Integer value = entry.getValue();
            list.add(new MapNew(key,value));
        }
        Comparator<MapNew> cm = Comparator.comparing(MapNew::getCount);
        list.sort(cm);
        Collections.reverse(list);

        for (int j = 0; j < 100; j++) {
            System.out.println((j+1) + ": Слово " + "\"" + list.get(j).word + "\"" + " - встречается " + list.get(j).count + " раз");
        }
        System.out.println();
        System.out.println("Чичиков" + " - " + map.get("Чичиков"));
    }

    public static class MapNew{
        private String word;
        private Integer count;

        public MapNew(String word, Integer count){
            this.word=word;
            this.count = count;
        }

        public String getWord() {
            return word;
        }

        public Integer getCount() {
            return count;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }
}
