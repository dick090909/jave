package tw.miahaellee.myproject;

import java.util.Scanner;

public class HomeWork06172 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double Type; // 設定Type為溫度轉換的類別
		double degree; // 定義會key的溫度
		System.out.print("Temperature Type is 1 or 2: ");
		Type = scn.nextDouble();
		System.out.print("Temperature  is : ");
		degree = scn.nextDouble();
		if (Type == 1) // 攝氏轉華氏
		{
			degree = degree * 9 / 5 + 32;
			System.out.println("degree=" + degree);
		} else if (Type == 2) {        // 華氏轉攝氏
			degree = ((degree - 32) * 5 / 9);
			System.out.println("degree=" + degree);
		} else {
			System.out.println("Type error");

		}

	}

}
