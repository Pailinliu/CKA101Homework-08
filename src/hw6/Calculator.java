package hw6;

//在Calculator.java裡有個自訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 

public class Calculator {

	int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		}

		if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}

		double result = Math.pow(x, y);
		return (int) result;
	}
}
