package javaexam;
import java.sql.*;



class JDBCbook {
	Connection connection=null;
	Statement statement=null;
	ResultSet rs=null;
	int index=0;
	String dbURL = "jdbc:mysql://localhost:3306/denghong?useSSL=false&serverTimmezone=UTC&serverTimezone=GMT";
	private String[][] datas;
	private String[][] datas3;
	private String[][] datas4;
	private String[][] datas2s;
	public void Insert_Book(int id,String name,String publishers,String author){//查询所有书籍
    	Connection connection=null;
    	Statement statement=null;
    	        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.创建数据库连接字符串
		
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="insert into adminbook (id,book_name,book_publishers,book_author)values("+id+",'"+name+"','"+publishers+"','"+author+"')";
            statement = connection.createStatement();
            int rows=statement.executeUpdate(sql);
		    System.out.println("您已成功添加"+rows+"条数据");
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	public void Updata_Book(int id,String name,String publishers,String author){//查询所有书籍
    	Connection connection=null;
    	Statement statement=null;
    	
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.创建数据库连接字符串
		 
		//3.建立数据库连接
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="update adminbook set book_name="+"'"+name+"',"+"book_publishers="+"'"+publishers+"',book_author='"+author +"'where id="+id;
            statement = connection.createStatement();
            int rows=statement.executeUpdate(sql);
		    System.out.println("您已成功修改"+rows+"条数据");
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	public void Delete_Book(int id){//查询所有书籍
    	Connection connection=null;
    	Statement statement=null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.创建数据库连接字符串
		 
		//3.建立数据库连接
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="delete * from adminbook where id="+id;
            statement = connection.createStatement();
            int rows=statement.executeUpdate(sql);
		    System.out.println("您已成功删除了"+rows+"条数据");
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	public void Query_Publishers(String book_publishers){//查询书籍
    	Connection connection=null;
    	Statement statement=null;
    	datas4 = null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		     

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		 
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="select * from adminbook where book_name like "+"'%"+book_publishers+"%'";
            statement = connection.createStatement();
            rs=statement.executeQuery(sql);
		    System.out.println("sql");
		    int id;
		    String name,publishers,author;
		    while(rs.next()) {
	    		id=rs.getInt("id");
	    		name=rs.getString("book_name");
	    		publishers=rs.getString("book_publishers");
	    		author=rs.getString("book_author");
	    		//时间
	    		datas4[index][0]=String.valueOf(id);
	    		datas4[index][1]=String.valueOf(name);
	    		datas4[index][2]=String.valueOf(publishers);
	    		datas4[index][3]=String.valueOf(author);
	    		
	    		System.out.println("id:"+id+" book_name:"+name+"     book_publishers:"+publishers+"  book_author:"+author);
	    		index++;
	    	}
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	public void Query_author(String book_author){//查询书籍
    	Connection connection=null;
    	Statement statement=null;
    	datas3 = null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		   

		} catch (java.lang.Exception exception) {
		  
		}
		//2.创建数据库连接字符串
		System.out.println("创建数据库连接字符串");
		//3.建立数据库连接
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="select * from adminbook where book_name like"+ "'%"+book_author+"%''";
            statement = connection.createStatement();
            rs=statement.executeQuery(sql);
		    System.out.println("sql");
		    
		    String name,publishers,author;
		    while(rs.next()) {
		    	int id=rs.getInt("id");
	    		name=rs.getString("book_name");
	    		publishers=rs.getString("book_publishers");
	    		author=rs.getString("book_author");
	    		//时间
	    		datas3[index][0]=String.valueOf(id);
	    		datas3[index][1]=String.valueOf(name);
	    		datas3[index][2]=String.valueOf(publishers);
	    		datas3[index][3]=String.valueOf(author);
	    		
	    		System.out.println("id:"+id+" book_name:"+name+"     book_publishers:"+publishers+"  book_author:"+author);
	    		index++;
	    	}
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	public void Query_BookName(String book_name){//查询书籍
    	Connection connection=null;
    	Statement statement=null;
    	datas = null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		   

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.创建数据库连接字符串
		 
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="select * from adminbook where book_name like "+"'%"+book_name+"%'";
            statement = connection.createStatement();
            rs=statement.executeQuery(sql);
		    String name,publishers,author;
			Timestamp time;
		    
		    while(rs.next()) {
		    	int id=rs.getInt("id");
	    		name=rs.getString("book_name");
	    		publishers=rs.getString("book_publishers");
	    		author=rs.getString("book_author");
	    		time=rs.getTimestamp("create_time");
	    		datas[index][0]=String.valueOf(id);
	    		datas[index][1]=String.valueOf(name);
	    		datas[index][2]=String.valueOf(publishers);
	    		datas[index][3]=String.valueOf(time);
	    		
	    		System.out.println("id:"+id+" book_name:"+name+"     book_publishers:"+publishers+"  book_author:"+author+"time:"+time);
	    		index++;
	    	}
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
		}
        }
	
	public void All_Book(){//查询所有书籍
    	Connection connection=null;
    	Statement statement=null;
    	String[][]  data = null;
        try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		 

		} catch (java.lang.Exception exception) {
		    exception.printStackTrace();
		}
		//2.创建数据库连接字符串
	 
		//3.建立数据库连接
		try {
			connection = DriverManager.getConnection(dbURL, "root", "980401");
		    String sql="select * from adminbook";
            statement = connection.createStatement();
            rs=statement.executeQuery(sql);
		    String name,publishers,author;
		    while(rs.next()) {
	    		int id=rs.getInt("id");
	    		name=rs.getString("book_name");
	    		publishers=rs.getString("book_publishers");
	    		author=rs.getString("book_author");
	    		//时间
	    		data[index][0]=String.valueOf(id);
	    		data[index][1]=String.valueOf(name);
	    		data[index][2]=String.valueOf(publishers);
	    		data[index][3]=String.valueOf(author);
	    		
	    		System.out.println("id:"+id+" book_name:"+name+"     book_publishers:"+publishers+"  book_author:"+author);
	    		index++;
	    	}
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
			this.colse(connection, statement,null);
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
