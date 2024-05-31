import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Page3
{
	public Page3(String hk)
	{
		JFrame f5=new JFrame("  ");
		f5.setResizable(false);
		
		JLabel lu1=new JLabel();
		lu1.setBounds(0,0,80,20);
		f5.add(lu1);
		lu1.setText(hk);
		lu1.setVisible(false);
		
		Container c2=new Container();
		c2=f5.getContentPane();
		c2.setBackground(Color.WHITE);
	
	ImageIcon icon22=new ImageIcon(getClass().getResource("image.jpg"));
	f5.setIconImage(icon22.getImage());
	
		
				JLabel label7=new JLabel("");
				label7.setBounds(230,0,350,40);
				f5.add(label7);
				
				Font fon=new Font("Book Antiqua",Font.BOLD,30);
				label7.setFont(fon);
				label7.setForeground(Color.RED);
				
				JButton ell=new JButton("");
				ell.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				ell.setBounds(40,110,150,180);
				f5.getContentPane().add(ell);
				ImageIcon i8=new ImageIcon(getClass().getResource("oil.jpg"));
				ell.setIcon(i8);
				
				JLabel al=new JLabel("Oil");//*********************************************
				al.setBounds(90,287,100,50);
				f5.add(al);
				Font fon1=new Font("Serif",Font.PLAIN,18);
				al.setFont(fon1);
				al.setForeground(Color.BLACK);
				
				JLabel aal=new JLabel("BDT-1600Tk");//********************************************
				aal.setBounds(57,307,100,50);
				f5.add(aal);
				Font fonn1=new Font("Serif",Font.PLAIN,18);
				aal.setFont(fonn1);
				aal.setForeground(Color.BLACK);
				
				
				
				//picture1 button***********************************************
				
				/*JLabel ela=new JLabel();//price label***************************
				ela.setBounds(264,180,300,50);
				f5.add(ela);*/
				
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
				
				f5.add(el);*/
				
				
				ell.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature9=lu1.getText().toString();
						new Feature9(feature9);
						f5.dispose();
						
					}
				});
				
				
				
				
				//picture2 button**************************************************
				
				JLabel btn1=new JLabel("");//********************************************
				btn1.setBounds(95,40,200,20);
				f5.add(btn1);
				
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
				
				
				
				f5.add(btn1);
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
				
				f5.add(btn2);*/
				
				
				
				JButton el1=new JButton("");
				el1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el1.setBounds(210,110,150,180);
				f5.getContentPane().add(el1);
				ImageIcon i9=new ImageIcon(getClass().getResource("vanish.jpg"));
				el1.setIcon(i9);
				
				JLabel al1=new JLabel("Detergent");//*********************************************
				al1.setBounds(245,287,100,50);
				f5.add(al1);
				Font fonn2=new Font("Serif",Font.PLAIN,18);
				al1.setFont(fonn2);
				al1.setForeground(Color.BLACK);
				
				JLabel aal1=new JLabel("BDT-1145Tk");//********************************************
				aal1.setBounds(233,307,100,50);
				f5.add(aal1);
				Font fonn3=new Font("Serif",Font.PLAIN,18);
				aal1.setFont(fonn3);
				aal1.setForeground(Color.BLACK);
				
				el1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature10=lu1.getText().toString();
						new Feature10(feature10);
						f5.dispose();
					}
				});
				
				JLabel btn3=new JLabel("");//************************
				btn3.setBounds(90,230,200,20);
				
				Font fs1=new Font("Arial",Font.PLAIN,16);
				btn3.setFont(fs1);
				
				f5.add(btn3);
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
				
				f5.add(btn3);
				
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
				
				f5.add(btn4);*/
				
				JButton el2=new JButton("");
				el2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el2.setBounds(357,110,150,180);
				f5.getContentPane().add(el2);
				ImageIcon i10=new ImageIcon(getClass().getResource("tea.jpg"));
				el2.setIcon(i10);
				
				JLabel al2=new JLabel("Tea");//*********************************************
				al2.setBounds(414,287,100,50);
				f5.add(al2);
				Font fonn4=new Font("Serif",Font.PLAIN,18);
				al2.setFont(fonn4);
				al2.setForeground(Color.BLACK);
				
				JLabel aal2=new JLabel("BDT-85Tk");//********************************************
				aal2.setBounds(392,307,100,50);
				f5.add(aal2);
				Font fonn5=new Font("Serif",Font.PLAIN,18);
				aal2.setFont(fonn5);
				aal2.setForeground(Color.BLACK);
				
				el2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature11=lu1.getText().toString();
						new Feature11(feature11);
						f5.dispose();	
					}
				});
				
				JLabel btn5=new JLabel("");//******************
				btn5.setBounds(540,40,200,20);
				f5.add(btn5);
				
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
				
				f5.add(btn5);
				
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
				
				f5.add(btn6);*/
				
				JButton el3=new JButton("");
				el3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el3.setBounds(496,100,150,180);
				f5.getContentPane().add(el3);
				
				ImageIcon i11=new ImageIcon(getClass().getResource("rice.jpg"));
				el3.setIcon(i11);
				
				
				
				JLabel al3=new JLabel("Rice");//*********************************************
				al3.setBounds(547,287,100,50);
				f5.add(al3);
				Font fonn6=new Font("Serif",Font.PLAIN,18);
				al3.setFont(fonn6);
				al3.setForeground(Color.BLACK);
				
				JLabel aal3=new JLabel("BDT-300Tk");//********************************************
				aal3.setBounds(525,307,150,50);
				f5.add(aal3);
				Font fonn7=new Font("Serif",Font.PLAIN,18);
				aal3.setFont(fonn7);
				aal3.setForeground(Color.BLACK);
				
				
				
				el3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String feature12=lu1.getText().toString();
						new Feature12(feature12);
						f5.dispose();
					}
				});
				
				JLabel btn7=new JLabel("");
				btn7.setBounds(540,230,200,20);
				
				Font fon5=new Font("Arial",Font.PLAIN,15);
				btn7.setFont(fon5);
				f5.add(btn7);
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
				
				f5.add(btn7);
				
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
				f5.add(lab);
				
				String qun[]={"0","1","2","3"};
				
				JComboBox coma1=new JComboBox(qun);
				coma1.setBounds(107,360,40,20);
				f5.add(coma1);
				
				JLabel lab1=new JLabel("Quantity");
				lab1.setBounds(230,360,90,20);
				f5.add(lab1);
				
				String qun1[]={"0","1","2","3"};
				
				JComboBox coma2=new JComboBox(qun1);
				coma2.setBounds(280,360,40,20);
				f5.add(coma2);
				
				JLabel lab2=new JLabel("Quantity");
				lab2.setBounds(390,360,90,20);
				f5.add(lab2);
				
				String qun2[]={"0","1","2","3"};
				
				JComboBox coma3=new JComboBox(qun2);
				coma3.setBounds(440,360,40,20);
				f5.add(coma3);
				
				JLabel lab4=new JLabel("Quantity");
				lab4.setBounds(530,360,90,20);
				f5.add(lab4);
				
				String qun3[]={"0","1","2","3"};
				
				JComboBox coma4=new JComboBox(qun3);
				coma4.setBounds(580,360,40,20);
				f5.add(coma4);
				
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
		
		f5.add(bt);
		
		bt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cal3=lu1.getText().toString();
				f5.dispose();
				String aaas= coma1.getSelectedItem().toString();
				String as111= coma2.getSelectedItem().toString();
				String as222= coma3.getSelectedItem().toString();
				String as333= coma4.getSelectedItem().toString();
				Calculate3 cc1 =new Calculate3(aaas,as111,as222,as333,cal3);
			}
		});
		
		JButton bt111=new JButton("RETURN");
		bt111.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt111.setBounds(250,420,90,30);
		
				bt111.setBackground(Color.BLUE);
				bt111.setForeground(Color.WHITE);
				bt111.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							bt111.setBackground(Color.BLACK);
						}
				});
				bt111.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							bt111.setBackground(Color.BLUE);
						}
				});
				
				bt111.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String hh3=lu1.getText().toString();
						f5.dispose();
						Home home2=new Home(hh3);
					}
				});
		
		f5.add(bt111);
		
		
		
		
		
		
		
		
		JButton bt222=new JButton();
		bt222.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt222.setBounds(5,225,30,25);
		f5.add(bt222);
		ImageIcon i16=new ImageIcon(getClass().getResource("but.jpg"));
		bt222.setIcon(i16);
		
		bt222.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String gh=lu1.getText().toString();
						f5.dispose();
						Page2 p2=new Page2(gh);
						
						
						}
				});
				
				
				
				
				
		Icon imgIcon55 = new ImageIcon(this.getClass().getResource("bk1.jpg"));
        JLabel label33 = new JLabel(imgIcon55);
        label33.setBounds(0,0,700,500); 
        f5.getContentPane().add(label33);
		
		
		JLabel name3=new JLabel("Tanjim");
		name3.setBounds(635,430,90,30);
		label33.add(name3);
				
				
				
				
				
				
				
				f5.setSize(700,500);
				f5.setLocationRelativeTo(null);
				f5.setLayout(null);
				f5.setVisible(true);
				f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}