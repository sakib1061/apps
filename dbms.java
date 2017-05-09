import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;
//©SakibCSTE9th
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class main {

	public static final String URL="jdbc:mysql://localhost:3306/jdbcdemo";
	public static final String username="root";
	public static final String password="";
	public static final String banani="©Sakib";
	public static String A="";
	public static String B="";
	public static String P="";
	public static String M="";
	public static String D="";
	static JFrame window=new JFrame("Book Management System");
	static JPanel JP=new JPanel(null);
	static ImageIcon ic=new ImageIcon(new main().getClass().getResource("image/Top.jpg"));
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		home();
		
	}
	static void heading()
	{
		window.setSize(400, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JP.setBackground(Color.decode("#006DB6"));
		window.getContentPane().add(JP);
		JLabel JL=new JLabel();
		JL.setBounds(0, 0, 400, 65);
		
		JL.setIcon(ic);
		JP.add(JL);
	}
	static void home()
	{
		clear();
		heading();
		final JButton Add=new JButton("Add");
		Add.setBounds(120, 70, 150, 30);
		JP.add(Add);
		final JButton View=new JButton("View One");
		View.setBounds(120, 110, 150, 30);
		JP.add(View);
		final JButton ViewAll=new JButton("View All");
		ViewAll.setBounds(120, 150, 150, 30);
		JP.add(ViewAll);
		final JButton Edit=new JButton("Edit");
		Edit.setBounds(120, 190, 150, 30);
		JP.add(Edit);
		final JButton Delete=new JButton("Delete");
		Delete.setBounds(120, 230, 150, 30);
		JP.add(Delete);
		JLabel CopN=new JLabel("©Md. Sakib Hossain");
		CopN.setBounds(250, 330, 150, 20);
		JP.add(CopN);
		JLabel CopR=new JLabel("ASH1401064M");
		CopR.setBounds(250, 350, 150, 20);
		JP.add(CopR);
		Add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				add();
				Add.removeActionListener(this);
			}
		});
		Edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				edit();
			}
		});
		View.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				view();
				View.removeActionListener(this);
			}
		});
		ViewAll.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				viewall();
				View.removeActionListener(this);
			}
		});
		Delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				delete();
			}
		});
		window.setResizable(false);
		window.setVisible(true);
		
	}
	static void add()
	{
		clear();
		heading();
		JLabel BookName=new JLabel("Book Name:");
		BookName.setBounds(10, 85, 120, 30);
		BookName.setFont(new Font("Nyala",Font.BOLD,17));
		BookName.setForeground(Color.decode("#FFFFFF"));
		JP.add(BookName);
		JLabel AuthorName=new JLabel("Author Name:");
		AuthorName.setBounds(10, 125, 100, 30);
		AuthorName.setFont(new Font("Nyala",Font.BOLD,17));
		AuthorName.setForeground(Color.decode("#FFFFFF"));
		JP.add(AuthorName);
		JLabel Price=new JLabel("Price:");
		Price.setBounds(10, 165, 100, 30);
		Price.setFont(new Font("Nyala",Font.BOLD,17));
		Price.setForeground(Color.decode("#FFFFFF"));
		JP.add(Price);
		JLabel Amount=new JLabel("Amount:");
		Amount.setBounds(10, 205, 100, 30);
		Amount.setFont(new Font("Nyala",Font.BOLD,17));
		Amount.setForeground(Color.decode("#FFFFFF"));
		JP.add(Amount);
		JLabel Date=new JLabel("Date:");
		Date.setBounds(10, 245, 100, 30);
		Date.setFont(new Font("Nyala",Font.BOLD,17));
		Date.setForeground(Color.decode("#FFFFFF"));
		JP.add(Date);
		final JTextField TB=new JTextField();
		TB.setBounds(140, 85, 150, 25);
		JP.add(TB);
		final JTextField TA=new JTextField();
		TA.setBounds(140, 125, 150, 25);
		JP.add(TA);
		final JTextField TP=new JTextField();
		TP.setBounds(140, 165, 150, 25);
		JP.add(TP);
		final JTextField TM=new JTextField();
		TM.setBounds(140, 205, 150, 25);
		JP.add(TM);
		final JTextField TD=new JTextField();
		TD.setBounds(140, 245, 150, 25);
		JP.add(TD);
		final JButton Add=new JButton("Add");
		Add.setBounds(220, 300, 100, 20);
		JP.add(Add);
		final JButton Cancel=new JButton("Cancel");
		Cancel.setBounds(220, 330, 100, 20);
		JP.add(Cancel);
		Add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				B=TB.getText();
				A=TA.getText();
				String P=TP.getText();
				String M=TM.getText();
				String D=TD.getText();
				if(A.length()==0||B.length()==0||P.length()==0||M.length()==0||D.length()==0)
				{
					JOptionPane.showConfirmDialog(null,"No Box Can Be Empty","Success",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);

				}
				else{
					try {
						Connection SqlCon=DriverManager.getConnection(URL,username,password);
						Statement SqlState=SqlCon.createStatement();
						SqlState.executeUpdate("insert into book(name, author, price, amount, date) values('"+B+"','"+A+"','"+P+"','"+M+"','"+D+"')");
						JOptionPane.showConfirmDialog(null,"Book Added Successfully","Success",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

//					Add.removeActionListener(this);
//					©Sakib

			}
		});
		
		Cancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
					home();
					Cancel.removeActionListener(this);

			}
		});
		
	}
	static void view()
	{
		clear();
		heading();
		JLabel BookName=new JLabel("Book Name:");
		BookName.setBounds(10, 85, 120, 30);
		BookName.setFont(new Font("Nyala",Font.BOLD,17));
		BookName.setForeground(Color.decode("#FFFFFF"));
		JP.add(BookName);
		JLabel AuthorName=new JLabel("Author Name:");
		AuthorName.setBounds(10, 125, 100, 30);
		AuthorName.setFont(new Font("Nyala",Font.BOLD,17));
		AuthorName.setForeground(Color.decode("#FFFFFF"));
		JP.add(AuthorName);
		JLabel Price=new JLabel("Price:");
		Price.setBounds(10, 165, 100, 30);
		Price.setFont(new Font("Nyala",Font.BOLD,17));
		Price.setForeground(Color.decode("#FFFFFF"));
		JP.add(Price);
		JLabel Amount=new JLabel("Amount:");
		Amount.setBounds(10, 205, 100, 30);
		Amount.setFont(new Font("Nyala",Font.BOLD,17));
		Amount.setForeground(Color.decode("#FFFFFF"));
		JP.add(Amount);
		JLabel Date=new JLabel("Date:");
		Date.setBounds(10, 245, 100, 30);
		Date.setFont(new Font("Nyala",Font.BOLD,17));
		Date.setForeground(Color.decode("#FFFFFF"));
		JP.add(Date);
		
		final JTextField TB=new JTextField();
		TB.setBounds(140, 85, 150, 25);
		JP.add(TB);
		final JTextField TA=new JTextField();
		TA.setBounds(140, 125, 150, 25);
		JP.add(TA);
		JButton Search=new JButton("Search");
		Search.setBounds(300, 85, 80, 25);
		JP.add(Search);
		final JButton Back=new JButton("Back");
		Back.setBounds(300, 125, 80, 25);
		JP.add(Back);
		final JLabel TP=new JLabel("");
		TP.setBounds(140, 165, 150, 25);
		TP.setFont(new Font("Nyala",Font.BOLD,17));
		TP.setForeground(Color.decode("#FFFFFF"));
		JP.add(TP);
		final JLabel TM=new JLabel("");
		TM.setBounds(140, 205, 150, 25);
		TM.setFont(new Font("Nyala",Font.BOLD,17));
		TM.setForeground(Color.decode("#FFFFFF"));
		JP.add(TM);
		final JLabel TD=new JLabel("");
		TD.setBounds(140, 245, 150, 25);
		TD.setFont(new Font("Nyala",Font.BOLD,17));
		TD.setForeground(Color.decode("#FFFFFF"));
		JP.add(TD);

       Search.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				B=TB.getText();
				A=TA.getText();
				P="";M="";D="";
				if(B.length()==0 || A.length()==0)
				{
					TB.setText("");
					TA.setText("");
					 TP.setText("");
						TM.setText("");
						TD.setText("");
					JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						Connection SqlCon=DriverManager.getConnection(URL,username,password);
						Statement SqlState=SqlCon.createStatement();
						ResultSet rs=SqlState.executeQuery("Select * from book where name like'%"+B+"%' and author like '%"+A+"%'");		
						while(rs.next())
						{
							P=rs.getString("price");
							M=rs.getString("amount");
							D=rs.getString("date");
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(P.length()==0 && M.length()==0 && D.length()==0)
					{
						 JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
							        JOptionPane.ERROR_MESSAGE);
						 TP.setText("");
							TM.setText("");
							TD.setText("");
							TA.setText("");
							TB.setText("");
					}
					else
						
					{
						TP.setText(P);
						TM.setText(M);
						TD.setText(D);
					}
			}
//					Search.removeActionListener(this);

			}
		});
		
       Back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				home();
				Back.removeActionListener(this);
			}
		});
	}
	static void edit()
	{
		clear();
		heading();
		JLabel BookName=new JLabel("Book Name:");
		BookName.setBounds(10, 85, 120, 30);
		BookName.setFont(new Font("Nyala",Font.BOLD,17));
		BookName.setForeground(Color.decode("#FFFFFF"));
		JP.add(BookName);
		JLabel AuthorName=new JLabel("Author Name:");
		AuthorName.setBounds(10, 125, 100, 30);
		AuthorName.setFont(new Font("Nyala",Font.BOLD,17));
		AuthorName.setForeground(Color.decode("#FFFFFF"));
		JP.add(AuthorName);
		JLabel Price=new JLabel("Price:");
		Price.setBounds(10, 165, 100, 30);
		Price.setFont(new Font("Nyala",Font.BOLD,17));
		Price.setForeground(Color.decode("#FFFFFF"));
		JP.add(Price);
		JLabel Amount=new JLabel("Amount:");
		Amount.setBounds(10, 205, 100, 30);
		Amount.setFont(new Font("Nyala",Font.BOLD,17));
		Amount.setForeground(Color.decode("#FFFFFF"));
		JP.add(Amount);
		JLabel Date=new JLabel("Date:");
		Date.setBounds(10, 245, 100, 30);
		Date.setFont(new Font("Nyala",Font.BOLD,17));
		Date.setForeground(Color.decode("#FFFFFF"));
		JP.add(Date);
		
		final JTextField TB=new JTextField();
		TB.setBounds(140, 85, 150, 25);
		JP.add(TB);
		final JTextField TA=new JTextField();
		TA.setBounds(140, 125, 150, 25);
		JP.add(TA);
		JButton Search=new JButton("Search");
		Search.setBounds(300, 85, 80, 25);
		JP.add(Search);
		final JButton Back=new JButton("Back");
		Back.setBounds(300, 125, 80, 25);
		JP.add(Back);
		JP.add(TB);
		
		final JTextField TP=new JTextField();
		TP.setBounds(140, 165, 150, 25);
		JP.add(TP);
		final JTextField TM=new JTextField();
		TM.setBounds(140, 205, 150, 25);
		JP.add(TM);
		final JTextField TD=new JTextField();
		TD.setBounds(140, 245, 150, 25);
		JP.add(TD);
		final JButton Up=new JButton("Update");
		Up.setBounds(300, 300, 80, 25);
		JP.add(Up);
		Up.setEnabled(false);
		Search.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				B=TB.getText();
				A=TA.getText();
				P="";M="";D="";
				if(B.length()==0 || A.length()==0)
				{
					TB.setText("");
					TA.setText("");
					 TP.setText("");
						TM.setText("");
						TD.setText("");
					JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						Connection SqlCon=DriverManager.getConnection(URL,username,password);
						Statement SqlState=SqlCon.createStatement();
						ResultSet rs=SqlState.executeQuery("Select * from book where name like'%"+B+"%' and author like '%"+A+"%'");		
						while(rs.next())
						{
							P=rs.getString("price");
							M=rs.getString("amount");
							D=rs.getString("date");
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(P.length()==0 && M.length()==0 && D.length()==0)
					{
						 JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
							        JOptionPane.ERROR_MESSAGE);
						 TP.setText("");
							TM.setText("");
							TD.setText("");
							TA.setText("");
							TB.setText("");
							Up.setEnabled(false);
					}
					else
						
					{
						TP.setText(P);
						TM.setText(M);
						TD.setText(D);
						Up.setEnabled(true);
						
					}
				}
//					Search.removeActionListener(this);

			}
		});
		
       Back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				home();
				Back.removeActionListener(this);
			}
		});
		 Up.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String X="",Y="",Z="";
					
					X=TP.getText();
					Y=TM.getText();
					Z=TD.getText();

