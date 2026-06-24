package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class No3 {

    static void copyFile(String source, String target) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024];   // 緩衝區，一次讀 1024 個位元組
            int length;

            while ((length = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, length);
            }

            System.out.println("複製完成！");

        } catch (IOException e) {
            System.out.println("複製檔案時發生錯誤：" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copyFile("src/hw7/Data.txt", "src/hw7/Data_copy.txt");
    }
}
