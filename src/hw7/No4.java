package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

public class No4 {

	public static void main(String[] args) {
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir(); // 如果 data 資料夾不存在，建立它
		}

		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"))) {

			oos.writeObject(new Dog("小白"));
			oos.writeObject(new Cat("小花"));
			oos.writeObject(new Dog("大黑"));
			oos.writeObject(new Cat("橘子"));

			System.out.println("物件已寫入成功！");

		} catch (IOException e) {
			System.out.println("寫入物件時發生錯誤：" + e.getMessage());
		}
	}
}
