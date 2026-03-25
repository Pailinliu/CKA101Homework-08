package hw1;

//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)

public class No2 {
	
	public static void main(String[] args) {
		int eggs = 200;
        int dozen = eggs / 12;
        int remainder = eggs % 12;
        System.out.println("幾打 = " + dozen);
        System.out.println("剩幾顆 = " + remainder);
	}
}
