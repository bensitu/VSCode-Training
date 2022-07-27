package Java.Java0727.Question3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        // File 实例化
        try {
            File A = new File(
                    "src" + File.separator + "Java" + File.separator + "Java0727" + File.separator + "Question3"
                            + File.separator + "imageA.png");
            File B = new File(
                    "src" + File.separator + "Java" + File.separator + "Java0727" + File.separator + "Question3"
                            + File.separator + "imageB.png");
            // File I/O Stream 流实例化
            fis = new FileInputStream(A);
            fos = new FileOutputStream(B);
            // 读取操作
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                // 复制操作
                fos.write(buffer, 0, len);
            }
            System.out.println("Copied!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 资源关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
