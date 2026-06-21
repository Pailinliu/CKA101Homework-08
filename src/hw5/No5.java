package hw5;

import java.util.Random;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法genAuthCode()，
//當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合，如圖：

public class No5 {

	String genAuthCode() {
		String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		Random random = new Random();
		String code = "";

		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(pool.length());
			char c = pool.charAt(index);
			code += c;
		}

		return code;
	}

	public static void main(String[] args) {
		No5 a = new No5();
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(a.genAuthCode());
	}
}
