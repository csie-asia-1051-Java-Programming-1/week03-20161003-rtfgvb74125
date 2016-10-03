package ex;

/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex01_105021056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String strR = new StringBuilder(str).reverse().toString();
		System.out.println(strR);

	}

}
