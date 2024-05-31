import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Page1
{
	public Page1(String df)
	{
		JFrame f6=new JFrame("  ");
		f6.setResizable(false);
		
		JLabel lu=new JLabel();
		lu.setBounds(0,0,80,20);
		f6.add(lu);
		lu.setText(df);
		lu.setVisible(false);
		
		Container c=new Container();
		c=f6.getContentPane();
		c.setBackground(Color.WHITE);
		
		
	
	ImageIcon icon22=new ImageIcon(getClass().getResource("image.jpg"));
	f6.setIconImage(icon22.getImage());
	
		
				JLabel label7=new JLabel("");
				label7.setBounds(230,0,350,40);
				f6.add(label7);
				
				Font fon=new Font("Book Antiqua",Font.BOLD,30);
				label7.setFont(fon);
				label7.setForeground(Color.RED);
				
				JButton ell=new JButton("");
				ell.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				ell.setBounds(40,110,150,180);
				f6.getContentPane().add(ell);
				ImageIcon i8=new ImageIcon(getClass().getResource("cream.jpg"));
				ell.setIcon(i8);
				
				JLabel al=new JLabel("Cream");//*********************************************
				al.setBounds(77,287,100,50);
				f6.add(al);
				Font fon1=new Font("Serif",Font.PLAIN,18);
				al.setFont(fon1);
				al.setForeground(Color.BLACK);
				
				JLabel aal=new JLabel("BDT-950Tk");//********************************************
				aal.setBounds(57,307,100,50);
				f6.add(aal);
				Font fonn1=new Font("Serif",Font.PLAIN,18);
				aal.setFont(fonn1);
				aal.setForeground(Color.BLACK);
				
				
				
				
				
				
				/*Icon imgIcon = new ImageIcon(this.getClass().getResource("4.jpg"));
				JLabel label = new JLabel(imgIcon);
				label.setBounds(0,0,700,500);
				f6.add(label);*/
				
				
				
				
				
				//picture1 button***********************************************
				
				/*JLabel ela=new JLabel();//price label***************************
				ela.setBounds(264,180,300,50);
				f6.add(ela);*/
				
				/*JButton btn=new JButton("Feature");//******************************************
				btn.setBounds(30,210,100,20);
				btn.setBackground(Color.WHITE);
				btn.setForeground(Color.GREEN);
				btn.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn.setBackground(Color.BLACK);
						}
				});
				btn.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn.setBackground(Color.WHITE);
						}
				});
				
				f6.add(el);*/
				ell.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature5 =lu.getText().toString();
						new Feature5(feature5);
						f6.dispose();
						
					}
				});
				
				
				
				//picture2 button**************************************************
				
				JLabel btn1=new JLabel("");//********************************************
				btn1.setBounds(100,40,200,20);
				f6.add(btn1);
				
				Font fs=new Font("Arial",Font.PLAIN,16);
				btn1.setFont(fs);
				
				btn1.setBackground(Color.WHITE);
				btn1.setForeground(Color.GREEN);
				/*btn1.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn1.setBackground(Color.BLACK);
						}
				});
				btn1.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn1.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn1);
				btn1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ImageIcon i=new ImageIcon(getClass().getResource("i2.jpg"));
				        el.setIcon(i);
						Font fon1=new Font("Verdana",Font.BOLD,25);
						ela.setFont(fon1);
						ela.setForeground(Color.GREEN);
						String data1="Price=300";
						ela.setText(data1);
					}
				});
				
				JButton btn2=new JButton("Feature");//**************************
				btn2.setBounds(30,345,100,20);
				
				btn2.setBackground(Color.WHITE);
				btn2.setForeground(Color.GREEN);
				btn2.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn2.setBackground(Color.BLACK);
						}
				});
				btn2.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn2.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn2);*/
				JButton el1=new JButton("");
				el1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el1.setBounds(210,110,150,180);
				f6.getContentPane().add(el1);
				ImageIcon i9=new ImageIcon(getClass().getResource("axe.jpg"));
				el1.setIcon(i9);
				
				JLabel al1=new JLabel("Perfume");//*********************************************
				al1.setBounds(245,287,100,50);
				f6.add(al1);
				Font fonn2=new Font("Serif",Font.PLAIN,18);
				al1.setFont(fonn2);
				al1.setForeground(Color.BLACK);
				
				JLabel aal1=new JLabel("BDT-800Tk");//********************************************
				aal1.setBounds(233,307,100,50);
				f6.add(aal1);
				Font fonn3=new Font("Serif",Font.PLAIN,18);
				aal1.setFont(fonn3);
				aal1.setForeground(Color.BLACK);
				
				
				
				el1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature6 =lu.getText().toString();
						new Feature6(feature6);
						f6.dispose();
					}
				});
				
				JLabel btn3=new JLabel("");//************************
				btn3.setBounds(90,230,200,20);
				
				Font fs1=new Font("Arial",Font.PLAIN,16);
				btn3.setFont(fs1);
				
				f6.add(btn3);
				btn3.setBackground(Color.WHITE);
				btn3.setForeground(Color.GREEN);
				/*btn3.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn3.setBackground(Color.BLACK);
						}
				});
				btn3.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn3.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn3);
				
				btn3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ImageIcon i3=new ImageIcon(getClass().getResource("i4.jpg"));
				        el1.setIcon(i3);
						Font fon1=new Font("Verdana",Font.BOLD,25);
						ela.setFont(fon1);
						ela.setForeground(Color.GREEN);
						String data1="Price=2000";
						ela.setText(data1);
					}
				});
				
				//*******************************
				JButton btn4=new JButton("Feature");//********************
				btn4.setBounds(550,150,100,20);
				
				btn4.setBackground(Color.WHITE);
				btn4.setForeground(Color.GREEN);
				btn4.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn4.setBackground(Color.BLACK);
						}
				});
				btn4.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn4.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn4);*/
				
				JButton el2=new JButton("");
				el2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el2.setBounds(357,110,150,180);
				f6.getContentPane().add(el2);
				ImageIcon i10=new ImageIcon(getClass().getResource("KN.jpg"));
				el2.setIcon(i10);
				
				
				
				JLabel al2=new JLabel("Mask");//*********************************************
				al2.setBounds(414,287,100,50);
				f6.add(al2);
				Font fonn4=new Font("Serif",Font.PLAIN,18);
				al2.setFont(fonn4);
				al2.setForeground(Color.BLACK);
				
				JLabel aal2=new JLabel("BDT-155Tk");//********************************************
				aal2.setBounds(392,307,100,50);
				f6.add(aal2);
				Font fonn5=new Font("Serif",Font.PLAIN,18);
				aal2.setFont(fonn5);
				aal2.setForeground(Color.BLACK);
				
				
				
				el2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature7 =lu.getText().toString();
						new Feature7(feature7);
						f6.dispose();	
					}
				});
				
				JLabel btn5=new JLabel("");//******************
				btn5.setBounds(540,40,200,20);
				f6.add(btn5);
				
				Font fs2=new Font("Arial",Font.PLAIN,16);
				btn5.setFont(fs2);
				btn5.setBackground(Color.WHITE);
				btn5.setForeground(Color.GREEN);
				/*btn5.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn5.setBackground(Color.BLACK);
						}
				});
				btn5.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn5.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn5);
				
				btn5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ImageIcon i5=new ImageIcon(getClass().getResource("i5.jpg"));
				        el2.setIcon(i5);
						Font fon1=new Font("Verdana",Font.BOLD,25);
						ela.setFont(fon1);
						ela.setForeground(Color.GREEN);
						String data1="Price=30000";
						ela.setText(data1);
					}
				});
				
				//**********************************************************************
				JButton btn6=new JButton("Feature");
				btn6.setBounds(550,340,100,20);
				
				btn6.setBackground(Color.WHITE);
				btn6.setForeground(Color.GREEN);
				btn6.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn6.setBackground(Color.BLACK);
						}
				});
				btn6.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn6.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn6);*/
				
				JButton el3=new JButton("");
				el3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el3.setBounds(496,100,150,180);
				f6.getContentPane().add(el3);
				
				ImageIcon i11=new ImageIcon(getClass().getResource("bag.jpg"));
				el3.setIcon(i11);
				
				
				
				JLabel al3=new JLabel("Luggage");//*********************************************
				al3.setBounds(543,287,100,50);
				f6.add(al3);
				Font fonn6=new Font("Serif",Font.PLAIN,18);
				al3.setFont(fonn6);
				al3.setForeground(Color.BLACK);
				
				JLabel aal3=new JLabel("BDT-11000Tk");//********************************************
				aal3.setBounds(525,307,150,50);
				f6.add(aal3);
				Font fonn7=new Font("Serif",Font.PLAIN,18);
				aal3.setFont(fonn7);
				aal3.setForeground(Color.BLACK);
				
				
				
				el3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature8 =lu.getText().toString();
						new Feature8(feature8);
						f6.dispose();
					}
				});
				
				JLabel btn7=new JLabel("");
				btn7.setBounds(525,230,200,20);
				
				Font fon5=new Font("Arial",Font.PLAIN,15);
				btn7.setFont(fon5);
				f6.add(btn7);
				btn7.setBackground(Color.WHITE);
				btn7.setForeground(Color.GREEN);
				/*btn7.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							btn7.setBackground(Color.BLACK);
						}
				});
				btn7.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							btn7.setBackground(Color.WHITE);
						}
				});
				
				f6.add(btn7);
				
				btn7.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ImageIcon i7=new ImageIcon(getClass().getResource("i7.jpg"));
				        el3.setIcon(i7);
						Font fon1=new Font("Verdana",Font.BOLD,25);
						ela.setFont(fon1);
						ela.setForeground(Color.GREEN);
						String data1="Price=50000";
						ela.setText(data1);
					}
				});*/
				
				JLabel lab=new JLabel("Quantity");
				lab.setBounds(57,360,90,20);
				f6.add(lab);
				
				String qun[]={"0","1","2","3"};
				
				JComboBox coma1=new JComboBox(qun);
				coma1.setBounds(107,360,40,20);
				f6.add(coma1);
				
				JLabel lab1=new JLabel("Quantity");
				lab1.setBounds(230,360,90,20);
				f6.add(lab1);
				
				String qun1[]={"0","1","2","3"};
				
				JComboBox coma2=new JComboBox(qun1);
				coma2.setBounds(280,360,40,20);
				f6.add(coma2);
				
				JLabel lab2=new JLabel("Quantity");
				lab2.setBounds(390,360,90,20);
				f6.add(lab2);
				
				String qun2[]={"0","1","2","3"};
				
				JComboBox coma3=new JComboBox(qun2);
				coma3.setBounds(440,360,40,20);
				f6.add(coma3);
				
				JLabel lab4=new JLabel("Quantity");
				lab4.setBounds(530,360,90,20);
				f6.add(lab4);
				
				String qun3[]={"0","1","2","3"};
				
				JComboBox coma4=new JComboBox(qun3);
				coma4.setBounds(580,360,40,20);
				f6.add(coma4);
				
				//Button:********************************************
		JButton bt=new JButton("NEXT");
		bt.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt.setBounds(350,420,90,30);
		
		bt.setBackground(Color.BLUE);
				bt.setForeground(Color.WHITE);
				bt.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							bt.setBackground(Color.BLACK);
						}
				});
				bt.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							bt.setBackground(Color.BLUE);
						}
				});
		
		f6.add(bt);
		
		bt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cal1 =lu.getText().toString();
				f6.dispose();
				String aas= coma1.getSelectedItem().toString();
				String as11= coma2.getSelectedItem().toString();
				String as22= coma3.getSelectedItem().toString();
				String as33= coma4.getSelectedItem().toString();
				Calculate2 cc2 =new Calculate2(aas,as11,as22,as33,cal1);
			}
		});
		
		JButton bt11=new JButton("RETURN");
		bt11.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt11.setBounds(250,420,90,30);
		
				bt11.setBackground(Color.BLUE);
				bt11.setForeground(Color.WHITE);
				bt11.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							bt11.setBackground(Color.BLACK);
						}
				});
				bt11.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							bt11.setBackground(Color.BLUE);
						}
				});
				
				bt11.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String hh1 =lu.getText().toString();
						f6.dispose();
						Home home=new Home(hh1);
					}
				});
		
		f6.add(bt11);
				
				//f6.add(label);
				
				
				
				
				
				
				
				
				
		JButton bt3=new JButton();
		bt3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt3.setBounds(650,225,30,25);
		f6.add(bt3);
		ImageIcon i17=new ImageIcon(getClass().getResource("but5.jpg"));
		bt3.setIcon(i17);
		
		bt3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String hj=lu.getText().toString();
						f6.dispose();
						Page2 p2=new Page2(hj);
						
						
						}
				});
				
				
				
				
				
				
				
		Icon imgIcon6 = new ImageIcon(this.getClass().getResource("bk.jpg"));
        JLabel label3 = new JLabel(imgIcon6);
        label3.setBounds(0,0,700,500); 
        f6.getContentPane().add(label3);
				
				
				
		JLabel name1=new JLabel("Rezwan");
		name1.setBounds(635,430,90,30);
		label3.add(name1);
				
				
				
				
				
				f6.setSize(700,500);
				f6.setLocationRelativeTo(null);
				f6.setLayout(null);
				f6.setVisible(true);
				f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}