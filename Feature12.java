import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature12
{
	public Feature12(String nm12)
	{
		JFrame frrr3=new JFrame("  ");
		frrr3.setResizable(false);
		
		
		JLabel jk12 = new JLabel();
		jk12.setBounds(0,0,80,20);
		frrr3.add(jk12);
		jk12.setText(nm12);
		jk12.setVisible(false);
		
		
		
		Container cy12=new Container();
		cy12=frrr3.getContentPane();
		cy12.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frrr3.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Goodness of Rice");
		be.setBounds(245,20,350,45);
		frrr3.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frrr3.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("rice1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frrr3.add(btt1);
				
				
				
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
						        String x12=jk12.getText().toString();
								new Page3(x12);
								frrr3.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frrr3.setSize(700,500);
				frrr3.setLocationRelativeTo(null);
				frrr3.setLayout(null);
				frrr3.setVisible(true);
				frrr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}