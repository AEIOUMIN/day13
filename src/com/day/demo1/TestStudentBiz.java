package com.day.demo1;

import java.util.Scanner;

public class TestStudentBiz {
	/**
	 * 调用三个带参数的方法
	 */
	public static void main(String[] args) {
		StudentsBiz st =new StudentsBiz();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.print("请输入学生姓名：");
			String newName =input.next();
			st.addName(newName);
		} 
		st.showNames();
		System.out.print("请输入开始查找的位置：");
		int s =input.nextInt();
		System.out.print("请输入结束查找的位置：");
		int e =input.nextInt();
		System.out.print("请输入查找的姓名：");
		String name =input.next();
		System.out.println("\n*****查找结果*****");
		if(st.searchName(s, e, name)){
			System.out.println("找到了！");
		}else{
			System.out.println("没找到该学生！");
		}
	}
}
