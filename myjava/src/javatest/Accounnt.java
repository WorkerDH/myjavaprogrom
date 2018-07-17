package javatest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Accounnt extends JFrame{
	String[][] a;
	Object[][] inform=a;
	private static final long serialVersionUID = 3797857541795977543L;
	static int i=0,panduan=0;
	 private JPanel panelMain = new JPanel();
	private JTextArea jta;
	private Container contentPane;
	public void AccountFrame(){
		JDBCDemo jdbc=new JDBCDemo();
		String [][] data;
		data=jdbc.alldata();
		
		panelMain.setLayout(new BorderLayout());
		setJta(new JTextArea());
	
		this.setContentPane(panelMain);
		this.setTitle("账号首页");
		this.setSize(900,600);
		this.setLocation(250,100);
		contentPane = this.getContentPane();
		
		JPanel panelsearch=new JPanel();
		final JPanel panelprocess=new JPanel();
		final JPanel paneladd=new JPanel();
		final JPanel panelinsert=new JPanel();
		final JPanel panelfirst=new JPanel();
		final JPanel paneldelete=new JPanel();
		final JPanel paneldeletebtn=new JPanel();	
		final JPanel panelupdatabtn=new JPanel();	
		final JPanel panelupdata=new JPanel();	
		
		   Object[][] information = data;
			   //{
            // 创建表格中的数据
            //{ "张三", "jdiansf32435", "15635446544", "成都"},
            //{ "李四","fgdhe436536", "1235796443", "上海"},
            //{ "王二麻子", "ert345yhnf", "23435567", "达州	"},
            //{ "黄老板", "34trgnfh4", "8208820", "广州"},
			//};
    // 创建表格中的横标题
    String[] Names = { "账号", "密码", "联系方式", "地址" };
    // 以Names和playerInfo为参数，创建一个表格
    JTable table = new JTable(information, Names);
	table.getTableHeader().setReorderingAllowed(false);
	table.setEnabled(false);
    // 设置此表视图的首选大小
   //table.setPreferredScrollableViewportSize(new Dimension(600, 400));
    // 将表格加入到滚动条组件中
    JScrollPane scrollPane = new JScrollPane(table);
	panelfirst.add(scrollPane, BorderLayout.CENTER);
    //f.getContentPane().add(scrollPane, BorderLayout.CENTER);
		final JButton addbttn=new JButton("add");
		addbttn.setBackground(Color.GRAY);
		addbttn.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				String text=addbttn.getText();
				i++;
				if(text.equals("save")){
					
					text="add";
					if((i%2)==0){
					JOptionPane.showMessageDialog(null,"您已成功保存！","消息框",JOptionPane.INFORMATION_MESSAGE);
					
					}
					else{
						JOptionPane.showMessageDialog(null,"保存失败","消息框",JOptionPane.WARNING_MESSAGE);
						
					}
				}
			   else{
				   text="save";
				   panelMain.setVisible(false);
					panelMain.setVisible(true);
			   }
				addbttn.setText(text);
			}
		});
		
		JButton exitbtn=new JButton("back");
		exitbtn.setBackground(Color.GRAY);
		exitbtn.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				Accounnt.this.panelMain.remove(paneladd);
					Accounnt.this.panelMain.remove(panelinsert);
					Accounnt.this.panelMain.remove(paneldelete);
					Accounnt.this.panelMain.remove(paneldeletebtn);
					Accounnt.this.panelMain.remove(panelupdata);
					Accounnt.this.panelMain.remove(panelupdatabtn);
				  Accounnt.this.panelMain.add(panelfirst,BorderLayout.CENTER);
				  Accounnt.this.panelMain.add(panelprocess,BorderLayout.SOUTH);
				
				System.out.println(i+"ER");
				panelMain.setVisible(false);
				panelMain.setVisible(true);	
			}
		});
		JButton search=new JButton("search");//为其设置搜索事件，并显示在表中？？？？？？？？？？？？？？？？？？？？？？？？？？？
		search.setBackground(Color.WHITE);
		search.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
			   
				if(i%2==0){
					Accounnt.this.panelMain.remove(panelfirst);
					Accounnt.this.panelMain.remove(panelprocess);
					Accounnt.this.panelMain.add(paneladd,BorderLayout.CENTER);
					Accounnt.this.panelMain.add(panelinsert,BorderLayout.SOUTH);
					panelMain.setVisible(false);
					panelMain.setVisible(true);
					System.out.println(i+"YI");
				}
				if((i%2)!=0){
					Accounnt.this.panelMain.remove(paneladd);
					Accounnt.this.panelMain.remove(panelinsert);
				  Accounnt.this.panelMain.add(panelfirst,BorderLayout.CENTER);
				  Accounnt.this.panelMain.add(panelprocess,BorderLayout.SOUTH);
				
				System.out.println(i+"ER");
				panelMain.setVisible(false);
				panelMain.setVisible(true);	
				}
				i=i+1;
			}
		});
		
		JButton addbtn=new JButton("add");
		addbtn.setBackground(Color.GRAY);
		addbtn.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Accounnt.this.panelMain.remove(panelfirst);
					Accounnt.this.panelMain.remove(panelprocess);
					panelinsert.add(exitbtn);
					Accounnt.this.panelMain.add(paneladd,BorderLayout.CENTER);
					Accounnt.this.panelMain.add(panelinsert,BorderLayout.SOUTH);
					panelMain.setVisible(false);
					panelMain.setVisible(true);
			}
		});
		JButton deletebtn=new JButton("delete");//为其设置删除账号数据时间，并给出提示，是否成功删除，默认按id编号删除？？？？？？？？？？？
		deletebtn.addActionListener(//为按钮添加事件监听器
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Accounnt.this.panelMain.remove(panelfirst);
							Accounnt.this.panelMain.remove(panelprocess);
							paneldeletebtn.add(exitbtn);
							Accounnt.this.panelMain.add(paneldelete,BorderLayout.CENTER);
							Accounnt.this.panelMain.add(paneldeletebtn,BorderLayout.SOUTH);
							panelMain.setVisible(false);
							panelMain.setVisible(true);
					}
				});
		JButton delete=new JButton("delete");//为其设置删除账号数据时间，并给出提示，是否成功删除，默认按id编号删除？？？？？？？？？？？
		delete.setBackground(Color.GRAY);
		delete.addActionListener(//为按钮添加事件监听器
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						//设置事件删除操作 
					}
				});
		JButton updatabtn=new JButton("updata");//为其设置修改账号信息的事件，使用网格布局，并调整网格大小？？？？？？？？？???????????????????????????????????????????????????????????????????
		
		updatabtn.addActionListener(//为按钮添加事件监听器
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Accounnt.this.panelMain.remove(panelfirst);
						Accounnt.this.panelMain.remove(panelprocess);
						panelupdatabtn.add(exitbtn);
						Accounnt.this.panelMain.add(panelupdata,BorderLayout.CENTER);
						Accounnt.this.panelMain.add(panelupdatabtn,BorderLayout.SOUTH);
						panelMain.setVisible(false);
						panelMain.setVisible(true);//设置事件删除操作 
					}
				});
		deletebtn.setBackground(Color.GRAY);
		updatabtn.setBackground(Color.GRAY);
		
		JButton updata=new JButton("updata");
		updata.setBackground(Color.GRAY);
		updata.addActionListener(//为按钮添加事件监听器
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						System.out.println("判断更新一条数据或者更新一条数据不做判断");
						
						//设置数据更新操作 
					}
				});
		
		
		JLabel namelabel=new JLabel   ("                                                                                        请  输入您要增加的账号名 :");
		JLabel accountlabel=new JLabel("                                                                                        请输入您要增加的联系方式:");
		JLabel passlabel=new JLabel   ("                                                                                        请输入您要增加的账号密码:");
		JLabel beizhulabel=new JLabel ("                                                                                        请        输        入       地       址  :");
		
		JLabel deletenamelabel=new JLabel   ("                                                                                请 输入您要删除增加的账号名 :");
		JLabel deleteaccountlabel=new JLabel("                                                                                 请 输入您要删除的联系方式  :");
		JLabel deletepasslabel=new JLabel   ("                                                                                  请输入您要删除的账号密码:");
		JLabel deleteadresslabel=new JLabel ("                                                                                请   输   入    要   删   除    地    址 :");
		

		JLabel deletanamebiaoqian=new JLabel   (">>>-----------------修改后的数据------------------------->>>");
		JLabel deletaaccountbiaoqian=new JLabel   (">>>-----------------修改后的数据------------------------->>>");
		JLabel deletapassbiaoqian=new JLabel   (">>>-----------------修改后的数据------------------------->>>");
		JLabel deleteadressbiaoqian=new JLabel   (">>>-----------------修改后的数据------------------------->>>");
		
		
		JTextField txtsearch=new JTextField();
		JTextField name=new JTextField("name");
		JTextField account=new JTextField("account");
		JTextField password=new JTextField("password");
		JTextField adress=new JTextField("adresss");
		
		JTextField deletename=new JTextField("---");
		JTextField deleteaccount=new JTextField("---");
		JTextField deletepass=new JTextField("---");
		JTextField deleteadress=new JTextField("---");
		
		
		//定义数据的更改所需文本框
		JTextField oldname=new JTextField();
		JTextField oldaccount=new JTextField();
		JTextField oldpass=new JTextField();
		JTextField oldadress=new JTextField();
		JTextField newname=new JTextField();
		JTextField newaccount=new JTextField();
		JTextField newpass=new JTextField();
		JTextField newadress=new JTextField();
		
		this.setLayout(new BorderLayout());
		panelfirst.setLayout(new BorderLayout());
		panelfirst.add(scrollPane, BorderLayout.CENTER);
		paneladd.setLayout(new GridLayout(4,2,20,20));
		panelupdata.setLayout(new GridLayout(4,3,10,30));
		panelsearch.setLayout(new BorderLayout());
		panelinsert.setLayout(new FlowLayout());
		paneldeletebtn.setLayout(new FlowLayout());
		paneldelete.setLayout(new FlowLayout());
		paneldelete.setLayout(new GridLayout(4,2,20,30));
		
		paneladd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
	    panelsearch.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelprocess.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelfirst.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelinsert.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		
		panelsearch.setBackground(Color.RED);
		////
		panelinsert.add(addbttn);
	    paneldelete.add(deletenamelabel);
	    paneldelete.add(deletename);
	    paneldelete.add(deleteaccountlabel);
	    paneldelete.add(deleteaccount);
	    paneldelete.add(deletepasslabel);
	    paneldelete.add(deletepass);
	    paneldelete.add(deleteadresslabel);
	    paneldelete.add(deleteadress);
	    
	    paneldeletebtn.add(delete);
	  // paneldeletebtn.add(exitbtn);
	   
		paneladd.add(namelabel);
		paneladd.add(name);
		paneladd.add(accountlabel);
		paneladd.add(account);
		paneladd.add(passlabel);
		paneladd.add(password);
		paneladd.add(beizhulabel);
		paneladd.add(adress);
		//数据修改中级容器布局,一共四行，按网格布局格式进行添加
		panelupdatabtn.add(updata);
		
		panelupdata.add(oldname);
		panelupdata.add(deletanamebiaoqian);
		panelupdata.add(newname);
		
		panelupdata.add(oldaccount);
		panelupdata.add(deletaaccountbiaoqian);
		panelupdata.add(newaccount);
		
		panelupdata.add(oldpass);
		panelupdata.add(deletapassbiaoqian);
		panelupdata.add(newpass);
		
		panelupdata.add(oldadress);
		panelupdata.add(deleteadressbiaoqian);
		panelupdata.add(newadress);
		
		
		
		panelsearch.add(txtsearch);
		panelsearch.add(search,BorderLayout.EAST);
		panelprocess.setLayout(new FlowLayout());
		panelprocess.add(addbtn);
		panelprocess.add(updatabtn);
		panelprocess.add(deletebtn);
		
        panelsearch.setBackground(Color.RED);
        
       // panelMain.add(paneldeletebtn,BorderLayout.SOUTH);
        //panelMain.add(paneldelete,BorderLayout.CENTER);
        
		panelMain.add(panelfirst,BorderLayout.CENTER);
		panelMain.add(panelprocess,BorderLayout.SOUTH);
		
		this.add(panelsearch,BorderLayout.NORTH);
		
		this.setVisible(true);
		
		search.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				
			Accounnt.this.getLayout().removeLayoutComponent(panelfirst);
				 Accounnt.this.add(paneladd);
				 paneladd.setVisible(true);
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setJta(JTextArea jta) {
		this.jta = jta;
	}
	public JTextArea getJta() {
		return jta;
	}
	public static void main(String args[]){
		Accounnt start=new Accounnt();
		start.AccountFrame();
	}
	
	
}