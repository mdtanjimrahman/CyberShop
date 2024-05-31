import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature4
{
	public Feature4(String nm3)
	{
		JFrame fr3=new JFrame("  ");
		fr3.setResizable(false);
		
		JLabel jk4=new JLabel();
		jk4.setBounds(0,0,80,20);
		fr3.add(jk4);
		jk4.setText(nm3);
		jk4.setVisible(false);
		
		Container cy4=new Container();
		cy4=fr3.getContentPane();
		cy4.setBackground(Color.WHITE);
		
		ImageIcon ico4=new ImageIcon(getClass().getResource("image.jpg"));
		fr3.setIconImage(ico4.getImage());
		
		JLabel be3=new JLabel("Specifications of Laptop");
		be3.setBounds(215,20,350,45);
		fr3.add(be3);
		Font fo3=new Font("Book Antiqua",Font.BOLD,25);
		be3.setFont(fo3);
		be3.setForeground(Color.BLUE);
		
		JPanel pn3=new JPanel();
		pn3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn3.setBounds(90,70,500,330);
		fr3.add(pn3);
		pn3.setLayout(null);
		
		ImageIcon ic3=new ImageIcon("m1.jpg");
		JLabel be13=new JLabel();
		be13.setBounds(0,0,500,330);
		be13.setIcon(ic3);
		pn3.add(be13);
		
		JButton btt13=new JButton("Back");
		btt13.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt13.setBounds(300,400,90,30);
		fr3.add(btt13);
				
				btt13.setBackground(Color.BLUE);
				btt13.setForeground(Color.WHITE);
				btt13.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btt13.setBackground(Color.BLACK);
						}
				});
				btt13.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btt13.setBackground(Color.BLUE);
						}
				});
				btt13.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							/*int choice13=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
							if(choice13==JOptionPane.YES_OPTION)
							{*/
						        String xz=jk4.getText().toString();
								new Page2(xz);
								fr3.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		JLabel name=new JLabel("rakib");
		name.setBounds(650,430,90,30);
		fr3.add(name);
		
		
				fr3.setSize(700,500);
				fr3.setLocationRelativeTo(null);
				fr3.setLayout(null);
				fr3.setVisible(true);
				fr3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}