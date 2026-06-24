package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)

public class No2 {
	
	public static void main(String[] args) {
		Random random = new Random();

		// true 代表開啟 append 模式
		try (FileWriter fw = new FileWriter("src/hw7/Data.txt", true)) {
			for (int i = 0; i < 10; i++) {
				int number = random.nextInt(1000) + 1; // 1~1000
				fw.write(number + "\n");
			}
			System.out.println("已成功寫入 10 筆資料！");
		} catch (IOException e) {
			System.out.println("寫入檔案發生錯誤：" + e.getMessage());
		}
	}
}
