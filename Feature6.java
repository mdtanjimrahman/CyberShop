import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature6
{
	public Feature6(String nm6)
	{
		JFrame frr1=new JFrame("  ");
		frr1.setResizable(false);
		
		
		JLabel jk6=new JLabel();
		jk6.setBounds(0,0,80,20);
		frr1.add(jk6);
		jk6.setText(nm6);
		jk6.setVisible(false);
		
		
		
		Container cy6=new Container();
		cy6=frr1.getContentPane();
		cy6.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frr1.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Effect of Body Spray");
		be.setBounds(232,20,350,45);
		frr1.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frr1.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("axe1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frr1.add(btt1);
				
				
				
				btt1.setBackground(Color.WHITE);
				btt1.setForeground(Color.GREEN);
				btt1.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btt1.setBackground(Color.BLACK);
						}
				});
				
				
				
				btt1.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btt1.setBackground(Color.WHITE);
						}
				});
				
				
				
				btt1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							/*int choice1=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
							if(choice1==JOptionPane.YES_OPTION)
							{*/
						        String x6=jk6.getText().toString();
								new Page1(x6);
								frr1.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frr1.setSize(700,500);
				frr1.setLocationRelativeTo(null);
				frr1.setLayout(null);
				frr1.setVisible(true);
				frr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}