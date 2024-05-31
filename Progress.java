import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Progress
{
	public Progress()
	{
		JWindow w=new JWindow();
		w.setSize(600,400);
		w.setLocationRelativeTo(null);
		w.setVisible(true);
		
		JPanel pa=new JPanel();
		w.add(pa);
		pa.setBorder(BorderFactory.createLineBorder(Color.black));
		
		ImageIcon ii=new ImageIcon("CYBERSHOP.gif");
		JLabel jl=new JLabel();
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setIcon(ii);
		pa.add(jl);
		
		JProgressBar pb=new JProgressBar(0,100);
		pb.setForeground(Color.orange);
		pb.setVisible(false);
		w.add(BorderLayout.PAGE_END,pb);
		w.revalidate();
		
		t=new Timer(100,new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int x=pb.getValue();
				if(x==100)
				{
					w.dispose();
					t.stop();
					new Login();
				}
				else
				{
					pb.setValue(x+2);
				}
			}
		});
		t.start();
	}
	Timer t;
}