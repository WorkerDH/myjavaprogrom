package javatest;

import java.util.Scanner;


public class UI {
	public static void main(String argsp[]) {
		
		System.out.println("===========================================");
		System.out.println("             ��ӭʹ��ϵͳ");
		System.out.println("            1.�������");
		System.out.println("            2.�޸�����");
		System.out.println("            3.ɾ������");
		System.out.println("            4.�˳�");
		System.out.println("===========================================");
		System.out.println("��ѡ����Ҫ���еĲ�����");
	UI run=new UI();
	run.panduan();
		}
		
	public void panduan(){
		UI run=new UI();
		
		System.out.println("��ѡ����Ҫ���еĲ�����");
		int select=0;//�����û���ѡ�
		boolean resent=true;
		boolean decide=true;
		String value=null;
		while(decide) {
		Scanner scanner = null;
		select=scanner.nextInt();
		while(select<1||select>4) {
			System.out.println("ѡ��Ĳ�������ʶ��������ѡ��");
			select=scanner.nextInt();
		}
			switch (select) {
			case 1:
				System.out.println("            1.�������");
				value=scanner.next();
				String[] newnalue=value.split(",",3);
				System.out.println(" �������Ϊ��"+newnalue[0]+newnalue[1]+newnalue[21]);
				
				run.panduan();
				//jdbDemo.testInsertData(int)System.currentTimeNills();value[0],values[1];
				break;
			case 2:
				System.out.println("            2.�޸�����");
				break;
			case 3:
				System.out.println("            3.ɾ������");
				break;
			case 4:
				System.out.println("            4.�˳�");
				decide=false;
				break;
				default:
					break;
			}
		}
		
	}
	}

