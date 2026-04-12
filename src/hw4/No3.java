package hw4;

//有個字串陣列如下 (八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)

public class No3 {

	public static void main(String[] args) {
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
	    int count = 0;

	    for (int i = 0; i < planets.length; i++) {

	        for (int j = 0; j < planets[i].length(); j++) {

	            char c = planets[i].charAt(j);

	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    count++;
	            }
	         }
	     }

	        System.out.println("母音總數：" + count);
	}
}
