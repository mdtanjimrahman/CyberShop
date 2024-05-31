import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature10
{
	public Feature10(String nm10)
	{
		JFrame frrr1=new JFrame("  ");
		frrr1.setResizable(false);
		
		
		JLabel jk10=new JLabel();
		jk10.setBounds(0,0,80,20);
		frrr1.add(jk10);
		jk10.setText(nm10);
		jk10.setVisible(false);
		
		
		Container cy10=new Container();
		cy10=frrr1.getContentPane();
		cy10.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frrr1.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Detergent Features");
		be.setBounds(245,20,350,45);
		frrr1.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frrr1.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("vanish1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frrr1.add(btt1);
				
				
				
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
						        String x10=jk10.getText().toString();
								new Page3(x10);
								frrr1.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frrr1.setSize(700,500);
				frrr1.setLocationRelativeTo(null);
				frrr1.setLayout(null);
				frrr1.setVisible(true);
				frrr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}