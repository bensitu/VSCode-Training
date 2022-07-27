package Java.Java0727.Question1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // File 实例化
            File abc = new File(
                    "src" + File.separator + "Java" + File.separator + "Java0727" + File.separator + "Question1"
                            + File.separator + "abc.txt");

            // FileReader流实例化
            fr = new FileReader(abc);
            // 读取操作
            int data;
            char[] cbuf = new char[10];
            while ((data = fr.read(cbuf)) != -1) {
                for (int i = 0; i < data; i++) {
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 资源关闭
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
