package com.day.demo;

import java.util.Scanner;

public class TestAvgTotal {
	public static void main(String[] args) {
		AvgTotal avgTotal = new AvgTotal();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入JAVA的成绩：");
		avgTotal.java =input.nextInt();
		System.out.print("请输入C#的成绩：");
		avgTotal.c =input.nextInt();
		System.out.print("请输入DB的成绩：");
		avgTotal.db =input.nextInt();
		
		avgTotal.totalScore();
		avgTotal.avgScore();
	}
}
