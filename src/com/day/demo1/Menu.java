package com.day.demo1;

import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	int num;
	boolean con;
	public void showLoginMenu() {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t1,登陆系统");
		System.out.println("\t2,退出");
		System.out.println("***************************");
	}

	public void showMainMenu() {
		System.out.println("我行我素购物系统主菜单");
		System.out.println("***************************");
		System.out.println("\t1，客户信息管理");
		System.out.println("\t2，真情回馈");
		System.out.println("\t3,返回登陆首页");
		System.out.println("***************************");
		
		do {
			con = false;
			System.out.println("请输入您的选择：");
			num = input.nextInt();
			if (num == 1) {
				showCustMenu();
			}else if(num==2){
				showSendgMenu();
			}else if(num==3){
				showLoginMenu();
			}else {
				System.out.println("输入的有误，请重新选择！");
				con =true;
			}
		} while (con == true);
	}

	public void showCustMenu() {
		System.out.println("我行我素购物管理系统>客户信息管理");
		System.out.println("***************************");
		System.out.println("\t1.返回我行我素购物主菜单");
		System.out.println("\t2,显示所有客户信息");
		System.out.println("\t3，添加客户信息");
		System.out.println("\t4，修改客户信息");
		System.out.println("\t5，查询客户信息");
		
		System.out.println("***************************");
		
		do{
			con = false;
			System.out.println("请输入您的选择：");
			num = input.nextInt();
			if(num==1){
				showMainMenu();
			}else if(num==2){
				System.out.println("执行显示所有客户信息");
				showCustMenu();
			}else if(num==3){
				System.out.println("执行添加客户信息");
				showCustMenu();
			}else if(num==4){
				System.out.println("执行修改客户信息");
				showCustMenu();
			}else if(num==5){
				System.out.println("执行查询客户信息");
				showCustMenu();
			}else {
				System.out.println("输入的有误，请重新选择！");
				con =true;
			}
			
		}while(con==true);
	}

	public void showSendgMenu() {
		System.out.println("我行我素购物管理系统>真情回馈");
		System.out.println("***************************");
		System.out.println("\t1.返回我行我素购物主菜单");
		System.out.println("\t2，幸运大派送");
		System.out.println("\t3，幸运抽奖");
		System.out.println("\t4，生日问候");
		System.out.println("\t0,返回登陆首页");
		System.out.println("***************************");
		do{
			con =false;
			System.out.println("请输入您的选择：");
			num = input.nextInt();
			if(num==1){
				showMainMenu();
			}else if(num==2){
				System.out.println("执行幸运大派送");
				showSendgMenu();
			}else if(num==3){
				System.out.println("执行幸运抽奖");
				showSendgMenu();
			}else if(num==4){
				System.out.println("执行生日问候");
				showSendgMenu();
			}else if(num==0){
				showLoginMenu();
			}else{
				System.out.println("输入的有误，请重新选择！");
				con =true;
			}
		}while(con==true);
		
	}
}
