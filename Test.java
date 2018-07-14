import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Accounnt extends JFrame{
	
	 static int i=0,panduan=0;
	 private JPanel panelMain = new JPanel();
	public void AccountFrame(){
		
		panelMain.setLayout(new BorderLayout());
		JTextArea jta = new JTextArea();
		
		this.setContentPane(panelMain);
		this.setTitle("账号首页");
		this.setSize(900,600);
		this.setLocation(250,100);
		Container contentPane=this.getContentPane();
		//folling=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel panelsearch=new JPanel();
		JPanel panelprocess=new JPanel();
		JPanel paneladd=new JPanel();
		JPanel panelinsert=new JPanel();
		JPanel panelfirst=new JPanel();
		   Object[][] information = {
            // 创建表格中的数据
            { "张三", "jdiansf32435", "15635446544", "成都"},
            { "李四","fgdhe436536", "1235796443", "上海"},
            { "王二麻子", "ert345yhnf", "23435567", "达州	"},
            { "黄老板", "34trgnfh4", "8208820", "广州"},
            { "赵兵", "45yghnf", "23565786", "北京"},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			{ "", "", "", ""},
			
			};
    // 创建表格中的横标题
    String[] Names = { "账号", "密码", "联系方式", "地址" };
    // 以Names和playerInfo为参数，创建一个表格
    JTable table = new JTable(information, Names);
	
    // 设置此表视图的首选大小
   //table.setPreferredScrollableViewportSize(new Dimension(600, 400));
    // 将表格加入到滚动条组件中
    JScrollPane scrollPane = new JScrollPane(table);
	panelfirst.add(scrollPane, BorderLayout.CENTER);
    //f.getContentPane().add(scrollPane, BorderLayout.CENTER);
		JButton addbttn=new JButton("add");
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
				  Accounnt.this.panelMain.add(panelfirst,BorderLayout.CENTER);
				  Accounnt.this.panelMain.add(panelprocess,BorderLayout.SOUTH);
				
				System.out.println(i+"ER");
				panelMain.setVisible(false);
				panelMain.setVisible(true);	
			}
		});
		JButton search=new JButton("search");
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
					Accounnt.this.panelMain.add(paneladd,BorderLayout.CENTER);
					Accounnt.this.panelMain.add(panelinsert,BorderLayout.SOUTH);
					panelMain.setVisible(false);
					panelMain.setVisible(true);
			}
		});
		JButton deletebtn=new JButton("delete");
		JButton insertbtn=new JButton("insert");
		deletebtn.setBackground(Color.GRAY);
		insertbtn.setBackground(Color.GRAY);
		
		JLabel namelabel=new JLabel("name:");
		JLabel accountlabel=new JLabel("account:");
		JLabel passlabel=new JLabel("password:");
		JLabel beizhulabel=new JLabel("beizhu:");
		
		
		
		JTextField txtsearch=new JTextField();
		JTextField name=new JTextField("请输入账号名称");
		JTextField account=new JTextField("请输入联系方式");
		JTextField password=new JTextField("请输入密码");
		JTextField beizhu=new JTextField("描述信息");
		
		this.setLayout(new BorderLayout());
		
		panelfirst.setLayout(new BorderLayout());
		panelfirst.add(scrollPane, BorderLayout.CENTER);
		paneladd.setLayout(new GridLayout(4,2,5,10));
		
		paneladd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
	    panelsearch.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelprocess.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelfirst.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		panelinsert.setBorder(BorderFactory.createLineBorder(Color.gray,2));
		
		panelsearch.setLayout(new BorderLayout());
		panelsearch.setBackground(Color.RED);
		panelinsert.setLayout(new FlowLayout());
		panelinsert.add(addbttn);
		panelinsert.add(exitbtn);
		
		
		paneladd.add(namelabel);
		paneladd.add(name);
		paneladd.add(accountlabel);
		paneladd.add(account);
		paneladd.add(passlabel);
		paneladd.add(password);
		paneladd.add(beizhulabel);
		paneladd.add(beizhu);
		panelsearch.add(txtsearch);
		panelsearch.add(search,BorderLayout.EAST);
		panelprocess.setLayout(new FlowLayout());
		panelprocess.add(addbtn);
		panelprocess.add(deletebtn);
		panelprocess.add(insertbtn);
        panelsearch.setBackground(Color.RED);
		
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
	public static void main(String args[]){
		Accounnt start=new Accounnt();
	   
		start.AccountFrame();
	}	
	
	
}
/* class Test	extends JFrame
{
	public void add(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame=new JFrame("admin");
		frame.setSize(600,375);
		Container contentPane=frame.getContentPane();
		JPanel frameset1=new JPanel();
		JPanel panelsearch=new JPanel();
		panelsearch.setLayout(new BorderLayout());
		
		frameset1.setBorder(BorderFactory.createLineBorder(Color.gray,4));
	    frameset1.setSize(600,300);
		JPanel frameset2=new JPanel();
		frameset2.setLayout(null);
		frameset2.setSize(100,400);
		frameset2.setBorder(BorderFactory.createLineBorder(Color.gray,4));
		frame.setLocation(300,300);
		frameset1.setLayout(new GridLayout(4,2,5,10));
		//编辑标签
		JLabel namelabel=new JLabel("name:");
		JLabel accountlabel=new JLabel("account:");
		JLabel passlabel=new JLabel("password:");
		JLabel beizhulabel=new JLabel("beizhu:");
		//对文本框进行设置
		JTextField name=new JTextField("请输入账号名称");
		JTextField account=new JTextField("请输入联系方式");
		JTextField password=new JTextField("请输入密码");
		JTextField beizhu=new JTextField("描述信息");
		
		JTextField txtsearch=new JTextField();
		
		//对按钮进行设置
		JButton search=new JButton("search");
		JButton exit=new JButton("exit");
		exit.setBounds(310,305,75,30);
		exit.setBackground(Color.GRAY);
		exit.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("退出程序");
				System.exit(-1);
			}
		});
		JButton enter=new JButton("enter");
		
		enter.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Test show=new Test();
				String a=name.getText();
				String b=account.getText();
				String c=password.getText();
				String d=beizhu.getText();
				//frame.setVisible(false);
				show.xianshi(a,b,c,d);
			}
		});
		enter.setBounds(190,305,75,30);
		enter.setBackground(Color.GRAY);
		
		
		panelsearch.add(search);
		panelsearch.add(txtsearch,BorderLayout.EAST);
		frameset1.add(namelabel);
		frameset1.add(name);
		frameset1.add(accountlabel);
		frameset1.add(account);
		frameset1.add(passlabel);
		frameset1.add(password);
		frameset1.add(beizhulabel);
		frameset1.add(beizhu);
		frameset2.add(exit);
		frameset2.add(enter);
		frameset2.setVisible(true);
		frame.add(panelsearch);
		frame.add(frameset1);
		frame.add(frameset2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//编写询问窗体
	public void xianshi(String namevl,String accountvl,String passwordvl,String beizhuvl){
		JFrame.setDefaultLookAndFeelDecorated(true);
		//System.out.println("qqqqqqq"+name+account+password+beizhu);
		JFrame frame=new JFrame("information");
		Container contentPane=frame.getContentPane();
		frame.setSize(600,430);
		frame.setLocation(0,0);
		
		JPanel frameset1=new JPanel();
		frameset1.setSize(600,300);
		frameset1.setBorder(BorderFactory.createLineBorder(Color.white,4));
		frameset1.setLayout(new GridLayout(4,2,5,10));
		
		JPanel frameset2=new JPanel();
	
		frameset2.setLayout(null);
		frameset2.setBorder(BorderFactory.createLineBorder(Color.white,4));
		JLabel iform=new JLabel("您是否要添加该条账号信息？");
		JButton addyes=new JButton("是");
		addyes.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JOptionPane.showMessageDialog(null,"您将要添加这一条信息","消息框",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		JButton addno=new JButton("否");
		addno.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				frame.setVisible(false);
				Test p=new Test();
		p.addno();
			}
		});
		addyes.setBackground(Color.WHITE);
		addno.setBackground(Color.WHITE);
		iform.setBounds(230,300,140,45);
		addyes.setBounds(200,345,70,35);
		addno.setBounds(310,345,70,35);
		
		JLabel name=new JLabel("name:");
		JLabel account=new JLabel("account:");
		JLabel password=new JLabel("password:");
		JLabel beizhu=new JLabel("beizhu:");
		
		JLabel showname=new JLabel( namevl);
		JLabel showaccount=new JLabel(accountvl);
		JLabel showpassword=new JLabel(passwordvl);
		JLabel showbeizhu=new JLabel(beizhuvl);
		
		frameset1.add(name);
		frameset1.add(showname);
		frameset1.add(account);
		frameset1.add(showaccount);
		frameset1.add(password);
		frameset1.add(showpassword);
		frameset1.add(beizhu);
		frameset1.add(showbeizhu);
		frameset2.add(addyes);
		frameset2.add(iform);
		frameset2.add(addno);
	    frame.add(frameset1);
	    frame.add(frameset2);
		frame.setVisible(true);
		//frameset1.setVisible(true);
	//frameset2.setVisible(true);
		
	}
	//编辑一个对话框取消或者返回
	public void addno(){
		JFrame frame=new JFrame("对话框");
		frame.setSize(300,150);
		frame.setLocation(500,500);
		frame.setLayout(null);
		JLabel iform=new JLabel("您要取消这个添加操作还是返回初始页面？");
		JButton cancel=new JButton("取消");
		cancel.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				Test p=new Test();
				frame.setVisible(false);
		p.add();
			}
		});
		JButton back=new JButton("返回");
		back.addActionListener(//为按钮添加事件监听器
		new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("退出程序");
				
				 System.exit(-1);
			}
		});
		iform.setBounds(25,0,250,45);
		cancel.setBounds(60,50,70,45);
		back.setBounds(150,50,70,45);
		frame.add(iform);
		frame.add(cancel);
		frame.add(back);
		frame.setVisible(true);
		
	}
	public void firstone(){
		
		
		
		
	} 
	
	
} */