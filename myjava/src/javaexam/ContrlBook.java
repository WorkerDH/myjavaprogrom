package javaexam;

import java.util.Scanner;

public class ContrlBook {
	public void admin() {
		Scanner scanner=new Scanner(System.in);
		boolean result=true;
		JDBCbook run=new JDBCbook();
		int select,id;
		String value;
		System.out.println("===========================================");
		System.out.println("             ��ӭʹ��ϵͳ");
		System.out.println("            1.�������");
		System.out.println("            2.�޸�����");
		System.out.println("            3.ɾ������");
		System.out.println("            4.��ʾ����������");
		System.out.println("            5.��ѯ");
		System.out.println("            6.�˳�");
		System.out.println("===========================================");
		
		while(result) {
			System.out.println("��������Ҫִ�еĲ�����");
			select=scanner.nextInt();
			boolean decide=true;
			
			if(select<1||select>6) {
				System.out.println("������Ĳ��������������������룺");
				result=true;
			}
			else {
				result=true;
					switch(select) {
					case 1:
						System.out.println("��������Ҫ��ӵ��鼮��Ϣ");
						value=scanner.next();
						String[] newvalue=value.split(",");
						run.Insert_Book(Integer.parseInt(newvalue[0]), newvalue[1], newvalue[2],newvalue[3]);
						break;
					case 2:
						decide=false;
						System.out.println("��������Ҫ�޸ĵ��鼮id���");
						id=scanner.nextInt();
						System.out.println("��������Ҫ�޸ĵ��鼮��Ϣ");
						value=scanner.next();
						String[] newvalue1=value.split(",");
						run.Updata_Book(id,newvalue1[0], newvalue1[1],newvalue1[2]);
						break;
					case 3:
						
						System.out.println("��������Ҫɾ�����鼮���");
						id=scanner.nextInt();
						run.Delete_Book(id);
						break;
					case 4:
						
						System.out.println("��ѯ�����鼮��");
						
						run.All_Book();
						break;
					case 5:
						result=true;
						System.out.println("1�����鼮����");
						System.out.println("2���������̣�");
						System.out.println("3�������ߣ�");
						System.out.println("����������Ҫ���е�������");
						int desion=scanner.nextInt();
						switch(desion)
						{
						case 1:
							System.out.println("����������Ҫ���ҵ����ݣ�");
						String book_name=scanner.next();
						run.Query_BookName(book_name);
						break;
						case 2:
							System.out.println("����������Ҫ���ҵ����ݣ�");
						String book_publishers=scanner.next();
						run.Query_Publishers(book_publishers);
						break;
						case 3:
							System.out.println("����������Ҫ���ҵ����ݣ�");
						String book_author=scanner.next();
						run.Query_author(book_author);
						break;
						default:
							System.out.println("�������ָ������");
							break;
						}
						
						//System.out.println("����������Ҫ���ҵ����ݣ�");
						//value=scanner.next();
						break;
					case 6:
						System.out.println("�˳�����");
						result=false;
						break;
				default:
							break;
					
					}
				
			}
			
			
		}
	}
public static void main(String args[]) {
	ContrlBook run= new ContrlBook();
	run.admin();
}
}
