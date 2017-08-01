package com.day.demo1;

import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		Menu menu =new Menu();
		Scanner input = new Scanner(System.in);
		boolean con;
		do{
			con =false;
			menu.showLoginMenu();
			System.out.println("请输入您的选择：");
			int choice = input.nextInt();
			switch(choice){
			case 1:
				menu.showMainMenu();
				break;
			case 2:
				System.out.println("谢谢您的使用");
				break;
			}
		}while(con==true);
	}
}
