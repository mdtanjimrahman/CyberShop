import java.awt.*;  
import javax.swing.*;    
import java.awt.event.*;

public class Home
{
	public Home(String jj)
	{
	JFrame FH=new JFrame("  ");
	FH.setResizable(false);
	
	    JLabel no1=new JLabel();
		no1.setBounds(0,0,80,20);
		FH.add(no1);
		no1.setText(jj);
		no1.setVisible(false);
	
	/*ImageIcon icon1=new ImageIcon(getClass().getResource("leaf.jpg"));
	FH.setIconImage(icon1.getImage());
	
	    ImageIcon i2=new ImageIcon("pic.gif");*/
		JLabel n=new JLabel();
		n.setBounds(0,0,800,600);
		//n.setIcon(i2);
		
		
		/*JButton bot1=new JButton("CLICK1");
		bot1.setBounds(135,500,90,30);
		FH.add(bot1);*/
		
		
		JButton bot1=new JButton();
		//bot1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bot1.setBorder(null);
		bot1.setBounds(58,404,156,52);
		FH.add(bot1);
		ImageIcon ii1=new ImageIcon(getClass().getResource("but2.jpg"));
		bot1.setIcon(ii1);
		
		
		
		/*JButton bot2=new JButton("CLICK2");
		bot2.setBounds(368,500,90,30);
		FH.add(bot2);*/
		
		
		
		JButton bot2=new JButton();
		//bot2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bot2.setBorder(null);
		bot2.setBounds(292,420,228,62);
		FH.add(bot2);
		ImageIcon ii2=new ImageIcon(getClass().getResource("but3.jpg"));
		bot2.setIcon(ii2);
		
		
		
		/*JButton bot3=new JButton("CLICK3");
		bot3.setBounds(590,500,90,30);
		FH.add(bot3);*/
		
		
		JButton bot3=new JButton();
		//bot3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		bot3.setBorder(null);
		bot3.setBounds(585,400,178,51);
		FH.add(bot3);
		ImageIcon ii3=new ImageIcon(getClass().getResource("but4.jpg"));
		bot3.setIcon(ii3);
		
		
		
		/*JButton bot4=new JButton("Log Out");
		bot4.setBounds(620,50,90,30);
		FH.add(bot4);*/
		
		
		JButton bot4=new JButton();
		//bot4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bot4.setBorder(null);
		bot4.setBounds(42,35,77,38);
		FH.add(bot4);
		ImageIcon ii4=new ImageIcon(getClass().getResource("out.jpg"));
		bot4.setIcon(ii4);
		
		
		
		
		FH.setSize(800,600);
		FH.setLocationRelativeTo(null);
		FH.setLayout(null);
		
		
		ImageIcon iicon1=new ImageIcon(getClass().getResource("image.jpg"));
		FH.setIconImage(iicon1.getImage());
	
	
	    Icon imgIcon = new ImageIcon(this.getClass().getResource("home.jpg"));
        JLabel label = new JLabel(imgIcon);
        label.setBounds(0,0,800,600); 
        FH.getContentPane().add(label);
        

        /*ImageIcon bgimg5=new ImageIcon("pic.gif");
		
		Image img5= bgimg5.getImage();
		Image temp5=img5.getScaledInstance(800,600,Image.SCALE_SMOOTH);
		bgimg5= new ImageIcon(temp5);
		JLabel bg5=new JLabel("",bgimg5,JLabel.CENTER);*/


        FH.setVisible(true);
		FH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	
	
	bot1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						String jj0 = no1.getText().toString();
						FH.dispose();
						Page1 p1=new Page1(jj0);
					}
				});
				
				bot1.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						bot1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
					}
				});
				
				bot1.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
					{
						bot1.setBorder(null);
					}
				});
				
				
				bot2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String jj1=no1.getText().toString();
						FH.dispose();
						Page2 p2=new Page2(jj1);
					}
				});
				
				bot2.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						bot2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
					}
				});
				
				bot2.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
					{
						bot2.setBorder(null);
					}
				});
				
				
				bot3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String jj22=no1.getText().toString();
						FH.dispose();
						Page3 p3=new Page3(jj22);
					}
				});
				
				bot3.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						bot3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
					}
				});
				
				bot3.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
					{
						bot3.setBorder(null);
					}
				});
				
				
				bot4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						FH.dispose();
						Login BB=new Login();
					}
				});
				
				bot4.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
					{
						bot4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
					}
				});
				
				bot4.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
					{
						bot4.setBorder(null);
					}
				});
	
	
	   //FH.add(n);
				
				
				
	}
}






//javac Main.java && java Main