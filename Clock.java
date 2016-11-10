import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.util.*;


public class Clock {

	private JFrame frame;
	private JLabel label1,label2,label3,label4,label5,label6;
	private String S[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private String bang[]={"Poush", "Magh", "Falgun", "Chaitra","Baishakh", "Jaishtha", "Ashar", "Sraban", "Bhadra", "Ashwin", "Kartik" ,"Agrahayan","Poush"};
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock window = new Clock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public int lip(int y)
	{
	if(y%100==0)
	{
	if(y%400==0)
	return 1;
	else
	return 0;
	}
	else
	{
	if(y%4==0)
	return 1;
	else
	return 0;
	}
	}
	public void thread()
	{
		Thread Cl=new Thread()
		{
		public void run() {
		try
		{
			while(true)
			{
				
				Calendar calander=new GregorianCalendar();
		int sec=calander.get(Calendar.SECOND);
		int min=calander.get(Calendar.MINUTE);
		int hour=calander.get(Calendar.HOUR);
		int day=calander.get(Calendar.DAY_OF_MONTH);
		int month=calander.get(Calendar.MONTH);
		int year=calander.get(Calendar.YEAR);
		
		hour%=12;
		if(hour==0)
			hour=12;
		String s="",m="",h="";
		label1.setText("Greogoeian Date: "+day+"/"+S[month]+"/"+year);
		if(sec<10)
        s="0";
		if(min<10)
		m="0";
		if(hour<10)
		h="0";
		label2.setText("Time: "+h+hour+":"+m+min+":"+s+sec);
		int yy=0,dd=0,mm=0,lp=lip(year);
		int Day=calander.get(Calendar.DAY_OF_YEAR);
		int Cou[]={13,43,73+lp,103+lp,134+lp,165+lp,196+lp,227+lp,258+lp,288+lp,318+lp,348+lp};
		yy=year-593;
		if(Day<(114+lp))
			yy--;
		for(int i=0;i<12;i++)
		{
			if(i<=10) {
			if(Day>Cou[i] && Day<=Cou[i+1])
			{
				dd=Day-Cou[i];
				mm=i+1;
				break;
			}
			}
			else
			{
				dd=Day-Cou[11];
				mm=0;
				break;
			}
		}
		label3.setText("Bangla Date: "+dd+"/"+bang[mm]+"/"+yy);
		sleep(1000);
			}
			
		}
		catch(Exception e)
		{
			
		}
		}
		
		
	};
	Cl.start();
	}

	public Clock() {
		
		initialize();
		thread();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Digital Clock");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		label2=new JLabel();
		label2.setForeground(Color.BLACK);
		label2.setBounds(10,0,414,47);
		label2.setFont(new Font("Book Antiqua",Font.BOLD,20));
		frame.getContentPane().add(label2);
		label1=new JLabel();
		label1.setForeground(Color.BLACK);
		label1.setBounds(10, 40, 414, 52);
		label1.setFont(new Font("Book Antiqua", Font.BOLD, 20));
		frame.getContentPane().add(label1);
		label3=new JLabel();
		label3.setForeground(Color.BLACK);
		label3.setBounds(10,85,414,47);
		label3.setFont(new Font("Book Antiqua",Font.BOLD,20));
		frame.getContentPane().add(label3);
		
		lblNewLabel = new JLabel("Developed By:");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 10));
		lblNewLabel.setBounds(243, 193, 119, 30);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Md. Sakib Hossain");
		lblNewLabel_1.setBounds(243, 219, 129, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("NSTU");
		lblNewLabel_2.setBounds(243, 237, 84, 14);
		frame.getContentPane().add(lblNewLabel_2);

	}
}
