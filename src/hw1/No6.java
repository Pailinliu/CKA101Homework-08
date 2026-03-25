package hw1;

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

public class No6 {
	
	public static void main(String[] args) {	
		System.out.println(5 + 5);
	    // 10
	    // int + int -> 數值相加
		
		System.out.println(5 + '5');
	    // 58
	    // '5' 為字元(char)，會轉成ASCII值 53
	    // 5 + 53 = 58
		
		System.out.println(5 + "5");
	    // 55
	    // "5" 為字串(String)
	    // int + String -> 字串串接(變成"55")
	}
}
