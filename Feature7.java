import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature7
{
	public Feature7(String nm7)
	{
		JFrame frr2=new JFrame("  ");
		frr2.setResizable(false);
		
		
		JLabel jk7=new JLabel();
		jk7.setBounds(0,0,80,20);
		frr2.add(jk7);
		jk7.setText(nm7);
		jk7.setVisible(false);
		
		
		
		Container cy7=new Container();
		cy7=frr2.getContentPane();
		cy7.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frr2.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Features of Mask");
		be.setBounds(245,20,350,45);
		frr2.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(145,70,400,300);
		frr2.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("KN1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,400,300);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frr2.add(btt1);
				
				
				
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
						        String x7=jk7.getText().toString();
								new Page1(x7);
								frr2.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frr2.setSize(700,500);
				frr2.setLocationRelativeTo(null);
				frr2.setLayout(null);
				frr2.setVisible(true);
				frr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}