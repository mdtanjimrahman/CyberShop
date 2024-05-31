import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature3
{
	public Feature3(String nm2)
	{
		JFrame fr2=new JFrame("  ");
		fr2.setResizable(false);
		
		JLabel jk3=new JLabel();
		jk3.setBounds(0,0,80,20);
		fr2.add(jk3);
		jk3.setText(nm2);
		jk3.setVisible(false);
		
		Container cy3=new Container();
		cy3=fr2.getContentPane();
		cy3.setBackground(Color.WHITE);
		
		ImageIcon ico3=new ImageIcon(getClass().getResource("image.jpg"));
		fr2.setIconImage(ico3.getImage());
		
		JLabel be2=new JLabel("Specifications of Mobile");
		be2.setBounds(215,20,350,45);
		fr2.add(be2);
		Font fo2=new Font("Book Antiqua",Font.BOLD,25);
		be2.setFont(fo2);
		be2.setForeground(Color.BLUE);
		
		JPanel pn2=new JPanel();
		pn2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn2.setBounds(90,70,500,330);
		fr2.add(pn2);
		pn2.setLayout(null);
		
		ImageIcon ic2=new ImageIcon("m2.jpg");
		JLabel be12=new JLabel();
		be12.setBounds(0,0,500,330);
		be12.setIcon(ic2);
		pn2.add(be12);
		
		JButton btt12=new JButton("Back");
		btt12.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt12.setBounds(300,400,90,30);
		fr2.add(btt12);
				
				btt12.setBackground(Color.BLUE);
				btt12.setForeground(Color.WHITE);
				btt12.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btt12.setBackground(Color.BLACK);
						}
				});
				btt12.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btt12.setBackground(Color.BLUE);
						}
				});
				
				
				btt12.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							/*int choice12=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
							if(choice12==JOptionPane.YES_OPTION)
							{*/
						        String cm=jk3.getText().toString();
								new Page2(cm);
								fr2.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
		JLabel name=new JLabel("rakib");
		name.setBounds(650,430,90,30);
		fr2.add(name);
		
				fr2.setSize(700,500);
				fr2.setLocationRelativeTo(null);
				fr2.setLayout(null);
				fr2.setVisible(true);
				fr2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}