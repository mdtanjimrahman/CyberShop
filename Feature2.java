import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Feature2
{
	public Feature2(String nm1)
	{
		JFrame fr1=new JFrame("  ");
		fr1.setResizable(false);
		
		JLabel jk2=new JLabel();
		jk2.setBounds(0,0,80,20);
		fr1.add(jk2);
		jk2.setText(nm1);
		jk2.setVisible(false);
		
		JLabel jk1=new JLabel();
		jk1.setBounds(0,0,80,20);
		fr1.add(jk1);
		jk1.setText(nm1);
		jk1.setVisible(false);
		
		Container cy2=new Container();
		cy2=fr1.getContentPane();
		cy2.setBackground(Color.WHITE);
		
		ImageIcon ico2=new ImageIcon(getClass().getResource("image.jpg"));
		fr1.setIconImage(ico2.getImage());
		
		JLabel be1=new JLabel("Features of Fan");
		be1.setBounds(255,20,350,45);
		fr1.add(be1);
		Font fo1=new Font("Book Antiqua",Font.BOLD,25);
		be1.setFont(fo1);
		be1.setForeground(Color.BLUE);
		
		JPanel pn1=new JPanel();
		pn1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		pn1.setBounds(90,70,500,330);
		fr1.add(pn1);
		pn1.setLayout(null);
		
		ImageIcon ic1=new ImageIcon("m3.jpg");
		JLabel be11=new JLabel();
		be11.setBounds(0,0,500,330);
		be11.setIcon(ic1);
		pn1.add(be11);
		
		JButton btt11=new JButton("Back");
		btt11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btt11.setBounds(300,400,90,30);
		fr1.add(btt11);
				
				btt11.setBackground(Color.BLUE);
				btt11.setForeground(Color.WHITE);
				btt11.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btt11.setBackground(Color.BLACK);
						}
				});
				btt11.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btt11.setBackground(Color.BLUE);
						}
				});
				btt11.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
						{
							/*int choice11=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
							if(choice11==JOptionPane.YES_OPTION)
							{*/
						        String cv=jk2.getText().toString();
								new Page2(cv);
								fr1.dispose();
							/*}
							else
							{
								System.out.print("Stay here  !");
							}*/
						}
				});
				
				
		JLabel name=new JLabel("rakib");
		name.setBounds(650,430,90,30);
		fr1.add(name);
		
		
				fr1.setSize(700,500);
				fr1.setLocationRelativeTo(null);
				fr1.setLayout(null);
				fr1.setVisible(true);
				fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}