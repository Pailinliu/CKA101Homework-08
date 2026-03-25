package hw1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長

public class No4 {
	
	public static void main(String[] args) {
		int r = 5;
		final double Pi = 3.1415;
		
		double Area =  Pi * (r * r);
		double Circumference = 2 * Pi * r;
		
    	System.out.println(Area);
    	System.out.println(Circumference);
	}
}
