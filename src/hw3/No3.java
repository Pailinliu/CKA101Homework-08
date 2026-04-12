package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
//但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，
//讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)

public class No3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("阿文...請輸入你討厭哪個數字？");
        int unlikeNum = sc.nextInt();
        
        int count = 0;
        int lineCount = 0;
        
        for (int i = 1; i <= 49; i++) {
            int tens = i / 10;   // 十位數
            int ones = i % 10;   // 個位數

            // 不包含輸入數字
            if (tens != unlikeNum && ones != unlikeNum) {
                System.out.print(i + "\t");
                count++;
                lineCount++;
                
                if (lineCount == 6) {
                    System.out.println();
                    lineCount = 0;
            }
         }
        }

        System.out.println("總共有 " + count + " 數字可選");
  }
}
//進階挑戰：可用陣列