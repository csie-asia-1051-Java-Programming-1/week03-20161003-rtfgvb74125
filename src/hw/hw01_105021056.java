package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw01_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int v1 = scn.nextInt();
		for(int i = 1;;i++){
			if(Math.pow(10,i)>v1){
				sum = i;
				break;
			}
		}
		System.out.print(sum + "位數");

	}

}
