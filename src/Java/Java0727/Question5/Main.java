package Java.Java0727.Question5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            // File实例化
            File A = new File(
                    "src" + File.separator + "Java" + File.separator + "Java0727" + File.separator + "Question5"
                            + File.separator + "A.txt");
            // FileWriter实例化
            fw = new FileWriter(A, true);
            // Mapを作って
            Map<String, String> mp1 = new TreeMap<>();
            mp1.put("IBARAKI", "水戸市");
            mp1.put("TOCHIGI", "宇都宮市");
            mp1.put("GUNMA", "前橋市");
            mp1.put("SAITAMA", "さいたま市");
            mp1.put("CHIBA", "千葉市");
            mp1.put("TOKYO", "東京(新宿区)");
            mp1.put("KANAGAWA", "横浜市");
            new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    if (s1.length() > s2.length()) {
                        return -1;
                    } else if (s1.length() < s2.length()) {
                        return 1;
                    } else {
                        return s1.compareTo(s2);
                    }
                }
            };
            Set<Map.Entry<String, String>> entrySet = mp1.entrySet();

            for (Map.Entry<String, String> entry : entrySet) {
                // 写入A.txt
                fw.write(entry.getKey().toString() + "\t");
                fw.write(entry.getValue().toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
