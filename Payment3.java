import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.print.*;

public class Payment3
{
	public Payment3(String g21,String g22,String g23,String g24,String g25,String g26,String g27,String g28,String g29,String g30,String kl3)
	{
		JFrame py11=new JFrame("  ");
		py11.setResizable(false);
		
		
		JLabel no9=new JLabel();
		no9.setBounds(0,0,80,20);
		py11.add(no9);
		no9.setText(kl3);
		no9.setVisible(false);
		
		
		
		ImageIcon ic3=new ImageIcon(getClass().getResource("image.jpg"));
		py11.setIconImage(ic3.getImage());
		
		Container k11=new Container();
		k11=py11.getContentPane();
		k11.setBackground(Color.WHITE);
		
		JLabel y1=new JLabel("Thank you !");
		Font nt1=new Font("Times New Roman",Font.BOLD,25);
		y1.setForeground(Color.BLUE);
		y1.setFont(nt1);
		y1.setBounds(20,60,150,40);
		py11.add(y1);
		
		JLabel y2=new JLabel("You have successfully");
		y2.setForeground(Color.BLUE);
		y2.setBounds(20,120,200,40);
		py11.add(y2);
		JLabel y3=new JLabel("purchased this order.");
		y3.setForeground(Color.BLUE);
		y3.setBounds(20,135,200,40);
		py11.add(y3);
		
		JPanel n1=new JPanel();
		n1.setBounds(180,20,450,430);
		n1.setBackground(Color.WHITE);
		//n1.setBorder(BorderFactory.createLineBorder(Color.black));
		py11.add(n1);
		n1.setLayout(null);
		
		JLabel l1=new JLabel("Thanks For Visiting CyberMart");
		l1.setBounds(145,25,200,40);
		n1.add(l1);
		
		JLabel l2=new JLabel("**************************************************************************");
		l2.setBounds(40,60,400,30);
		n1.add(l2);
		
		JLabel l3=new JLabel("Name");
		l3.setBounds(40,100,300,30);
		n1.add(l3);
		
		JLabel l4=new JLabel();
		l4.setBounds(150,100,180,20);
		n1.add(l4);
		l4.setText(g21);
		
		JLabel l5=new JLabel("Mobile");
		l5.setBounds(40,130,300,30);
		n1.add(l5);
		
		JLabel l6=new JLabel();
		l6.setBounds(150,130,180,20);
		n1.add(l6);
		l6.setText(g22);
		
		JLabel l7=new JLabel("Order Date");
		l7.setBounds(40,160,300,30);
		n1.add(l7);
		
		JLabel l8=new JLabel();
		l8.setBounds(150,160,180,20);
		n1.add(l8);
		l8.setText(g23);
		
		JLabel l9=new JLabel("Order Time");
		l9.setBounds(40,190,300,30);
		n1.add(l9);
		
		JLabel a1=new JLabel();
		a1.setBounds(150,190,180,20);
		n1.add(a1);
		a1.setText(g24);
		
		JLabel a2=new JLabel("Oil");
		a2.setBounds(40,220,300,30);
		n1.add(a2);
		
		JLabel a3=new JLabel();
		a3.setBounds(150,220,180,20);
		n1.add(a3);
		a3.setText(g25);
		
		JLabel a4=new JLabel("Detergent");
		a4.setBounds(40,250,300,30);
		n1.add(a4);
		
		JLabel a5=new JLabel();
		a5.setBounds(150,250,180,20);
		n1.add(a5);
		a5.setText(g26);
		
		JLabel a6=new JLabel("Tea");
		a6.setBounds(40,280,300,30);
		n1.add(a6);
		
		JLabel a7=new JLabel();
		a7.setBounds(150,280,180,20);
		n1.add(a7);
		a7.setText(g27);
		
		JLabel a8=new JLabel("Rice");
		a8.setBounds(40,310,300,30);
		n1.add(a8);
		
		JLabel a9=new JLabel();
		a9.setBounds(150,310,180,20);
		n1.add(a9);
		a9.setText(g28);
		
		JLabel h1=new JLabel("Tax Price");
		h1.setBounds(40,340,300,30);
		n1.add(h1);
		
		JLabel h2=new JLabel();
		h2.setBounds(150,340,180,20);
		n1.add(h2);
		h2.setText(g29);
		
		JLabel h3=new JLabel("Net Price");
		h3.setBounds(40,370,300,30);
		n1.add(h3);
		
		JLabel h4=new JLabel();
		h4.setBounds(150,370,180,20);
		n1.add(h4);
		h4.setText(g30);
		
		JLabel h5=new JLabel("See you again   !");
		h5.setBounds(180,390,300,30);
		n1.add(h5);
		
		JButton ba4=new JButton("Print");
		ba4.setBounds(20,400,80,25);
		py11.add(ba4);
		ba4.setBackground(Color.BLUE);
		ba4.setForeground(Color.WHITE);
		
		
		
		
		ba4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{

							PrinterJob job=PrinterJob.getPrinterJob();
							job.setJobName("Print Data");
					
							job.setPrintable(new Printable()
							{
								public int print(Graphics pg,PageFormat pf,int pageNum)
								{
									pf.setOrientation(PageFormat.LANDSCAPE);
									if(pageNum>0)
									{
										return Printable.NO_SUCH_PAGE;
									}
							
									Graphics2D g2=(Graphics2D)pg;
									g2.translate(pf.getImageableX(),pf.getImageableY());
									g2.scale(0.47,0.47);
							
									n1.print(g2);
							
									return Printable.PAGE_EXISTS;
								}
				
							});
							
							
					
							boolean ok=job.printDialog();
							if(ok)
							{
								JOptionPane.showMessageDialog(null,"Print loading...");
								try
								{
									job.print();
									JOptionPane.showMessageDialog(null,"Print Succeesfull");
								}catch(Exception ex)
								{
									System.out.println(ex);
								}
							}
			
						}
				
					});
		
		
		JButton ba9=new JButton();
		ba9.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba9.setBounds(10,0,30,25);
		py11.add(ba9);
		ImageIcon i13=new ImageIcon(getClass().getResource("but.jpg"));
		ba9.setIcon(i13);
		
		ba9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String mn3=no9.getText().toString();
						py11.dispose();
						/*String v1=a3.getText().toString();
						String v2=a5.getText().toString();
						String v3=a7.getText().toString();
						String v4=a9.getText().toString();*/
						Calculate2 cc=new Calculate2("0","0","0","0",mn3);
					}
				});
		
		py11.setSize(700,500);
		py11.setLocationRelativeTo(null);
		py11.setLayout(null);
		py11.setVisible(true);
		py11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}