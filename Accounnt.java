import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Accounnt extends JFrame{
	
	
	private static final long serialVersionUID = 3797857541795977543L;
	
	
	static int i=0,panduan=0;
	 private JPanel panelMain = new JPanel();
	private JTextArea jta;
	private Container contentPane;
	public void AccountFrame(){
		
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
		   Object[][] information = {
            // ��������е�����
            { "����", "jdiansf32435", "15635446544", "�ɶ�"},
            { "����","fgdhe436536", "1235796443", "�Ϻ�"},
            { "��������", "ert345yhnf", "23435567", "����	"},
            { "���ϰ�", "34trgnfh4", "8208820", "����"},
            { "�Ա�", "45yghnf", "23565786", "����"},
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
    // ��������еĺ����
    String[] Names = { "�˺�", "����", "��ϵ��ʽ", "��ַ" };
    // ��Names��playerInfoΪ����������һ�����
    JTable table = new JTable(information, Names);
	
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
				  Accounnt.this.panelMain.add(panelfirst,BorderLayout.CENTER);
				  Accounnt.this.panelMain.add(panelprocess,BorderLayout.SOUTH);
				
				System.out.println(i+"ER");
				panelMain.setVisible(false);
				panelMain.setVisible(true);	
			}
		});
		JButton search=new JButton("search");
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
		JTextField name=new JTextField("�������˺�����");
		JTextField account=new JTextField("��������ϵ��ʽ");
		JTextField password=new JTextField("����������");
		JTextField beizhu=new JTextField("������Ϣ");
		
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
	public static void main(String args[]){
		Accounnt start=new Accounnt();
	   
		start.AccountFrame();
	}
	public void setJta(JTextArea jta) {
		this.jta = jta;
	}
	public JTextArea getJta() {
		return jta;
	}	
	
	
}