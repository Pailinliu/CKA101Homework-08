package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class No1 {
	
	public static void main(String[] args) {
		File file = new File("src/hw7/Sample.txt");

		long byteCount = file.length(); // 取得檔案大小（位元組數）
		int charCount = 0; // 累計字元數
		int lineCount = 0; // 累計行數

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				lineCount++;
				charCount += line.length();
			}
		} catch (IOException e) {
			System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
		}

		System.out.println("Sample.txt檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
	}
}
