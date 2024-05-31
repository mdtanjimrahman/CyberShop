import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Page2
{
	public Page2(String ll)
	{
		JFrame f4=new JFrame("  ");
		f4.setResizable(false);
		
		JLabel no2=new JLabel();
		no2.setBounds(0,0,80,20);
		f4.add(no2);
		no2.setText(ll);
		no2.setVisible(false);
		
		Container c1=new Container();
		c1=f4.getContentPane();
		c1.setBackground(Color.WHITE);
	
	ImageIcon icon2=new ImageIcon(getClass().getResource("image.jpg"));
	f4.setIconImage(icon2.getImage());
	
		
				JLabel label7=new JLabel();//("Electronic Devices");
				label7.setBounds(230,0,350,40);
				f4.add(label7);
				
				Font fon=new Font("Book Antiqua",Font.BOLD,30);
				label7.setFont(fon);
				label7.setForeground(Color.RED);
				
				JPanel p2=new JPanel();
				p2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				p2.setBounds(40,120,150,260);
				p2.setBackground(Color.WHITE);
				f4.add(p2);
				p2.setLayout(null);
				
				JPanel p3=new JPanel();
				p3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				p3.setBounds(190,120,150,260);
				p3.setBackground(Color.WHITE);
				f4.add(p3);
				p3.setLayout(null);
				
				JPanel p4=new JPanel();
				p4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				p4.setBounds(340,120,150,260);
				p4.setBackground(Color.WHITE);
				f4.add(p4);
				p4.setLayout(null);
				
				JPanel p5=new JPanel();
				p5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				p5.setBounds(490,120,150,260);
				p5.setBackground(Color.WHITE);
				f4.add(p5);
				p5.setLayout(null);
				
			
				JButton el1=new JButton("");
				el1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el1.setBounds(0,0,150,180);
				p2.add(el1);
				ImageIcon i2=new ImageIcon(getClass().getResource("lamp.jpg"));
				el1.setIcon(i2);
				JLabel btn1=new JLabel("Light");//********************************************
				btn1.setBounds(50,160,100,60);
				p2.add(btn1);
				Font fs=new Font("Serif",Font.PLAIN,18);
				btn1.setFont(fs);
				JLabel btn2=new JLabel("BDT-300Tk");//********************************************
				btn2.setBounds(30,180,100,60);
				p2.add(btn2);
				Font fs1=new Font("Serif",Font.PLAIN,18);
				btn2.setFont(fs1);
				
				
				
				
				
				//picture1 button***********************************************
				
				/*JLabel ela=new JLabel();//price label***************************
				ela.setBounds(264,180,300,50);
				f4.add(ela);*/
				
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
				
				f4.add(el);*/
				
				
				
				el1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String nm=no2.getText().toString();
						new Feature1(nm);
						f4.dispose();
						
					}
				});
				
				//picture2 button**************************************************
				
				
				
				
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
				
				f4.add(btn1);
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
				
				f4.add(btn2);*/
				
				JButton el2=new JButton("");
				el2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el2.setBounds(0,0,150,180);
				p3.add(el2);
				ImageIcon i3=new ImageIcon(getClass().getResource("i5.jpg"));
				el2.setIcon(i3);
				
				JLabel btn4=new JLabel("Fan");//********************************************
				btn4.setBounds(60,160,100,60);
				p3.add(btn4);
				Font fs4=new Font("Serif",Font.PLAIN,18);
				btn4.setFont(fs4);
				JLabel btn6=new JLabel("BDT-2000Tk");//********************************************
				btn6.setBounds(20,180,100,60);
				p3.add(btn6);
				Font fs6=new Font("Serif",Font.PLAIN,18);
				btn6.setFont(fs6);
				
				
				
				el2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String nm1=no2.getText().toString();
						new Feature2(nm1);
						f4.dispose();
					}
				});
				
				
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
				
				f4.add(btn3);
				
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
				
				f4.add(btn4);*/
				JButton el3=new JButton("");
				el3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el3.setBounds(0,0,150,180);
				p4.add(el3);
				ImageIcon i4=new ImageIcon(getClass().getResource("i7.jpg"));
				el3.setIcon(i4);
				
				JLabel btn5=new JLabel("Mobile");//********************************************
				btn5.setBounds(50,160,100,60);
				p4.add(btn5);
				Font fs5=new Font("Serif",Font.PLAIN,18);
				btn5.setFont(fs5);
				JLabel btn7=new JLabel("BDT-30000Tk");//********************************************
				btn7.setBounds(20,180,200,60);
				p4.add(btn7);
				Font fs7=new Font("Serif",Font.PLAIN,18);
				btn7.setFont(fs7);
				
				
				
				el3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String nm2=no2.getText().toString();
						new Feature3(nm2);
						f4.dispose();	
					}
				});
				
				
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
				
				f4.add(btn5);
				
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
				
				f4.add(btn6);*/
				JButton el4=new JButton("");
				el4.setBorder(BorderFactory.createLineBorder(Color.WHITE));
				el4.setBounds(0,0,150,180);
				p5.add(el4);
				ImageIcon i5=new ImageIcon(getClass().getResource("i8.jpg"));
				el4.setIcon(i5);
				
				JLabel btn9=new JLabel("Laptop");
				btn9.setBounds(50,160,100,60);
				p5.add(btn9);
				Font f6=new Font("Serif",Font.PLAIN,18);
				btn9.setFont(f6);
				JLabel btn8=new JLabel("BDT-50000Tk");
				btn8.setBounds(20,180,200,60);
				p5.add(btn8);
				Font f8=new Font("Serif",Font.PLAIN,18);
				btn8.setFont(f8);
				
				
				el4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String nm3=no2.getText().toString();
						new Feature4(nm3);
						f4.dispose();
					}
				});
				
				

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
				
				f4.add(btn7);
				
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
				
				JLabel lab=new JLabel("Qun:");
				lab.setBounds(30,225,50,20);
				p2.add(lab);
				Font fs2=new Font("Serif",Font.PLAIN,18);
				lab.setFont(fs2);
				
				String qun[]={"0","1","2","3"};
				
				JComboBox coma1=new JComboBox(qun);
				coma1.setBounds(70,225,50,20);
				p2.add(coma1);
				
				JLabel lab1=new JLabel("Qun:");
				lab1.setBounds(30,225,50,20);
				p3.add(lab1);
				Font fx=new Font("Serif",Font.PLAIN,18);
				lab1.setFont(fx);
				
				String qun1[]={"0","1","2","3"};
				
				JComboBox coma2=new JComboBox(qun1);
				coma2.setBounds(70,225,50,20);
				p3.add(coma2);
				
				JLabel lab2=new JLabel("Qun:");
				lab2.setBounds(30,225,50,20);
				p4.add(lab2);
				Font fx1=new Font("Serif",Font.PLAIN,18);
				lab2.setFont(fx1);
				
				String qun2[]={"0","1","2","3"};
				
				JComboBox coma3=new JComboBox(qun2);
				coma3.setBounds(70,225,50,20);
				p4.add(coma3);
				
				JLabel lab4=new JLabel("Qun:");
				lab4.setBounds(30,225,50,20);
				p5.add(lab4);
				Font fx3=new Font("Serif",Font.PLAIN,18);
				lab4.setFont(fx3);
				
				String qun3[]={"0","1","2","3"};
				
				JComboBox coma4=new JComboBox(qun3);
				coma4.setBounds(70,225,50,20);
				p5.add(coma4);
				
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
		
		f4.add(bt);
		
		bt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String jj2=no2.getText().toString();
				f4.dispose();
				String as= coma1.getSelectedItem().toString();
				String as1= coma2.getSelectedItem().toString();
				String as2= coma3.getSelectedItem().toString();
				String as3= coma4.getSelectedItem().toString();
				Calculate1 cc =new Calculate1(as,as1,as2,as3,jj2);
			}
		});
		
		JButton bt1=new JButton("RETURN");
		bt1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt1.setBounds(250,420,90,30);
		
				bt1.setBackground(Color.BLUE);
				bt1.setForeground(Color.WHITE);
				bt1.addMouseListener(new MouseAdapter()
				{
					public void mouseEntered(MouseEvent e)
						{
							bt1.setBackground(Color.BLACK);
						}
				});
				bt1.addMouseListener(new MouseAdapter()
				{
					public void mouseExited(MouseEvent e)
						{
							bt1.setBackground(Color.BLUE);
						}
				});
				
				bt1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String ds=no2.getText().toString();
						f4.dispose();
						Home home1=new Home(ds);
					}
				});
		
		f4.add(bt1);
		
		
		
		JButton bt2=new JButton();
		bt2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt2.setBounds(5,225,30,25);
		f4.add(bt2);
		ImageIcon i15=new ImageIcon(getClass().getResource("but.jpg"));
		bt2.setIcon(i15);
		
		bt2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String df=no2.getText().toString();
						f4.dispose();
						Page1 p1=new Page1(df);
						
						
						}
				});
				
				
				
				
		JButton bt3=new JButton();
		bt3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bt3.setBounds(650,225,30,25);
		f4.add(bt3);
		ImageIcon i16=new ImageIcon(getClass().getResource("but5.jpg"));
		bt3.setIcon(i16);
		
		bt3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String hk=no2.getText().toString();
						f4.dispose();
						Page3 p3=new Page3(hk);
						
						
						}
				});
				
				
				
				
				
				
				
				
		Icon imgIcon5 = new ImageIcon(this.getClass().getResource("bk2.jpg"));
        JLabel label = new JLabel(imgIcon5);
        label.setBounds(0,0,700,500); 
        f4.getContentPane().add(label);
		
		JLabel name2=new JLabel("rakib");
		name2.setBounds(650,430,90,30);
		label.add(name2);
				
				
				
				
				
				
				
				
				f4.setSize(700,500);
				f4.setLocationRelativeTo(null);
				f4.setLayout(null);
				f4.setVisible(true);
				f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}