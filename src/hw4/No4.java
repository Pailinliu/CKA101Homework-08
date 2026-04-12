package hw4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
//其員工編號與身上現金列表如下：
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//(提示：Scanner，二維陣列)

public class No4 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] employees = {
                {25, 2500},
                {32, 800},
                {8, 500},
                {19, 1000},
                {27, 1200}
        };
        
        System.out.print("請輸入欲借的金額：");
        int amount = sc.nextInt();
        
        System.out.print("有錢可借的員工編號：");
        
        int count = 0;
        
        for (int i = 0; i < employees.length; i++) {

            int id = employees[i][0];     // 員工編號
            int money = employees[i][1];  // 現金

            if (money >= amount) {
                System.out.print(id + " ");
                count++;
            }
        }

        System.out.println("共 " + count + " 人!");
	}
}
