package hw5;

//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：

public class Work03 {

	// 處理 int 二維陣列
	int maxElement(int x[][]) {
		int max = x[0][0]; // 先假設第一個元素是最大值
		for (int i = 0; i < x.length; i++) { // 跑列
			for (int j = 0; j < x[i].length; j++) { // 跑行
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	// 處理 double 二維陣列（Overloading）
	double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray)); // 呼叫 int 版本 → 9
		System.out.println(w.maxElement(doubleArray)); // 呼叫 double 版本 → 8.2
	}
}
