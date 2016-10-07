package hw;

/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw02_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
	
		int v1 = scn.nextInt();
		int Data[] = new int[v1];
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < v1; i++) {
			Data[i] = scn.nextInt();
		}
		for (int j = 0; j < v1; j++) {
			if (Data[j] > 0) {
				a++;
			} else if (Data[j] < 0) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("正數" + a + "負數" + b + "零" + c);

	}

}
