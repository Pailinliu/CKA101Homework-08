package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class No3 {
	
	public static void main(String[] args) {
		int s = 256559; // s=秒數

        int d = s / 86400; // d=天數
        s = s % 86400;

        int h = s / 3600; // h=小時
        s = s % 3600;

        int m = s / 60; // m=分鐘
        s = s % 60;

        System.out.println(d + "天 " + h + "小時 " + m + "分 " + s + "秒");
    }
}
