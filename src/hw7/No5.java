package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)

public class No5 {
	
    public static void main(String[] args) {
        try (ObjectInputStream ois = 
                new ObjectInputStream(new FileInputStream("C:\\data\\Object.ser"))) {

            for (int i = 0; i < 4; i++) {            // 四個物件，讀 4 次
                Pet p = (Pet) ois.readObject(); // 多型：統一用 Pet 接收
                p.speak();                            // 自動呼叫對應子類別的 speak()
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("讀取物件時發生錯誤：" + e.getMessage());
        }
    }
}
