import java.awt.*;  
import javax.swing.*;    
import java.awt.event.*;  
import java.io.*;

public class Login
{
	
public Login()
	{
		JFrame FFF=new JFrame("Login to Continue");
		FFF.setResizable(false);
		
	    final JLabel label = new JLabel();
        label.setBounds(20,150, 200,50);
	 
        final JPasswordField value = new JPasswordField();
        value.setBounds(130,228,150,25);
		
		//font
		Font f1= new Font("Serif", Font.BOLD, 25);
		Font f2= new Font("Serif", Font.BOLD, 15);
		Font f3= new Font("Serif", Font.BOLD, 15);
		
		//header
		JLabel LL=new JLabel("WELCOME !");
		LL.setForeground(Color.BLACK);
		LL.setBounds(90,60,300,60);
		LL.setFont(f1);
		
		JLabel l1=new JLabel("Username:"); 
		l1.setForeground(Color.BLACK);		
        l1.setBounds(50,155, 80,30);    
		l1.setFont(f2);
		
        JLabel l2=new JLabel("Password:"); 
		l2.setForeground(Color.BLACK);
        l2.setBounds(50,225, 80,30);  
		l2.setFont(f3);
		
        JButton b1 = new JButton("Login");  
        b1.setBounds(107,285, 120,30);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		//b1.setOpaque(false);
		
		JButton b2 = new JButton("Sign up");  
        b2.setBounds(107,330, 120,30);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.WHITE);
		//b2.setOpaque(false);
		
		final JTextField text = new JTextField();
		text.setBounds(130,158, 150,25);   
		
		
		//frame
		FFF.setSize(800,500);
		FFF.setLocationRelativeTo(null);
		FFF.setLayout(null);
		//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//background
		/*ImageIcon bgimg=new ImageIcon("peakpx.jpg");
		
		Image img= bgimg.getImage();
		Image temp=img.getScaledInstance(800,500,Image.SCALE_SMOOTH);
		bgimg= new ImageIcon(temp);
		JLabel bg=new JLabel("",bgimg,JLabel.CENTER);*/
		
		ImageIcon iicon=new ImageIcon(getClass().getResource("image.jpg"));
		FFF.setIconImage(iicon.getImage());
		
		Icon imgIcon = new ImageIcon(this.getClass().getResource("LOG.gif"));
        JLabel labelll = new JLabel(imgIcon);
        labelll.setBounds(0,0,800,500); 
        
		
		//adds
		FFF.add(LL); FFF.add(value); FFF.add(l1); FFF.add(label); FFF.add(l2); FFF.add(b1); FFF.add(label); FFF.add(b2); FFF.add(text);
		FFF.getContentPane(); FFF.add(labelll);
		
		//bg.setBounds(0,0,800,500);
		//FFF.add(bg);
		
		FFF.setVisible (true);
		
		//button action 1
		b1.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) 
				{
					String t=text.getText();
				    String v=value.getText();
					
					boolean matched=false;
					try{
					FileReader fg=new FileReader("login.txt");
					BufferedReader bbr=new BufferedReader(fg);
					String line;
					while((line=bbr.readLine())!=null)
					{
						if(line.equals(t+"\t"+v))
						{
							matched=true;
							break;
						}
					}fg.close();
				}catch(Exception ex){}
				if(matched)
				{
					String bn=text.getText();
					FFF.dispose();
					new Shop(bn);
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid Username & Password");
				}
				
		
					
                  
				  /* if(t.equals("rakib")&&v.equals("12345")) { //(e.getSource()==b1) {
					   
		                                JFrame fr=new JFrame("***Info***");
										fr.setResizable(false);
	    		                                final JLabel label = new JLabel();
        		                                label.setBounds(20,150, 200,50);
		
				                                Font f4= new Font("Serif", Font.BOLD, 18);
				                                JLabel labell = new JLabel("Successfully Logged In !");
				                                labell.setForeground(Color.WHITE);
				                                labell.setBounds(35,7, 220,50);
				                                labell.setFont(f4);
	 
	 
	    		                                //button
	    		                                JButton B1 = new JButton("OK");
				                                B1.setBounds(92,60, 60,25);
		
				                                fr.setSize(270,150);
				                                fr.setLocationRelativeTo(null);
				                                fr.setLayout(null);
												
												ImageIcon iicon=new ImageIcon(getClass().getResource("image.jpg"));
												fr.setIconImage(iicon.getImage());
		
				                                ImageIcon bgimg1=new ImageIcon("Star.jpg");
		
				                                Image img1= bgimg1.getImage();
				                                Image temp1=img1.getScaledInstance(300,250,Image.SCALE_SMOOTH);
				                                bgimg1= new ImageIcon(temp1);
				                                JLabel bg1=new JLabel("",bgimg1,JLabel.CENTER);
		
				                                fr.add(labell); fr.add(B1);
				                                bg1.setBounds(0,0,300,250);
				                                fr.add(bg1);
		
				                                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        		                                fr.setVisible(true);
		
						                                        B1.addActionListener(new ActionListener() {  
                		                                public void actionPerformed(ActionEvent e)
						                                {
				   
				  		                                 if(e.getSource()==B1) {
					   		                                fr.dispose();
					   		                                FFF.dispose();
															//Shop h=new Shop(t);
					   		                                //Success s=new Success();
							                                }
                		                                }
					   
					  		                                 //FFF.dispose();
					   		                                //Window w=new Window();
							                                });
				   		                                }
					
							                                else if(t.equals("")&&v.equals(""))
						                                {
							                                JOptionPane.showMessageDialog(null,"Please Enter Username and Password");
						                                }
						                                else if(!(t.equals(""))&&v.equals(""))
						                                {
							                                JOptionPane.showMessageDialog(null,"Please Enter Password");
						                                }
						                                else if(t.equals("")&&!(v.equals("")))
						                                {
							                                JOptionPane.showMessageDialog(null,"Please Enter Username");
						                                }
						                                else
						                                {
							                                JOptionPane.showMessageDialog(null,"Not match");
						                                }
				
										                               
				  						                                }		

				
             						                               });
			 
			 
			 						                                //button action
			 						                               b2.addActionListener(new ActionListener() {  
                						                               public void actionPerformed(ActionEvent e) {
				   
				   						                               if(e.getSource()==b2) {
					   						                               FFF.dispose();
					  						                                Sign ss=new Sign();
											                               }
                						                               }*/  
																   }
                                                     });
													 b2.addActionListener(new ActionListener() {  
                						                               public void actionPerformed(ActionEvent e) {
				   
				   						                               if(e.getSource()==b2) {
					   						                               FFF.dispose();
					  						                                Sign ss=new Sign();
											                               }
                						                               }
													 });
			 
	}
}