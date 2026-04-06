package hw2;

//阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

public class No5 {
	
	    public static void main(String[] args) {
	        int count = 0;

	        System.out.println("可選擇的數字：");

	        for (int i = 1; i <= 49; i++) {
	            int tens = i / 10;   // 十位數
	            int ones = i % 10;   // 個位數

	            // 不包含數字4
	            if (tens != 4 && ones != 4) {
	                System.out.print(i + " ");
	                count++;
	            }
	        }

	        System.out.println("\n總共有 " + count + " 個數字");
	   }
}
