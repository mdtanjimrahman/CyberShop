import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature9
{
	public Feature9(String nm9)
	{
		JFrame frrr=new JFrame("  ");
		frrr.setResizable(false);
		
		
		JLabel jk9=new JLabel();
		jk9.setBounds(0,0,80,20);
		frrr.add(jk9);
		jk9.setText(nm9);
		jk9.setVisible(false);
		
		
		
		Container cy9=new Container();
		cy9=frrr.getContentPane();
		cy9.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		frrr.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Sunflower Oil");
		be.setBounds(245,20,350,45);
		frrr.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		frrr.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("oil1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		frrr.add(btt1);
				
				
				
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
						        String x9=jk9.getText().toString();
								new Page3(x9);
								frrr.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		
		
				frrr.setSize(700,500);
				frrr.setLocationRelativeTo(null);
				frrr.setLayout(null);
				frrr.setVisible(true);
				frrr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}