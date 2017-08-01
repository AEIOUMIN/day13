package com.day.demo1;

public class StudentsBiz {
	String[] names = new String[30];//学生姓名数组
	/**
	 *示例一：增加学生姓名
	 * @param name 要增加的学生姓名
	 */
	public void addName(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	/**
	 * 显示本班的学生
	 */
	public void showNames(){
		System.out.println("本班学生姓名列表：");
		for(int i=0;i<names.length;i++){
			if(names[i]!=null){
			System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
	/**
	 * 示例二：在一定区间查找学生姓名
	 * @param start
	 * 			开始位置
	 * @param end
	 * 			结束位置
	 * @param name
	 * 			查找的学生姓名
	 * @param find 是否查询成功
	 * 			
	 * 
	 */
	public boolean searchName(int start,int end,String name){
		boolean find =false;//是否找到标记
		//指定区间数组中，查找姓名
		for(int i=start-1;i<end;i++){
			if(names[i].equals(name)){
				find=true;
				break;
			}
		}
		return find;
	}
}
