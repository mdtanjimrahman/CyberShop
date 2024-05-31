import java.awt.*;  
import javax.swing.*;    
import java.awt.event.*;

public class Shop
{
	public Shop(String bn)
	{
	JFrame FHH=new JFrame("  ");
	FHH.setResizable(false);
	
	/*ImageIcon icon1=new ImageIcon(getClass().getResource("leaf.jpg"));
	FHH.setIconImage(icon1.getImage());
	
	    ImageIcon i2=new ImageIcon("pic.gif");*/
		JLabel n=new JLabel();
		n.setBounds(0,0,800,600);
		
		JLabel no=new JLabel();
		no.setBounds(0,0,80,20);
		FHH.add(no);
		no.setText(bn);
		no.setVisible(false);
		//n.setIcon(i2);
		
		
		/*JButton bot1=new JButton("CLICK1");
		bot1.setBounds(135,450,90,30);
		FHH.add(bot1);
		
		JButton bot2=new JButton("CLICK2");
		bot2.setBounds(368,450,90,30);
		FHH.add(bot2);
		
		JButton bot3=new JButton("CLICK3");
		bot3.setBounds(590,450,90,30);
		FHH.add(bot3);*/
		
		JButton bot4=new JButton();
		//bot4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		bot4.setBorder(null);
		bot4.setBounds(328,407,115,115);
		FHH.add(bot4);
		ImageIcon ii=new ImageIcon(getClass().getResource("but1.jpg"));
		bot4.setIcon(ii);
		
		
		FHH.setSize(800,600);
		FHH.setLocationRelativeTo(null);
		FHH.setLayout(null);
	
	
	    Icon imgIcon = new ImageIcon(this.getClass().getResource("file.gif"));
        JLabel label = new JLabel(imgIcon);
        label.setBounds(0,0,800,600); 
        FHH.getContentPane().add(label);
		
		
		ImageIcon iicon2=new ImageIcon(getClass().getResource("image.jpg"));
		FHH.setIconImage(iicon2.getImage());
		
        

        /*ImageIcon bgimg5=new ImageIcon("pic.gif");
		
		Image img5= bgimg5.getImage();
		Image temp5=img5.getScaledInstance(800,600,Image.SCALE_SMOOTH);
		bgimg5= new ImageIcon(temp5);
		JLabel bg5=new JLabel("",bgimg5,JLabel.CENTER);*/


        FHH.setVisible(true);
		FHH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	
	
	/*bot1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						FHH.dispose();
						Page1 p1=new Page1();
					}
				});
				
				
				bot2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						FHH.dispose();
						Page2 p2=new Page2();
					}
				});
				
				
				bot3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						FHH.dispose();
						Page3 p3=new Page3();
					}
				});*/
				
				
				bot4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String jj=no.getText().toString();
						FHH.dispose();
						Home home=new Home(jj);
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
	
	
	   //FHH.add(n);
				
				
				
	}
}






//javac Main.java && java Main