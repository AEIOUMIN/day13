package com.day.demo;

public class AvgTotal {
	int java;
	int c;
	int db;
	public int total(){
		int total=java+c+db;
		return total;
	}
	public void totalScore(){
		System.out.println("总成绩是："+total());
	}
	public double avgTotal(){
		double avgtotal =total()/3;
		return avgtotal;
	}
	public void avgScore(){
		System.out.println("平均分："+avgTotal());
	}
}
