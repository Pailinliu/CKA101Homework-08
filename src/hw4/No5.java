package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

public class No5 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.print("請輸入西元yyyy年，mm月，dd日");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        if (month < 1 || month > 12) {
            System.out.println("錯誤：月份輸入不正確！");
            return;
        }

        // 判斷閏年
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        // 若閏年，2月改為29天
        if (isLeap) {
            daysInMonth[1] = 29;
        }

        // 檢查日期是否合法
        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("錯誤：日期輸入不正確！");
            return;
        }

        // 計算第幾天
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;

        System.out.println("輸入的日期為該年第" + totalDays + "天");
	}
}
