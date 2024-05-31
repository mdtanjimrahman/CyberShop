import java.awt.*;  
import javax.swing.*;    
import javax.swing.table.DefaultTableModel;  
import java.awt.event.*;
import java.io.*;
  
public class Sign 
{
	
	
	public Sign()
	{
		//fonts
		Font f5= new Font("Serif", Font.BOLD, 40);
		Font f6= new Font("Serif", Font.BOLD, 18);
		Font f7= new Font("Serif", Font.BOLD, 15);
		Font f8= new Font("Serif", Font.BOLD, 15);
		Font f9= new Font("Serif", Font.BOLD, 15);
		Font f10= new Font("Serif", Font.BOLD, 15);
		Font f11= new Font("Serif", Font.BOLD, 15);
		Font f12= new Font("Serif", Font.BOLD, 15);
		Font f13= new Font("Serif", Font.BOLD, 15);
		Font f14= new Font("Serif", Font.BOLD, 15);
		Font f15= new Font("Serif", Font.BOLD, 15);
		
		
		
		//labels
	JFrame F=new JFrame("Please Sign Up to Continue");
	F.setResizable(false);
	
	JLabel label1= new JLabel("");
	    label1.setForeground(Color.WHITE);
		label1.setFont(f5);
		
	JLabel label2= new JLabel("Please Fill the Specific Requirements......");
	    label2.setForeground(Color.WHITE);
		label2.setFont(f6);
		
	JLabel label3= new JLabel("First Name: ");
	    label3.setForeground(Color.WHITE);
		label3.setFont(f7);
		
	JLabel label4= new JLabel("Last Name: ");
	    label4.setForeground(Color.WHITE);
		label4.setFont(f8);
		
	JLabel label5= new JLabel("Contact No: ");
	    label5.setForeground(Color.WHITE);
		label5.setFont(f9);
		
	/*JLabel label6= new JLabel("Gender: ");
	    label6.setForeground(Color.WHITE);
		label6.setFont(f10);*/
		
	JLabel label7= new JLabel("Address: ");
	    label7.setForeground(Color.WHITE);
		label7.setFont(f11);
		
	/*JLabel label8= new JLabel("E-mail: ");
	    label8.setForeground(Color.WHITE);
		label8.setFont(f12);*/
		
	JLabel label9= new JLabel("Set Username: ");
	    label9.setForeground(Color.WHITE);
		label9.setFont(f13);
		
	JLabel label10= new JLabel("Set Password: ");
	    label10.setForeground(Color.WHITE);
		label10.setFont(f14);
		
	/*JLabel label11= new JLabel("D.O.B. :");
	    label11.setForeground(Color.WHITE);
		label11.setFont(f15);*/
		
		
		
		ImageIcon iicon1=new ImageIcon(getClass().getResource("image.jpg"));
		F.setIconImage(iicon1.getImage());
		
	
	
	/*JButton B = new JButton("Add");
	JButton B1 = new JButton("Update");
	JButton B2 = new JButton("Clear");
	JButton B3 = new JButton("Delete");*/
	JButton back = new JButton ();
	
	JButton BP= new JButton("Sign Up");
	BP.setBounds(697,380, 80,25);
	F.add(BP);
	
	 
	 
	
	
	
	
	//text space
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3 = new JTextField();
	JTextField Tx = new JTextField();
	//JTextField text4 = new JTextField();
	JTextField text5 = new JTextField();
	JTextField text6 = new JTextField();
	
	BP.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) 
				{
					
					
					String t1=text1.getText();
					String t2=text2.getText();
					String t3=text3.getText();
					String t4=Tx.getText();
					String yt=text5.getText().toString();
					String yt1=text6.getText().toString();
					
					
					if(t1.equals("")&& t2.equals("")&& t3.equals("")&& t4.equals("")&& yt.equals("")&& yt1.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Fill all the Requirements");
					}
					
					else if(!(t1.equals(""))&& !(t2.equals(""))&& !(t3.equals(""))&& (!t4.equals(""))&& !(yt.equals(""))&& !(yt1.equals(""))){
					
					try{
					FileWriter wt=new FileWriter("login.txt",true);
					wt.write(yt+"\t"+yt1+"\n");
					wt.close();
					JOptionPane.showMessageDialog(null,"Sign Up Succeesfull");
					F.dispose();
					new Login();
					}catch(Exception ex){}
				}
				}
	 });
	 
	 
	 
	 
	 
	
	
	     //Strings
	           /* String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
					           "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
								
				String months[]={"January","February","March","April","May","June",
								"July","August","September","October","November","December"};
								
				String years[]={"1998","1999","2000","2001","2002","2003","2004","2005","2006",
								"2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018"};
								
								
				JComboBox com1=new JComboBox(days);
				JComboBox com2=new JComboBox(months);
				JComboBox com3=new JComboBox(years);
				
	
	
	JCheckBox check1 = new JCheckBox("Male");
	JCheckBox check2 = new JCheckBox("Female");*/
		
		
		//text positions
		label1.setBounds(330,15, 500,50);
		label2.setBounds(30,110, 300,50);
		label3.setBounds(70,182, 300,50);
		label4.setBounds(70,255, 300,50);
		label5.setBounds(70,325, 300,50);
		//label6.setBounds(70,272, 300,50);
		label7.setBounds(70,395, 90,50);
		//label8.setBounds(543,170, 90,50);
		label9.setBounds(540,232, 120,50);
		label10.setBounds(540,300, 120,50);
		//label11.setBounds(70,410, 120,50);
		
		//fields positions
		text1.setBounds(180,197, 230,22);
		text2.setBounds(180,270, 230,22);
		text3.setBounds(180,340, 230,22);
		Tx.setBounds(180,410, 230,22);
		//text4.setBounds(632,185, 230,22);
		text5.setBounds(668,250, 170,22);
		text6.setBounds(668,315, 170,22);
		
		/*B.setBounds(648,260,80,25);
		B1.setBounds(590,305,80,25);
		B2.setBounds(715,305,80,25);
		B3.setBounds(650,352,80,25);*/
		
	
		back.setBorder(null); //(BorderFactory.createLineBorder(Color.BLACK));
		back.setBounds(5,5,30,25);
		F.add(back);
		ImageIcon iback=new ImageIcon(getClass().getResource("backkk.jpg"));
		back.setIcon(iback);
		
		/*check1.setBounds(205,312, 57,20); 
		check2.setBounds(315,312, 67,20);
		
		com1.setBounds(207,425,45,20);
		com2.setBounds(252,425,80,20);
		com3.setBounds(332,425,60,20);*/
		
		F.setSize(950,600);
		F.setLocationRelativeTo(null);
		F.setLayout(null);
		
		//image
		/*ImageIcon bgimg2=new ImageIcon("trees.jpg");
		
		Image img2= bgimg2.getImage();
		Image temp2=img2.getScaledInstance(950,600,Image.SCALE_SMOOTH);
		bgimg2= new ImageIcon(temp2);
		JLabel bg2=new JLabel("",bgimg2,JLabel.CENTER);*/
		
		Icon imgIcon = new ImageIcon(this.getClass().getResource("Signin.jpg"));
        JLabel label = new JLabel(imgIcon);
        label.setBounds(0,0,950,600); 
		
		
		
		
		
		
		//*********************************TABLE*****************************************************
		
		/*JTable table;
		JScrollPane scroll;
		DefaultTableModel model;
		Container c =new Container();
		c=F.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		
		
		
		String [] col= {"First Name","Last Name","Contact No.","Address","Username","Password"};
		/*String [][] row= {
			
			             {"Tanjim","Rahman","123456789","Dhaka","tanjim","77889"},
						 {"jim","man","0121234567","Sylhet","jim","55669"},
						 {"Tan","Raat","164565567","Feni","tan","44559"},
						 {"Tanzib","Rahman","01234567","Rajshahi","tanj","54889"},
						 {"Tam","Rahman","1234555667","Bogura","tamm","12889"},
						 {"Rakib","Hasan","216541321","Dhaka","rakib","3643256"},
						 {"Limon","Limon","32651032","Dhaka","limon","77889"},
						 {"Tanjim","Rahman","1234567","Dhaka","tanjim","77889"},
			
			
			
		                };
						
			String [] row= new String[6]; {
				           
                         
						    
							
			              			   
			               };
						
						
		table= new JTable();
		
		model = new DefaultTableModel();
		model.setColumnIdentifiers(col);
		
		//table.setEnabled(false);
		table.setSelectionBackground(Color.ORANGE);
		table.setModel(model);
		table.setRowHeight(25);
		
		
		scroll = new JScrollPane(table);
		scroll.setBounds(65,415,800,120);
		
		
		
		c.add(scroll);*/
		
		
		
		
		
		
		
		//adds or actions
		F.add(label1); F.add(label2); F.add(label3); F.add(text1); F.add(label4); F.add(text2); F.add(label5); F.add(text3);
		/*F.add(check1); F.add(check2); F.add(label6);*/ F.add(label7); F.add(Tx); /*F.add(label8);*/ /*F.add(text4);*/ F.add(label9);
		F.add(text5); F.add(label10); F.add(text6); /*F.add(label11);*/ //F.add(com1); F.add(com2); F.add(com3); F.getContentPane();
		/*F.add(B); F.add(B1); F.add(B2); F.add(B3);*/ F.add(label);
		
		//bg2.setBounds(0,0,950,600);
		//F.add(bg2);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//label6.setSize(300,100);
		//label7.setSize(400,100);
		
        F.setVisible(true);
		
		//check box actions
		/*check1.addItemListener(new ItemListener() {
			 public void itemStateChanged(ItemEvent e) {                 
                label6.setText(""+(e.getStateChange()==1?"Gender:":"Gender:"));    
             }    
          });
		  
		   check2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label6.setText(""+(e.getStateChange()==1?"Gender:":"Gender:"));    
             }    
          });*/
		  
		  
		  
		  
		  
		  
		  
		  //scroll down
		  
		  
		  
		  
		  

		  
		  
		  //button actions
		  
		  
		  /*B1.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) 
				{
					
					int numberOfRow = table.getSelectedRow();
					
					String f_name=text1.getText();
					String l_name=text2.getText();
					String contact=text3.getText();
					String address=Tx.getText();
					String user=text5.getText();
					String pass=text6.getText();
					
					model.setValueAt(f_name,numberOfRow, 0);
					model.setValueAt(l_name,numberOfRow, 1);
					model.setValueAt(contact,numberOfRow, 2);
					model.setValueAt(address,numberOfRow, 3);
					model.setValueAt(user,numberOfRow, 4);
					model.setValueAt(pass,numberOfRow, 5);
					
					
				}
		  });
		  
		  
		  
		  
		  
		  B2.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) 
				{
					
					text1.setText("");
					text2.setText("");
					text3.setText("");
					Tx.setText("");
					text5.setText("");
					text6.setText("");
					
				}
		  });
		  
		  
		  
	       	B3.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) 
				{	  
					   
					   int numberOfRow = table.getSelectedRow();
					   if (numberOfRow>=0)
					   {
						   model.removeRow(numberOfRow);	
					   }
					   
					   else
					   {
						   JOptionPane.showMessageDialog(null,"No row has been selected or No row exists");
					   }
					   
					   
				   }
			});
		  
		  
		  
		  table.addMouseListener(new MouseAdapter(){
			  
			  public void mouseClicked(MouseEvent me)
			  {
				  int numberOfRow = table.getSelectedRow();
				  
				  String f_name = model.getValueAt(numberOfRow, 0).toString();
				  String l_name = model.getValueAt(numberOfRow, 1).toString();
				  String contact = model.getValueAt(numberOfRow, 2).toString();
				  String address = model.getValueAt(numberOfRow, 3).toString();
				  String user = model.getValueAt(numberOfRow, 4).toString();
				  String pass = model.getValueAt(numberOfRow, 5).toString();
				  
				  
				  text1.setText(f_name);
				  text2.setText(l_name);
				  text3.setText(contact);
				  Tx.setText(address);
				  text5.setText(user);
				  text6.setText(pass);
			  
			  }
			  
		  });*/
		  
		  
		  
		  back.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) 
				{
					F.dispose();
					Login BB = new Login();
				}
		  });
		  
		  
		  back.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
					}
				});
				
				back.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
					{
						back.setBorder(null);
					}
				});
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 /* B.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {
					
					/*String t1=text1.getText();
					String t2=text2.getText();
					String t3=text3.getText();
					String t4=Tx.getText();
					//String t5=text4.getText();
					String t6=text5.getText();
					String t7=text6.getText();
					
					/*if(t1.equals("")&& t2.equals("")&& t3.equals("")&& t4.equals("")&& /*t5.equals("")&&*/ /*t6.equals("")&&
					t7.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Please Fill all the Requirements");
					}*/
					
					
				   
				 /*  if(e.getSource()==B) 
				   {
					   
					   row[0]= text1.getText();
					   row[1]= text2.getText();
					   row[2]= text3.getText();
					   row[3]= Tx.getText();
					   row[4]= text5.getText();
					   row[5]= text6.getText();
					   model.addRow(row);
					   
				   }
				   
				   else if (e.getSource()==B2)
				   {
					   
					text1.setText("");
					text2.setText("");
					text3.setText("");
					Tx.setText("");
					text5.setText("");
					text6.setText("");
					   
				   }*/
				   
				   
				   
				   
				   
				   
					   
				   /*else {
					
					   JFrame FR=new JFrame("*****Info*****");
		final JLabel labelll = new JLabel();
        labelll.setBounds(20,150, 200,50);
		
		Font f15= new Font("Serif", Font.BOLD, 18);
	    JLabel label = new JLabel("Sign  up  Completed !");
		label.setForeground(Color.WHITE);
		label.setBounds(49,20, 220,40);
		label.setFont(f15);
	
	    JButton b = new JButton("Return");
		b.setBounds(88,90, 80,30);
		
		FR.setSize(280,185);
		FR.setLocationRelativeTo(null);
		FR.setLayout(null);
		
		//image
		ImageIcon bgimg3=new ImageIcon("Star.jpg");
		
		Image img3= bgimg3.getImage();
		Image temp3=img3.getScaledInstance(310,250,Image.SCALE_SMOOTH);
		bgimg3= new ImageIcon(temp3);
		JLabel bg3=new JLabel("",bgimg3,JLabel.CENTER);
		
		
		FR.add(label); FR.add(b);
		bg3.setBounds(0,0,310,250);
		FR.add(bg3);
		
		FR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        FR.setVisible(true);
		
		
		//button actions
		b.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {
				   
				   if(e.getSource()==b) {
					   FR.dispose();
					   F.dispose();
					   Login BB=new Login();
					}
                }  
             });*/
					    
						   
					  //F.dispose();
					   //Success Ss=new Success();
					
					
					//}
               // });
	}
	
}

//javac Main.java && java Main.java