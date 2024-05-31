import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature1
{
	public Feature1(String nm)
	{
		JFrame fr=new JFrame("  ");
		fr.setResizable(false);
		
		JLabel jk=new JLabel();
		jk.setBounds(0,0,80,20);
		fr.add(jk);
		jk.setText(nm);
		jk.setVisible(false);
		
		Container cy1=new Container();
		cy1=fr.getContentPane();
		cy1.setBackground(Color.WHITE);
		
		ImageIcon ico1=new ImageIcon(getClass().getResource("image.jpg"));
		fr.setIconImage(ico1.getImage());
		
		JLabel be=new JLabel("Features of Lamp");
		be.setBounds(235,20,350,45);
		fr.add(be);
		Font fo=new Font("Book Antiqua",Font.BOLD,25);
		be.setFont(fo);
		be.setForeground(Color.BLUE);
		
		JPanel pn=new JPanel();
		pn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn.setBounds(90,70,500,330);
		fr.add(pn);
		pn.setLayout(null);
		
		ImageIcon ic=new ImageIcon("lamp1.jpg");
		JLabel be1=new JLabel();
		be1.setBounds(0,0,500,330);
		be1.setIcon(ic);
		pn.add(be1);
		
		JButton btt1=new JButton("Back");
		btt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt1.setBounds(300,400,90,30);
		fr.add(btt1);
				
				
				
				btt1.setBackground(Color.BLUE);
				btt1.setForeground(Color.WHITE);
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
							btt1.setBackground(Color.BLUE);
						}
				});
				
				
				
				btt1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							/*int choice1=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
							if(choice1==JOptionPane.YES_OPTION)
							{*/
						        String ll=jk.getText().toString();
								new Page2(ll);
								fr.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		
		JLabel name=new JLabel("rakib");
		name.setBounds(650,430,90,30);
		fr.add(name);
		
				fr.setSize(700,500);
				fr.setLocationRelativeTo(null);
				fr.setLayout(null);
				fr.setVisible(true);
				fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}