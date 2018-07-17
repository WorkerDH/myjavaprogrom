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
		System.out.println("             欢迎使用系统");
		System.out.println("            1.添加数据");
		System.out.println("            2.修改数据");
		System.out.println("            3.删除数据");
		System.out.println("            4.显示呢所有数据");
		System.out.println("            5.查询");
		System.out.println("            6.退出");
		System.out.println("===========================================");
		
		while(result) {
			System.out.println("请输入您要执行的操作：");
			select=scanner.nextInt();
			boolean decide=true;
			
			if(select<1||select>6) {
				System.out.println("您输入的操作命令有误，请重新输入：");
				result=true;
			}
			else {
				result=true;
					switch(select) {
					case 1:
						System.out.println("请输入您要添加的书籍信息");
						value=scanner.next();
						String[] newvalue=value.split(",");
						run.Insert_Book(Integer.parseInt(newvalue[0]), newvalue[1], newvalue[2],newvalue[3]);
						break;
					case 2:
						decide=false;
						System.out.println("请输入您要修改的书籍id编号");
						id=scanner.nextInt();
						System.out.println("请输入您要修改的书籍信息");
						value=scanner.next();
						String[] newvalue1=value.split(",");
						run.Updata_Book(id,newvalue1[0], newvalue1[1],newvalue1[2]);
						break;
					case 3:
						
						System.out.println("请输入您要删除的书籍编号");
						id=scanner.nextInt();
						run.Delete_Book(id);
						break;
					case 4:
						
						System.out.println("查询所有书籍：");
						
						run.All_Book();
						break;
					case 5:
						result=true;
						System.out.println("1、按书籍名：");
						System.out.println("2、按出版商：");
						System.out.println("3、按作者：");
						System.out.println("请输入您想要进行的搜索：");
						int desion=scanner.nextInt();
						switch(desion)
						{
						case 1:
							System.out.println("请输入你想要查找的内容：");
						String book_name=scanner.next();
						run.Query_BookName(book_name);
						break;
						case 2:
							System.out.println("请输入你想要查找的内容：");
						String book_publishers=scanner.next();
						run.Query_Publishers(book_publishers);
						break;
						case 3:
							System.out.println("请输入你想要查找的内容：");
						String book_author=scanner.next();
						run.Query_author(book_author);
						break;
						default:
							System.out.println("您输入的指令有误！");
							break;
						}
						
						//System.out.println("请输入你想要查找的内容：");
						//value=scanner.next();
						break;
					case 6:
						System.out.println("退出程序");
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
