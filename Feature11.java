import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature11
{
	public Feature11(String nm11)
	{
		JFrame frrr2=new JFrame("  ");
		frrr2.setResizable(false);
		
		
		JLabel jk11=new JLabel();
		jk11.setBounds(0,0,80,20);
		frrr2.add(jk11);
		jk11.setText(nm11);
		jk11.setVisible(false);
		
		
		
		Container cy11=new Container();
		cy11=frrr2.getContentPane();
		cy11.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frrr2.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Goodness of Tea");
		be.setBounds(245,20,350,45);
		frrr2.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frrr2.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("tea1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frrr2.add(btt1);
				
				
				
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
						        String x11=jk11.getText().toString();
								new Page3(x11);
								frrr2.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frrr2.setSize(700,500);
				frrr2.setLocationRelativeTo(null);
				frrr2.setLayout(null);
				frrr2.setVisible(true);
				frrr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}