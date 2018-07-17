package javatest;

import java.util.Scanner;


public class UI {
	public static void main(String argsp[]) {
		
		System.out.println("===========================================");
		System.out.println("             欢迎使用系统");
		System.out.println("            1.添加数据");
		System.out.println("            2.修改数据");
		System.out.println("            3.删除数据");
		System.out.println("            4.退出");
		System.out.println("===========================================");
		System.out.println("请选择你要进行的操作：");
	UI run=new UI();
	run.panduan();
		}
		
	public void panduan(){
		UI run=new UI();
		
		System.out.println("请选择你要进行的操作：");
		int select=0;//接受用户的选项；
		boolean resent=true;
		boolean decide=true;
		String value=null;
		while(decide) {
		Scanner scanner = null;
		select=scanner.nextInt();
		while(select<1||select>4) {
			System.out.println("选择的操作不能识别，请重新选择");
			select=scanner.nextInt();
		}
			switch (select) {
			case 1:
				System.out.println("            1.添加数据");
				value=scanner.next();
				String[] newnalue=value.split(",",3);
				System.out.println(" 添加数据为："+newnalue[0]+newnalue[1]+newnalue[21]);
				
				run.panduan();
				//jdbDemo.testInsertData(int)System.currentTimeNills();value[0],values[1];
				break;
			case 2:
				System.out.println("            2.修改数据");
				break;
			case 3:
				System.out.println("            3.删除数据");
				break;
			case 4:
				System.out.println("            4.退出");
				decide=false;
				break;
				default:
					break;
			}
		}
		
	}
	}

