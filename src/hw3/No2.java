package hw3;

import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

public class No2 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = (int)(Math.random() * 10); // 亂數方法
        System.out.println("開始猜數字吧！");
        
        while (true) { // 無窮迴圈
            int guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("答對了！答案就是" + answer);
                break; // 跳出迴圈
            } else {
                System.out.println("猜錯囉");
            }
        }
	}
}
