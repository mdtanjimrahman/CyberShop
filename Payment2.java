import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.print.*;

public class Payment2
{
	public Payment2(String g11,String g12,String g13,String g14,String g15,String g16,String g17,String g18,String g19,String g20,String kl1)
	{
		JFrame py1=new JFrame("  ");
		py1.setResizable(false);
		
		
		
		JLabel no8=new JLabel();
		no8.setBounds(0,0,80,20);
		py1.add(no8);
		no8.setText(kl1);
		no8.setVisible(false);
		
		
		
		ImageIcon ic3=new ImageIcon(getClass().getResource("image.jpg"));
		py1.setIconImage(ic3.getImage());
		
		Container k1=new Container();
		k1=py1.getContentPane();
		k1.setBackground(Color.WHITE);
		
		JLabel y1=new JLabel("Thank you !");
		Font nt1=new Font("Times New Roman",Font.BOLD,25);
		y1.setForeground(Color.BLUE);
		y1.setFont(nt1);
		y1.setBounds(20,60,150,40);
		py1.add(y1);
		
		JLabel y2=new JLabel("You have successfully");
		y2.setForeground(Color.BLUE);
		y2.setBounds(20,120,200,40);
		py1.add(y2);
		JLabel y3=new JLabel("purchased this order.");
		y3.setForeground(Color.BLUE);
		y3.setBounds(20,135,200,40);
		py1.add(y3);
		
		JPanel n1=new JPanel();
		n1.setBounds(180,20,450,430);
		n1.setBackground(Color.WHITE);
		//n1.setBorder(BorderFactory.createLineBorder(Color.black));
		py1.add(n1);
		n1.setLayout(null);
		
		JLabel l1=new JLabel("Thanks For Visiting CyberMart");
		l1.setBounds(145,25,200,40);
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
		l4.setText(g11);
		
		JLabel l5=new JLabel("Mobile");
		l5.setBounds(40,130,300,30);
		n1.add(l5);
		
		JLabel l6=new JLabel();
		l6.setBounds(150,130,180,20);
		n1.add(l6);
		l6.setText(g12);
		
		JLabel l7=new JLabel("Order Date");
		l7.setBounds(40,160,300,30);
		n1.add(l7);
		
		JLabel l8=new JLabel();
		l8.setBounds(150,160,180,20);
		n1.add(l8);
		l8.setText(g13);
		
		JLabel l9=new JLabel("Order Time");
		l9.setBounds(40,190,300,30);
		n1.add(l9);
		
		JLabel a1=new JLabel();
		a1.setBounds(150,190,180,20);
		n1.add(a1);
		a1.setText(g14);
		
		JLabel a2=new JLabel("Cream");
		a2.setBounds(40,220,300,30);
		n1.add(a2);
		
		JLabel a3=new JLabel();
		a3.setBounds(150,220,180,20);
		n1.add(a3);
		a3.setText(g15);
		
		JLabel a4=new JLabel("Perfume");
		a4.setBounds(40,250,300,30);
		n1.add(a4);
		
		JLabel a5=new JLabel();
		a5.setBounds(150,250,180,20);
		n1.add(a5);
		a5.setText(g16);
		
		JLabel a6=new JLabel("Mask");
		a6.setBounds(40,280,300,30);
		n1.add(a6);
		
		JLabel a7=new JLabel();
		a7.setBounds(150,280,180,20);
		n1.add(a7);
		a7.setText(g17);
		
		JLabel a8=new JLabel("Luggage");
		a8.setBounds(40,310,300,30);
		n1.add(a8);
		
		JLabel a9=new JLabel();
		a9.setBounds(150,310,180,20);
		n1.add(a9);
		a9.setText(g18);
		
		JLabel h1=new JLabel("Tax Price");
		h1.setBounds(40,340,300,30);
		n1.add(h1);
		
		JLabel h2=new JLabel();
		h2.setBounds(150,340,180,20);
		n1.add(h2);
		h2.setText(g19);
		
		JLabel h3=new JLabel("Net Price");
		h3.setBounds(40,370,300,30);
		n1.add(h3);
		
		JLabel h4=new JLabel();
		h4.setBounds(150,370,180,20);
		n1.add(h4);
		h4.setText(g20);
		
		JLabel h5=new JLabel("See you again   !");
		h5.setBounds(180,390,300,30);
		n1.add(h5);
		
		JButton ba4=new JButton("Print");
		ba4.setBounds(20,400,80,25);
		py1.add(ba4);
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
		py1.add(ba9);
		ImageIcon i13=new ImageIcon(getClass().getResource("but.jpg"));
		ba9.setIcon(i13);
		
		ba9.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String mn2=no8.getText().toString();
						py1.dispose();
						/*String v1=a3.getText().toString();
						String v2=a5.getText().toString();
						String v3=a7.getText().toString();
						String v4=a9.getText().toString();*/
						Calculate2 cc=new Calculate2("0","0","0","0",mn2);
					}
				});
		
		py1.setSize(700,500);
		py1.setLocationRelativeTo(null);
		py1.setLayout(null);
		py1.setVisible(true);
		py1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}













