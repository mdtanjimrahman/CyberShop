import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature8
{
	public Feature8(String nm8)
	{
		JFrame frr3=new JFrame("  ");
		frr3.setResizable(false);
		
		
		JLabel jk8=new JLabel();
		jk8.setBounds(0,0,80,20);
		frr3.add(jk8);
		jk8.setText(nm8);
		jk8.setVisible(false);
		
		
		Container cy8=new Container();
		cy8=frr3.getContentPane();
		cy8.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frr3.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Feature of Luggage");
		be.setBounds(242,20,350,45);
		frr3.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frr3.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("bag1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frr3.add(btt1);
				
				
				
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
						        String x8=jk8.getText().toString();
								new Page1(x8);
								frr3.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frr3.setSize(700,500);
				frr3.setLocationRelativeTo(null);
				frr3.setLayout(null);
				frr3.setVisible(true);
				frr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}