int opcion = JOptionPane.showConfirmDialog(null, "Want to Update?", "Confirm", JOptionPane.YES_NO_OPTION);

if (opcion == 0) { //The ISSUE is here
	if(X.length()==0||Y.length()==0||Z.length()==0){
		JOptionPane.showConfirmDialog(null,"No Box Can Be Empty","Error",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
		TP.setText(P);
		TM.setText(M);
		TD.setText(D);
		
	}else{
	
	try {
		Up.setEnabled(true);
		Connection SqlCon=DriverManager.getConnection(URL,username,password);
		Statement SqlState=SqlCon.createStatement();
		SqlState.executeUpdate("update  book set price='"+X+"',amount='"+Y+"',date='"+Z+"' where name like'%"+B+"%' and author like '%"+A+"%'");	
		JOptionPane.showConfirmDialog(null,"Book Updated Successfully","Success",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
		TP.setText(X);
		TM.setText(Y);
		TD.setText(Z);
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	
} 
else {
	
   
}				
				}
			});
	}
	static void delete()
	{
		clear();
		heading();
		JLabel BookName=new JLabel("Book Name:");
		BookName.setBounds(10, 85, 120, 30);
		BookName.setFont(new Font("Nyala",Font.BOLD,17));
		BookName.setForeground(Color.decode("#FFFFFF"));
		JP.add(BookName);
		JLabel AuthorName=new JLabel("Author Name:");
		AuthorName.setBounds(10, 125, 100, 30);
		AuthorName.setFont(new Font("Nyala",Font.BOLD,17));
		AuthorName.setForeground(Color.decode("#FFFFFF"));
		JP.add(AuthorName);
		JLabel Price=new JLabel("Price:");
		Price.setBounds(10, 165, 100, 30);
		Price.setFont(new Font("Nyala",Font.BOLD,17));
		Price.setForeground(Color.decode("#FFFFFF"));
		JP.add(Price);
		JLabel Amount=new JLabel("Amount:");
		Amount.setBounds(10, 205, 100, 30);
		Amount.setFont(new Font("Nyala",Font.BOLD,17));
		Amount.setForeground(Color.decode("#FFFFFF"));
		JP.add(Amount);
		JLabel Date=new JLabel("Date:");
		Date.setBounds(10, 245, 100, 30);
		Date.setFont(new Font("Nyala",Font.BOLD,17));
		Date.setForeground(Color.decode("#FFFFFF"));
		JP.add(Date);
		
		final JTextField TB=new JTextField();
		TB.setBounds(140, 85, 150, 25);
		JP.add(TB);
		final JTextField TA=new JTextField();
		TA.setBounds(140, 125, 150, 25);
		JP.add(TA);
		JButton Search=new JButton("Search");
		Search.setBounds(300, 85, 80, 25);
		JP.add(Search);
		final JButton Back=new JButton("Back");
		Back.setBounds(300, 125, 80, 25);
		JP.add(Back);
		final JLabel TP=new JLabel("");
		TP.setBounds(140, 165, 150, 25);
		TP.setFont(new Font("Nyala",Font.BOLD,17));
		TP.setForeground(Color.decode("#FFFFFF"));
		JP.add(TP);
		final JLabel TM=new JLabel("");
		TM.setBounds(140, 205, 150, 25);
		TM.setFont(new Font("Nyala",Font.BOLD,17));
		TM.setForeground(Color.decode("#FFFFFF"));
		JP.add(TM);
		final JLabel TD=new JLabel("");
		TD.setBounds(140, 245, 150, 25);
		TD.setFont(new Font("Nyala",Font.BOLD,17));
		TD.setForeground(Color.decode("#FFFFFF"));
		JP.add(TD);
		final JButton Del=new JButton("Delete");
		Del.setBounds(300, 300, 80, 25);
		JP.add(Del);
		Del.setEnabled(false);
		Search.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				B=TB.getText();
				A=TA.getText();
				P="";M="";D="";
				if(B.length()==0 || A.length()==0)
				{
					TB.setText("");
					TA.setText("");
					 TP.setText("");
						TM.setText("");
						TD.setText("");
					JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
				}
				else {
					try {
						Connection SqlCon=DriverManager.getConnection(URL,username,password);
						Statement SqlState=SqlCon.createStatement();
						ResultSet rs=SqlState.executeQuery("Select * from book where name like'%"+B+"%' and author like '%"+A+"%'");		
						while(rs.next())
						{
							P=rs.getString("price");
							M=rs.getString("amount");
							D=rs.getString("date");
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(P.length()==0 && M.length()==0 && D.length()==0)
					{
						 JOptionPane.showMessageDialog(new JFrame(), "No Result Found", "Dialog",
							        JOptionPane.ERROR_MESSAGE);
						 TP.setText("");
							TM.setText("");
							TD.setText("");
							TA.setText("");
							TB.setText("");
							Del.setEnabled(false);
					}
					else
						
					{
						TP.setText(P);
						TM.setText(M);
						TD.setText(D);
						Del.setEnabled(true);
					}
				}
//					Search.removeActionListener(this);

			}
		});
		
       Back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				home();
				Back.removeActionListener(this);
			}
		});
		 Del.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{


int opcion = JOptionPane.showConfirmDialog(null, "Want to Delete?", "Confirm", JOptionPane.YES_NO_OPTION);

if (opcion == 0) { //The ISSUE is here
	
	try {
		Connection SqlCon=DriverManager.getConnection(URL,username,password);
		Statement SqlState=SqlCon.createStatement();
		SqlState.executeUpdate("delete from book where name like'%"+B+"%' and author like '%"+A+"%'");	
		TA.setText("");
		TB.setText("");
		TP.setText("");
		TM.setText("");
		TD.setText("");
		JOptionPane.showConfirmDialog(null,"Book Deleted Successfully","Success",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
		Del.setEnabled(false);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
} 
else {
	
   
}				
				}
			});
	}
	static void viewall()
	{
		Vector data=new Vector();
		Vector row=new Vector();
		try {
			Connection SqlCon=DriverManager.getConnection(URL,username,password);
			Statement SqlState=SqlCon.createStatement();
			ResultSet rs=SqlState.executeQuery("Select * from book");
			

			while(rs.next())
			{
				row=new Vector(5);
				for(int i=1;i<=5;i++)
				{
					row.add(rs.getString(i));
				}
				data.add(row);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		window.setEnabled(false);
		JFrame f;       
	    f=new JFrame("View All");       
	    Vector column=new Vector();  
	    column.addElement("Name");
	    column.addElement("Author");
	    column.addElement("Price");
	    column.addElement("Amount");
	    column.addElement("Date");
	    JTable jt=new JTable(data,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    jt.setEnabled(false);
	    f.setAlwaysOnTop (true);
	    f.add(sp);          
	    f.setSize(800,200);   
	    jt.getTableHeader().setReorderingAllowed(false);
	    f.setVisible(true);   
	    f.setResizable(false);
	    f.addWindowListener(new java.awt.event.WindowAdapter() {
	        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
	            window.setEnabled(true);
	        }
	    });
	    
		
	}
    static void clear()
    {
    	window.getContentPane().removeAll();
		JP.removeAll();
		window.getContentPane().add(JP);
		window.getContentPane().revalidate();
		JP.repaint();
		JP.setBackground(Color.decode("#006DB6"));
    }
}
