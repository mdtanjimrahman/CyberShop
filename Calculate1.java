import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.awt.print.*;
import java.io.*;
public class Calculate1
{
	//Value set*********
	double Light=300;
	double Fan=2000;
	double Mobile=30000;
	double Laptop=50000;
	double TaxP=7.50;
	public Calculate1(String as,String as1,String as2,String as3,String jj2)
	{
		JFrame fc=new JFrame("  ");
		fc.setResizable(false);
		
		ImageIcon icon3=new ImageIcon(getClass().getResource("image.jpg"));
		fc.setIconImage(icon3.getImage());
		
		Container co=new Container();
		co=fc.getContentPane();
		co.setBackground(Color.WHITE);
		
		//Panel****1
		JPanel p1=new JPanel();
		p1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		p1.setBounds(5,5,773,30);
		p1.setBackground(Color.WHITE);
		fc.add(p1);
		p1.setLayout(null);
		
		JLabel la1=new JLabel("Total Price of Electronic Device");
		la1.setBounds(195,5,400,20);
		p1.add(la1);
		Font fon1=new Font("COPPERPLATE GOTHIC BOLD",Font.BOLD,20);
		la1.setFont(fon1);
		la1.setForeground(Color.BLACK);
		
		//Panel****2
		JPanel p2=new JPanel();
		p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2.setBounds(5,40,773,100);
		p2.setBackground(Color.WHITE);
		fc.add(p2);
		p2.setLayout(null);
		
		JLabel la2=new JLabel("Customer Details");
		Font fon3=new Font("Arial",Font.BOLD,15);
		la2.setFont(fon3);
		la2.setBounds(5,0,130,30);
		p2.add(la2);
		
		JLabel la3=new JLabel("Customer Name:");
		Font fon4=new Font("Arial",Font.BOLD,13);
		la3.setFont(fon4);
		la3.setBounds(65,25,120,30);
		p2.add(la3);
		
		JTextField tx1=new JTextField();
		tx1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		tx1.setBounds(172,25,180,30);
		tx1.setText(jj2);
		p2.add(tx1);
		
		JLabel la4=new JLabel("Customer Phone:");
		Font fon5=new Font("Arial",Font.BOLD,13);
		la4.setFont(fon5);
		la4.setBounds(62,60,120,30);
		p2.add(la4);
		
		JTextField tx2=new JTextField();
		tx2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		tx2.setBounds(172,60,180,30);
		p2.add(tx2);
		
		JLabel la5=new JLabel("Order Date:");
		Font fon6=new Font("Arial",Font.BOLD,13);
		la5.setFont(fon6);
		la5.setBounds(500,25,120,30);
		p2.add(la5);
		
		JLabel tx3=new JLabel();
		Font fon41=new Font("Arial",Font.BOLD,15);
		tx3.setFont(fon41);
		tx3.setBounds(578,24,180,30);
		tx3.setForeground(Color.BLACK);
		p2.add(tx3);
		
		JLabel la6=new JLabel("Order Time:");
		Font fon7=new Font("Arial",Font.BOLD,13);
		la6.setFont(fon7);
		la6.setBounds(500,60,120,30);
		p2.add(la6);
		
		JLabel tx4=new JLabel();
		tx4.setForeground(Color.BLACK);
		Font fon40=new Font("Arial",Font.BOLD,15);
		tx4.setFont(fon40);
		tx4.setBounds(579,59,180,30);
		p2.add(tx4);
		
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat dateFormatter=new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat timeFormatter=new SimpleDateFormat("hh:mm:ss");
		tx3.setText(dateFormatter.format(d));
		tx4.setText(timeFormatter.format(d));
		//Panel****3
		JPanel p3=new JPanel();
		p3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p3.setBounds(5,145,460,300);
		p3.setBackground(Color.WHITE);
		fc.add(p3);
		p3.setLayout(null);
		
		JLabel la7=new JLabel("Order Details");
		Font fon8=new Font("Arial",Font.BOLD,15);
		la7.setFont(fon8);
		la7.setBounds(5,0,120,30);
		p3.add(la7);
		
		JLabel la8=new JLabel("Item Type");
		Font fon9=new Font("Arial",Font.BOLD,13);
		la8.setFont(fon9);
		la8.setBounds(65,25,120,30);
		p3.add(la8);
		
		JLabel la9=new JLabel("Item Qty");
		Font fon10=new Font("Arial",Font.BOLD,13);
		la9.setFont(fon10);
		la9.setBounds(150,25,120,30);
		p3.add(la9);
		
		JLabel la10=new JLabel("Unit Price");
		Font fon11=new Font("Arial",Font.BOLD,13);
		la10.setFont(fon11);
		la10.setBounds(227,25,120,30);
		p3.add(la10);
		
		JLabel la11=new JLabel("Item SubTotal");
		Font fon12=new Font("Arial",Font.BOLD,13);
		la11.setFont(fon12);
		la11.setBounds(310,25,120,30);
		p3.add(la11);
		
		JLabel la12=new JLabel("Light");
		Font fon13=new Font("Arial",Font.BOLD,13);
		la12.setFont(fon13);
		la12.setBounds(65,70,120,30);
		p3.add(la12);
		
		JLabel la13=new JLabel("Fan");
		Font fon14=new Font("Arial",Font.BOLD,13);
		la13.setFont(fon14);
		la13.setBounds(65,120,120,30);
		p3.add(la13);
		
		JLabel la14=new JLabel("Mobile");
		Font fon15=new Font("Arial",Font.BOLD,13);
		la14.setFont(fon15);
		la14.setBounds(65,170,120,30);
		p3.add(la14);
		
		JLabel la15=new JLabel("Laptop");
		Font fon16=new Font("Arial",Font.BOLD,13);
		la15.setFont(fon16);
		la15.setBounds(65,220,120,30);
		p3.add(la15);
		
		JLabel tx5=new JLabel();
		Font fon2=new Font("Arial",Font.BOLD,15);
		tx5.setForeground(Color.RED);
		tx5.setFont(fon2);
		tx5.setBounds(150,75,40,25);
		p3.add(tx5);
		tx5.setText(as);
		
		JLabel tx6=new JLabel();
		Font fon21=new Font("Arial",Font.BOLD,15);
		tx6.setForeground(Color.RED);
		tx6.setFont(fon21);
		tx6.setBounds(150,125,40,25);
		p3.add(tx6);
		tx6.setText(as1);
		
		JLabel tx7=new JLabel();
		Font fon22=new Font("Arial",Font.BOLD,15);
		tx7.setForeground(Color.RED);
		tx7.setFont(fon22);
		tx7.setBounds(150,175,40,25);
		p3.add(tx7);
		tx7.setText(as2);
		
		JLabel tx8=new JLabel();
		Font fon23=new Font("Arial",Font.BOLD,15);
		tx8.setForeground(Color.RED);
		tx8.setFont(fon23);
		tx8.setBounds(150,225,40,25);
		p3.add(tx8);
		tx8.setText(as3);
		
		JLabel tx9=new JLabel();
		Font fon24=new Font("Arial",Font.BOLD,15);
		tx9.setForeground(Color.RED);
		tx9.setFont(fon24);
		tx9.setBounds(230,74,50,25);
		p3.add(tx9);
		tx9.setText(String.valueOf(Light));
		
		JLabel tx10=new JLabel();
		Font fon25=new Font("Arial",Font.BOLD,15);
		tx10.setForeground(Color.RED);
		tx10.setFont(fon25);
		tx10.setBounds(230,124,80,25);
		p3.add(tx10);
		tx10.setText(String.valueOf(Fan));
		
		JLabel tx11=new JLabel();
		Font fon26=new Font("Arial",Font.BOLD,15);
		tx11.setForeground(Color.RED);
		tx11.setFont(fon26);
		tx11.setBounds(230,174,80,25);
		p3.add(tx11);
		tx11.setText(String.valueOf(Mobile));
		
		JLabel tx12=new JLabel();
		Font fon27=new Font("Arial",Font.BOLD,15);
		tx12.setForeground(Color.RED);
		tx12.setFont(fon27);
		tx12.setBounds(230,224,80,25);
		p3.add(tx12);
		tx12.setText(String.valueOf(Laptop));
		
		double q1=Double.parseDouble(tx5.getText());
		double q2=Double.parseDouble(tx6.getText());
		double q3=Double.parseDouble(tx7.getText());
		double q4=Double.parseDouble(tx8.getText());
				
		double sub1=q1*Light;
		double sub2=q2*Fan;
		double sub3=q3*Mobile;
		double sub4=q4*Laptop;
		
		JLabel tx13=new JLabel();
		Font fon28=new Font("Arial",Font.BOLD,15);
		tx13.setForeground(Color.RED);
		tx13.setFont(fon28);
		tx13.setBounds(330,73,80,25);
		p3.add(tx13);
		tx13.setText(String.format("%.2f",sub1));
		
		JLabel tx14=new JLabel();
		Font fon29=new Font("Arial",Font.BOLD,15);
		tx14.setForeground(Color.RED);
		tx14.setFont(fon29);
		tx14.setBounds(330,123,80,25);
		p3.add(tx14);
		tx14.setText(String.format("%.2f",sub2));
		
		JLabel tx15=new JLabel();
		Font fon30=new Font("Arial",Font.BOLD,15);
		tx15.setForeground(Color.RED);
		tx15.setFont(fon30);
		tx15.setBounds(330,173,80,25);
		p3.add(tx15);
		tx15.setText(String.format("%.2f",sub3));
		
		JLabel tx16=new JLabel();
		Font fon31=new Font("Arial",Font.BOLD,15);
		tx16.setForeground(Color.RED);
		tx16.setFont(fon31);
		tx16.setBounds(330,223,80,25);
		p3.add(tx16);
		tx16.setText(String.format("%.2f",sub4));
		
		//Panel****4
		JPanel p4=new JPanel();
		p4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p4.setBounds(470,145,308,300);
		p4.setBackground(Color.WHITE);
		fc.add(p4);
		p4.setLayout(null);
		
		JLabel la16=new JLabel("Other Summary");
		Font fon17=new Font("Arial",Font.BOLD,15);
		la16.setFont(fon17);
		la16.setBounds(5,0,120,30);
		p4.add(la16);
		
		JLabel la17=new JLabel("Sub Total");
		Font fon18=new Font("Arial",Font.BOLD,13);
		la17.setFont(fon18);
		la17.setBounds(20,40,120,30);
		p4.add(la17);
		
		JLabel la18=new JLabel("Tax Paid");
		Font fon19=new Font("Arial",Font.BOLD,13);
		la18.setFont(fon19);
		la18.setBounds(20,100,120,30);
		p4.add(la18);
		
		JLabel la19=new JLabel("Net Price");
		Font fon20=new Font("Arial",Font.BOLD,13);
		la19.setFont(fon20);
		la19.setBounds(20,160,120,30);
		p4.add(la19);
		
		double subTo=sub1+sub2+sub3+sub4;
		double TaxPaid=subTo*TaxP/100;
	    double NetP=subTo+TaxPaid;
				
		JLabel tx17=new JLabel();
		Font fon32=new Font("Arial",Font.BOLD,15);
		tx17.setForeground(Color.RED);
		tx17.setFont(fon32);
		tx17.setBounds(100,42,100,25);
		p4.add(tx17);
		tx17.setText(String.format("%.2f",subTo));
		
		JLabel tx18=new JLabel();
		Font fon33=new Font("Arial",Font.BOLD,15);
		tx18.setForeground(Color.RED);
		tx18.setFont(fon33);
		tx18.setBounds(100,102,100,25);
		p4.add(tx18);
		tx18.setText(String.format("%.2f",TaxPaid));
		
		JLabel tx19=new JLabel();
		Font fon34=new Font("Arial",Font.BOLD,15);
		tx19.setForeground(Color.RED);
		tx19.setFont(fon34);
		tx19.setBounds(100,162,100,25);
		p4.add(tx19);
		tx19.setText(String.format("%.2f",NetP));
		
		//Button*********
		JButton ba1=new JButton("Calculate");
		ba1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba1.setBounds(20,240,87,25);
		
				ba1.setBackground(Color.MAGENTA);
				ba1.setForeground(Color.WHITE);
				ba1.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba1.setBackground(Color.BLACK);
						}
				});
				ba1.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba1.setBackground(Color.MAGENTA);
						}
				});
		
		//p4.add(ba1);
		
		JButton ba2=new JButton("Reset");
		ba2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba2.setBounds(130,240,67,25);
		
				ba2.setBackground(Color.MAGENTA);
				ba2.setForeground(Color.WHITE);
				ba2.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba2.setBackground(Color.BLACK);
						}
				});
				ba2.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba2.setBackground(Color.MAGENTA);
						}
				});		
		
		//p4.add(ba2);
		
		/*JButton ba4=new JButton("Print");
		ba4.setBounds(165,270,67,25);
		
				ba4.setBackground(Color.WHITE);
				ba4.setForeground(Color.GREEN);
				ba4.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba4.setBackground(Color.BLACK);
						}
				});
				ba4.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba4.setBackground(Color.WHITE);
						}
				});	
				
				
				


				ba4.addActionListener(new ActionListener()//***************print******data**********
				{
					public void actionPerformed(ActionEvent e)
					{
						String t1=tx1.getText();
						String v1=tx2.getText();
				
						if(!(t1.equals(""))&&!(v1.equals("")))
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
							
									fc.print(g2);
							
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
						else if(t1.equals("")&&v1.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Please Enter Name and PhoneNumbr  !");
						}
						else if(!(t1.equals(""))&&v1.equals(""))
						{
							JOptionPane.showMessageDialog(null,"Please Enter PhoneNumber  !");
						}
						else if(t1.equals("")&&!(v1.equals("")))
						{
							JOptionPane.showMessageDialog(null,"Please Enter Name  !");
						}
				
					}
						
				});
				
		
		p4.add(ba4);*/
		
		JButton ba5=new JButton("Save");//***************************Data**Save*********************
		ba5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba5.setBounds(70,270,67,25);
		
		
				ba5.setBackground(Color.BLUE);
				ba5.setForeground(Color.WHITE);
				ba5.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba5.setBackground(Color.BLACK);
						}
				});
				ba5.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba5.setBackground(Color.BLUE);
						}
				});	
				
		ba5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s=la3.getText().toString();
				String s1=tx1.getText();
				String s2=la4.getText().toString();
				String s3=tx2.getText();
				String s4=la5.getText().toString();
				String s5=tx3.getText().toString();
				String s6=la6.getText().toString();
				String s7=tx4.getText().toString();
				String s8=la12.getText().toString();
				String s9=tx5.getText().toString();
				String s10=la13.getText().toString();
				String s11=tx6.getText().toString();
				String s12=la14.getText().toString();
				String s13=tx7.getText().toString();
				String s14=la15.getText().toString();
				String s15=tx8.getText().toString();
				String s16=la19.getText().toString();
				String s17=tx19.getText().toString();
				try{
					FileWriter w=new FileWriter("rakib.txt",true);
					w.write(s+" "+s1+"\n"+s2+" "+s3+"\n"+s4+" "+s5+"\n"+s6+" "+s7+"\n"+s8+" "+s9+"\n"+s10+" "+s11+"\n"+s12+" "+s13+"\n"+s14+" "+s15+"\n"+s16+" "+s17+"\n");
					w.write(System.getProperty("line.separator"));
					w.close();
					JOptionPane.showMessageDialog(null,"Successfully saved");
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null,"Error");
				}
			}
		});
				
		p4.add(ba5);
		JButton ba3=new JButton();
		ba3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba3.setBounds(0,3,30,25);
		ImageIcon ge2=new ImageIcon(getClass().getResource("but.jpg"));
		ba3.setIcon(ge2);
		
				/*ba3.setBackground(Color.MAGENTA);
				ba3.setForeground(Color.WHITE);
				ba3.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba3.setBackground(Color.BLACK);
						}
				});
				ba3.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba3.setBackground(Color.MAGENTA);
						}
				});*/
		
		p1.add(ba3);
		
		
		ba1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String t=tx1.getText();
				String v=tx2.getText();
				
				/*if(!(t.equals(""))&&!(v.equals("")))
				{

				}
				
				else if(t.equals("")&&v.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Name and PhoneNumbr  !");
				}
				else if(!(t.equals(""))&&v.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please Enter PhoneNumber  !");
				}
				else if(t.equals("")&&!(v.equals("")))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Name  !");
				}*/
				
				
				
			}
		});
		
		
		
		ba3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				/*int choice=JOptionPane.showConfirmDialog(null,"Do you want to Back  !","Message",JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION)
				{*/
			        String no4=tx1.getText().toString();
					fc.dispose();
					Page2 p2=new Page2(no4);
				/*}
				else
				{
					System.out.print("Stay here  !");
				}*/
		
			}
		});
		
		
		ba2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				tx1.setText(null);
				tx2.setText(null);
				tx3.setText(null);
				tx4.setText(null);
				tx5.setText(null);
				tx6.setText(null);
				tx7.setText(null);
				tx8.setText(null);
				tx9.setText(null);
				tx10.setText(null);
				tx11.setText(null);
				tx12.setText(null);
				tx13.setText(null);
				tx14.setText(null);
				tx15.setText(null);
				tx16.setText(null);
				tx17.setText(null);
				tx18.setText(null);
				tx19.setText(null);
				
				
			}
		});
		
		JButton ba6=new JButton("Order Now");
		ba6.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		ba6.setBounds(170,270,67,25);
		
		
				ba6.setBackground(Color.BLUE);
				ba6.setForeground(Color.WHITE);
				ba6.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							ba6.setBackground(Color.BLACK);
						}
				});
				ba6.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							ba6.setBackground(Color.BLUE);
						}
				});	
				
		ba6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String kl=tx1.getText().toString();
				fc.dispose();
				String g1=tx1.getText();
				String g2=tx2.getText();
				String g3=tx3.getText().toString();
				String g4=tx4.getText().toString();
				String g5=tx5.getText().toString();
				String g6=tx6.getText().toString();
				String g7=tx7.getText().toString();
				String g8=tx8.getText().toString();
				String g9=tx18.getText().toString();
				String g10=tx19.getText().toString();
				Payment1 mn=new Payment1(g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,kl);
			}
		});
		p4.add(ba6);
		
		
        JLabel name=new JLabel("rakib");
		name.setBounds(750,436,90,30);
		fc.add(name);

				fc.setSize(800,500);
				fc.setLocationRelativeTo(null);
				fc.setLayout(null);
				fc.setVisible(true);
				fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fc.setResizable(false);
	}
}


//javac Main.java&&java Main