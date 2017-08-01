package com.day.demo1;

import java.util.Scanner;

public class StartSMS {
	public static void main(String[] args) {
		Menu menu =new Menu();
		Manager manager = new Manager();
		Scanner input = new Scanner(System.in);
		boolean con;
		do{
			con =false;
			menu.showLoginMenu();
			
			System.out.println("请输入您的选择：");
			int choice = input.nextInt();
			switch(choice){
			case 1:
				do{
					con =false;
				System.out.println("请输入用户名：");
				String name =input.next();
				System.out.println("请输入密码：");
				String password =input.next();
				if(name.equals(manager.name) && password.equals(manager.password)){
					menu.showMainMenu();
				}else {
					System.out.println("您输入的信息有误，请重新输入！");
					con =true;
				}
				}while(con==true);
				break;
			case 2:
				System.out.println("谢谢您的使用");
				break;
			}
		}while(con==true);
	}
}
