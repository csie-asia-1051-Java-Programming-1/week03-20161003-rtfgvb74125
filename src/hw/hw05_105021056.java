package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw05_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<=v1;i++){
			sum = sum +i * (i+1);
		}
		System.out.println(sum);
	}

}
