import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature5
{
	public Feature5(String nm5)
	{
		JFrame frr=new JFrame("  ");
		frr.setResizable(false);
		
		
		JLabel jk5=new JLabel();
		jk5.setBounds(0,0,80,20);
		frr.add(jk5);
		jk5.setText(nm5);
		jk5.setVisible(false);
		
		
		Container cy5=new Container();
		cy5=frr.getContentPane();
		cy5.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frr.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Benefits of Cream");
		be.setBounds(238,20,350,45);
		frr.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frr.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("cream1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frr.add(btt1);
				
				
				
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
						        String x5=jk5.getText().toString();
								new Page1(x5);
								frr.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frr.setSize(700,500);
				frr.setLocationRelativeTo(null);
				frr.setLayout(null);
				frr.setVisible(true);
				frr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}