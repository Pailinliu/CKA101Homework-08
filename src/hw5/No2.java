package hw5;

import java.util.Random;

//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

public class No2 {

	public static void randAvg() {
		Random rand = new Random();
		int sum = 0;

		System.out.println("本次亂數結果：");

		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(101); // 0 ~ 100
			sum += num;
			System.out.print(num);
			if (i < 9) {
				System.out.print(" ");
			}
		}

		System.out.println();
		System.out.println(sum / 10); // 整數平均值
	}

	public static void main(String[] args) {
		randAvg();
	}
}
