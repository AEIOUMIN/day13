package com.day.demo;

import java.util.Scanner;

public class StartSMS {
	public void startSMS() {

		MenuManager menuManager = new MenuManager();
		Scanner input = new Scanner(System.in);
		boolean con;
		do {
			con = false;
			Menu menu = new Menu();

			System.out.println("请输入用户名：");
			String name = input.next();
			System.out.println("请输入密码：");
			String password = input.next();
			if (name.equals(menuManager.name) && password.equals(menuManager.password)) {
				menu.showMainMenu();
				break;
			} else {
				System.out.println("您输入的用户名或者密码有误，请重新输入！");
				con = true;
			}
		} while (con = true);
	}
}
