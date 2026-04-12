package hw4;

//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

public class No1 {

	public static void main(String[] args) {
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum = 0;

        // 加總
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        // 平均值
        double avg = sum / (double) intArray.length;

        System.out.println("平均值：" + avg);
        System.out.println("大於平均值的元素：");

        // 找大於平均值的數
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > avg) {
                System.out.print(intArray[i] + " ");
            }
        }
	}
}
