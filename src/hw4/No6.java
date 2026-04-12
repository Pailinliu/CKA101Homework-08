package hw4;

//班上有8位同學，他們進行了6次考試結果如下：
//請算出每位同學考最高分的次數
//(提示：二維陣列)

public class No6 {
	
	public static void main(String[] args) {
		int[][] score = {
            {10, 37, 100, 77, 98, 90},
            {35, 75, 70, 95, 70, 80},
            {40, 77, 79, 70, 89, 100},
            {100, 89, 90, 89, 90, 75},
            {90, 64, 75, 60, 75, 50},
            {85, 75, 70, 75, 90, 20},
            {75, 70, 79, 85, 89, 99},
            {70, 95, 90, 89, 90, 75}
		};
		
        int[] count = new int[8]; // 每位同學的得分次數
        
        // 每一場考試
        for (int exam = 0; exam < 6; exam++) {

            int max = 0;

            // 找這場考試最高分
            for (int stu = 0; stu < 8; stu++) {
                if (score[stu][exam] > max) {
                    max = score[stu][exam];
                }
            }

            // 誰等於最高分就+1
            for (int stu = 0; stu < 8; stu++) {
                if (score[stu][exam] == max) {
                    count[stu]++;
                }
            }
        }

        // 輸出結果
        for (int i = 0; i < 8; i++) {
            System.out.println("同學" + (i + 1) + "拿到最高分次數：" + count[i]);
        }
	}
}
