package javatest;

import java.sql.*;
import java.util.Scanner;



/**
 *create by zn on
 * ��ʾͨ��jdbc�������ݿ�ͽ�������ɾ���ģ���Ĳ���
 */abstract class waibu{
	 Connection connection;
 	Statement statement;
 	ResultSet rs;
 	//Connection connection,Statement statement,ResultSet rs
 public abstract void colse(Connection connection,Statement statement,ResultSet rs);
 }
class getclose extends waibu{
	public  void colse(Connection connection,Statement statement,ResultSet rs) {
			try {
				if(rs!=null) {
    				rs.close();
    			}
				if(statement!=null) {
	    			statement.close();
	    		}
				if(connection!=null) {
					connection.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
public class JDBCDemo {
   
	/**
     *��ʾͨ��jdbc�������ݿ�
     *
     */
	private String dbURL = "jdbc:mysql://localhost:3306/denghong?useSSL=false&serverTimmezone=UTC&serverTimezone=GMT";
    @SuppressWarnings("unused")
	private void tesrConnection(){
    	Connection connection=null;
    	Statement statement=null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("��ʾͨ��jdbc�������ݿ�");

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.�������ݿ������ַ���
		//String dbURL = "jdbc:mysql://localhost:3306/denghong?useSSL=false&serverTimmezone=UTC&serverTimezone=GMT";
		System.out.println("�������ݿ������ַ���");
		//3.�������ݿ�����
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="select * from Admin";
            statement = connection.createStatement();
		    int rows=statement.executeUpdate(sql);
		    System.out.println("sql");
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			colse(connection, statement,null);
		}
        }
    public void insertconnection(int id,String name,String password, String adress,String account) {
    	Connection connection=null;
    	Statement statement=null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}
    	catch(java.lang.Exception exception){
    		 exception.printStackTrace();
    		
    	}
    	try {
    		connection=DriverManager.getConnection(dbURL,"root","980401");
    		String sql="insert into javares values("+id+",'"+name+"','"+password+"','"+adress+"','"+account+"')";
    		statement=connection.createStatement();
    		int rows=statement.executeUpdate(sql);
    		System.out.println("���ɹ�������"+rows+"������");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		colse(connection, statement, null);
    		
    	}
    	
    	
    }
    public void deletconnection(int id) {
    	Connection connection=null;
    	Statement statement=null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
    	}catch(java.lang.Exception exception){
    		exception.printStackTrace();
    	}
    	try {
    	connection=DriverManager.getConnection(dbURL,"root","980401");
    		String sql="delete from javares where id ="+id;
    		statement=connection.createStatement();
    		int rows=statement.executeUpdate(sql);
    		System.out.println("���ɹ�ɾ����"+rows+"������");
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	finally {
    		colse(connection, statement,null);
    		
    	}
    	
    }
    
    
    public void updataconnection(int id,String name,String password,String account) {
    	Connection connection=null;
    	Statement statement=null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch(java.lang.Exception exception) {
    		exception.printStackTrace();
    	}
    	try {
    		connection=DriverManager.getConnection(dbURL,"root","980401");
    		String sql="update javares set name="+"'"+name+"',"+"password="+"'"+password+"','"+account +"where id="+id;
    		statement=connection.createStatement();
    		int rows=statement.executeUpdate(sql);
    		System.out.println("���ɹ��޸���"+rows+"������");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    		
    	}
    	finally {
    		colse(connection, statement, null);
    		
    	}
    	
    	
    }
    public String[][] alldata() {
    	String [][] data=null;
    
    	int index=0;
    	Connection connection=null;
    	Statement statement=null;
    	ResultSet rs=null;
    	try {
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch(java.lang.Exception exception){
    		exception.printStackTrace();
    	}
    	try {
    		connection=DriverManager.getConnection(dbURL,"root","980401");
    		String sql="select * from javares";
    		statement=connection.createStatement();
    		rs=statement.executeQuery(sql);
    		//�����ѯ���
    		System.out.println("�����ѯ���");
    		int id;
    	String name,password,account,adress;
    	while(rs.next()) {
    		id=rs.getInt("id");
    		name=rs.getString("name");
    		password=rs.getString("password");
    		account=rs.getString("account");
    		adress=rs.getString("adress");
    		data[index][0]=String.valueOf(id);
    		data[index][1]=String.valueOf(name);
    		data[index][2]=String.valueOf(password);
    		data[index][3]=String.valueOf(account);
    		data[index][4]=String.valueOf(adress);
    		//System.out.println("id:"+id+"  name:"+name+"     password:"+password+"  account:"+account);
    		index++;
    		
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	finally {
    		
    		//colse(connection, statement, rs);
    	}
    	return data;
    	
    }
    public void queryconnection(String strquery) {
    	String [][] data=null;
    	int index=0;
    	
    	Connection connection=null;
    	Statement statement=null;
    	ResultSet rs=null;
    	try {
    		
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch(java.lang.Exception exception){
    		exception.printStackTrace();
    	}
    	try {
    		connection=DriverManager.getConnection(dbURL,"root","980401");
    		String sql="select * from javares where name like"+"'%"+strquery+"%'";
    		statement=connection.createStatement();
    		rs=statement.executeQuery(sql);
    		//�����ѯ���
    		System.out.println("�����ѯ���");
    		int id;
    	String name,password,account;
    	while(rs.next()) {
    		id=rs.getInt("id");
    		name=rs.getString("name");
    		password=rs.getString("password");
    		account=rs.getString("account");
    		data[index][0]=String.valueOf(id);
    		data[index][1]=String.valueOf(name);
    		data[index][2]=String.valueOf(password);
    		data[index][3]=String.valueOf(account);
    		data[index][4]=String.valueOf(account);
    		//System.out.println("id:"+id+"  name:"+name+"     password:"+password+"  account:"+account);
    		index++;
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	finally {
    		
    		colse(connection, statement, rs);
    	}
    		
    	}
    	
    
    public static void main(String args[]) {
    	JDBCDemo jdbc=new JDBCDemo();
    	Scanner scanner=new Scanner(System.in);
    	int id=0,select=0;
    	boolean resent=true,decide=true;
		String value=null;
    	System.out.println("===========================================");
		System.out.println("             ��ӭʹ��ϵͳ");
		System.out.println("            1.�������");
		System.out.println("            2.�޸�����");
		System.out.println("            3.ɾ������");
		System.out.println("            4.��ѯ����");
		System.out.println("            5.��ʾ��������");
		System.out.println("            6.�˳�");
		System.out.println("===========================================");
		while(decide) {
		System.out.println("��ѡ����Ҫ���еĲ�����");
			select=scanner.nextInt();
			while(select<1||select>5) {
				System.out.println("ѡ��Ĳ�������ʶ��������ѡ��");
				select=scanner.nextInt();
			}
				
				switch (select) {
				case 1:
					
					value=scanner.next();
					String[] newvalue=value.split(",");
					jdbc.insertconnection(Integer.parseInt(newvalue[0]),newvalue[1],newvalue[2],newvalue[3],newvalue[4]);
					//System.out.println(" �������Ϊ��"+newnalue[0]+newnalue[1]+newnalue[2]);
					//jdbDemo.testInsertData(int)System.currentTimeNills();value[0],values[1];
					break;
				case 2:
					System.out.print("����������Ҫ�޸ĵ�id��");
					id=scanner.nextInt();
					System.out.println("����������Ҫ�޸ĺ�����ݣ�");
					value=scanner.next();
					String[] valueupdata1=value.split(",",3);
					jdbc.updataconnection(id,valueupdata1[0],valueupdata1[1],valueupdata1[2]);
					break;
				case 3:
					System.out.print("��������Ҫɾ�������ݵ�id���:");
					id=scanner.nextInt();
					jdbc.deletconnection(id);
					break;
				case 4:
					System.out.print("����������Ҫ��ѯ�Ĺؼ���");
					String str=scanner.next();
					jdbc.queryconnection(str);
					break;
				case 5:
					jdbc.alldata();
					break;
				case 6:
					System.out.println("�ɹ��˳�����");
					decide=false;
					break;
					default:
						break;
				}
			}
    	
    	
    	
    	
    }
    public  void colse(Connection connection,Statement statement,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(statement!=null) {
    			statement.close();
    		}
			if(connection!=null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
//String sql="insert into AdminPass"+"values("+"id"','"+account+"','+"password+",)";
