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
		this.setTitle("�˺���ҳ");
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
            // ��������е�����
            //{ "����", "jdiansf32435", "15635446544", "�ɶ�"},
            //{ "����","fgdhe436536", "1235796443", "�Ϻ�"},
            //{ "��������", "ert345yhnf", "23435567", "����	"},
            //{ "���ϰ�", "34trgnfh4", "8208820", "����"},
			//};
    // ��������еĺ����
    String[] Names = { "�˺�", "����", "��ϵ��ʽ", "��ַ" };
    // ��Names��playerInfoΪ����������һ�����
    JTable table = new JTable(information, Names);
	table.getTableHeader().setReorderingAllowed(false);
	table.setEnabled(false);
    // ���ô˱���ͼ����ѡ��С
   //table.setPreferredScrollableViewportSize(new Dimension(600, 400));
    // �������뵽�����������
    JScrollPane scrollPane = new JScrollPane(table);
	panelfirst.add(scrollPane, BorderLayout.CENTER);
    //f.getContentPane().add(scrollPane, BorderLayout.CENTER);
		final JButton addbttn=new JButton("add");
		addbttn.setBackground(Color.GRAY);
		addbttn.addActionListener(//Ϊ��ť����¼�������
		new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				String text=addbttn.getText();
				i++;
				if(text.equals("save")){
					
					text="add";
					if((i%2)==0){
					JOptionPane.showMessageDialog(null,"���ѳɹ����棡","��Ϣ��",JOptionPane.INFORMATION_MESSAGE);
					
					}
					else{
						JOptionPane.showMessageDialog(null,"����ʧ��","��Ϣ��",JOptionPane.WARNING_MESSAGE);
						
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
		exitbtn.addActionListener(//Ϊ��ť����¼�������
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
		JButton search=new JButton("search");//Ϊ�����������¼�������ʾ�ڱ��У�����������������������������������������������������
		search.setBackground(Color.WHITE);
		search.addActionListener(//Ϊ��ť����¼�������
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
		addbtn.addActionListener(//Ϊ��ť����¼�������
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
		JButton deletebtn=new JButton("delete");//Ϊ������ɾ���˺�����ʱ�䣬��������ʾ���Ƿ�ɹ�ɾ����Ĭ�ϰ�id���ɾ������������������������
		deletebtn.addActionListener(//Ϊ��ť����¼�������
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
		JButton delete=new JButton("delete");//Ϊ������ɾ���˺�����ʱ�䣬��������ʾ���Ƿ�ɹ�ɾ����Ĭ�ϰ�id���ɾ������������������������
		delete.setBackground(Color.GRAY);
		delete.addActionListener(//Ϊ��ť����¼�������
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						//�����¼�ɾ������ 
					}
				});
		JButton updatabtn=new JButton("updata");//Ϊ�������޸��˺���Ϣ���¼���ʹ�����񲼾֣������������С������������������???????????????????????????????????????????????????????????????????
		
		updatabtn.addActionListener(//Ϊ��ť����¼�������
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						Accounnt.this.panelMain.remove(panelfirst);
						Accounnt.this.panelMain.remove(panelprocess);
						panelupdatabtn.add(exitbtn);
						Accounnt.this.panelMain.add(panelupdata,BorderLayout.CENTER);
						Accounnt.this.panelMain.add(panelupdatabtn,BorderLayout.SOUTH);
						panelMain.setVisible(false);
						panelMain.setVisible(true);//�����¼�ɾ������ 
					}
				});
		deletebtn.setBackground(Color.GRAY);
		updatabtn.setBackground(Color.GRAY);
		
		JButton updata=new JButton("updata");
		updata.setBackground(Color.GRAY);
		updata.addActionListener(//Ϊ��ť����¼�������
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						System.out.println("�жϸ���һ�����ݻ��߸���һ�����ݲ����ж�");
						
						//�������ݸ��²��� 
					}
				});
		
		
		JLabel namelabel=new JLabel   ("                                                                                        ��  ������Ҫ���ӵ��˺��� :");
		JLabel accountlabel=new JLabel("                                                                                        ��������Ҫ���ӵ���ϵ��ʽ:");
		JLabel passlabel=new JLabel   ("                                                                                        ��������Ҫ���ӵ��˺�����:");
		JLabel beizhulabel=new JLabel ("                                                                                        ��        ��        ��       ��       ַ  :");
		
		JLabel deletenamelabel=new JLabel   ("                                                                                �� ������Ҫɾ�����ӵ��˺��� :");
		JLabel deleteaccountlabel=new JLabel("                                                                                 �� ������Ҫɾ������ϵ��ʽ  :");
		JLabel deletepasslabel=new JLabel   ("                                                                                  ��������Ҫɾ�����˺�����:");
		JLabel deleteadresslabel=new JLabel ("                                                                                ��   ��   ��    Ҫ   ɾ   ��    ��    ַ :");
		

		JLabel deletanamebiaoqian=new JLabel   (">>>-----------------�޸ĺ������------------------------->>>");
		JLabel deletaaccountbiaoqian=new JLabel   (">>>-----------------�޸ĺ������------------------------->>>");
		JLabel deletapassbiaoqian=new JLabel   (">>>-----------------�޸ĺ������------------------------->>>");
		JLabel deleteadressbiaoqian=new JLabel   (">>>-----------------�޸ĺ������------------------------->>>");
		
		
		JTextField txtsearch=new JTextField();
		JTextField name=new JTextField("name");
		JTextField account=new JTextField("account");
		JTextField password=new JTextField("password");
		JTextField adress=new JTextField("adresss");
		
		JTextField deletename=new JTextField("---");
		JTextField deleteaccount=new JTextField("---");
		JTextField deletepass=new JTextField("---");
		JTextField deleteadress=new JTextField("---");
		
		
		//�������ݵĸ��������ı���
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
		//�����޸��м���������,һ�����У������񲼾ָ�ʽ�������
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
		
		search.addActionListener(//Ϊ��ť����¼�������
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