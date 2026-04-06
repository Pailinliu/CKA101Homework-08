package hw2;

//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class No7 {
	
	public static void main(String[] args) {

        // 外層：行數（6行：A~F）
        for (int i = 1; i <= 6; i++) {

            // 將數字轉成對應字母（A=65）
            char ch = (char) ('A' + i - 1);

            // 內層：印出 i 次該字母
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
