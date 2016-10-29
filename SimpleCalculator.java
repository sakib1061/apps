import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class CalCulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	double firstnum,secondnum;
	double result;
	String Operation;
	String Answer;
	boolean Flag=false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalCulator window = new CalCulator();
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
	public CalCulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Simple Calculator By Sakib");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("cal.png")));
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 444, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn7.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
				if(G.equals("0"))
					textField.setText(btn7.getText()) ;	
				else {
				String Number=textField.getText()+ btn7.getText();
				textField.setText(Number );
				}
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(0, 64, 115, 50);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn8.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn8.getText()) ;		
					else {
				String Number=textField.getText()+ btn8.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(113, 64, 115, 50);
		frame.getContentPane().add(btn8);
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn9.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn9.getText()) ;	
					else {
				String Number=textField.getText()+ btn9.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(227, 64, 104, 50);
		frame.getContentPane().add(btn9);
		
		final JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0)
					textField.setText("");
				else {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="+";
				}
				
			}
		});
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnP.setBounds(330, 64, 114, 50);
		frame.getContentPane().add(btnP);
		//
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn4.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn4.getText()) ;	
					else {
				String Number=textField.getText()+ btn4.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(0, 110, 115, 50);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn5.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn5.getText()) ;	
					else {
				String Number=textField.getText()+ btn5.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(113, 110, 115, 50);
		frame.getContentPane().add(btn5);
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn6.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn6.getText()) ;	
					else {
				String Number=textField.getText()+ btn6.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(227, 110, 104, 50);
		frame.getContentPane().add(btn6);
		
		final JButton btnS = new JButton("-");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0)
					textField.setText("");
				else {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="-";
				}
			}
		});
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnS.setBounds(330, 110, 114, 50);
		frame.getContentPane().add(btnS);
		//
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn1.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn1.getText()) ;	
					else {
				String Number=textField.getText()+ btn1.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(0, 158, 115, 50);
		frame.getContentPane().add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn2.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn2.getText()) ;	
					else {
				String Number=textField.getText()+ btn2.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(113, 158, 115, 50);
		frame.getContentPane().add(btn2);
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn3.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn3.getText()) ;		
					else {
				String Number=textField.getText()+ btn3.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(227, 158, 104, 50);
		frame.getContentPane().add(btn3);
		
		final JButton btnM = new JButton("*");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0)
					textField.setText("");
				else {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="*";
				}
			}
		});
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnM.setBounds(330, 158, 114, 50);
		frame.getContentPane().add(btnM);
		//
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Flag==false)
				{
					textField.setText(btn0.getText() );
					Flag=true;
				}
				else {
					String G=textField.getText();
					if(G.equals("0"))
						textField.setText(btn0.getText()) ;	
					else {
				String Number=textField.getText()+ btn0.getText();
				textField.setText(Number );
					}
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(0, 206, 115, 66);
		frame.getContentPane().add(btn0);
		
		final JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(113, 206, 115, 66);
		frame.getContentPane().add(btnC);
		JButton btnE = new JButton("=");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0) {
					textField.setText("");
				}
				else {
				secondnum=Double.parseDouble(textField.getText());
				if(Operation=="+")
				{
					int Result=(int) (firstnum+secondnum);
					Answer=Integer.toString(Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="-")
				{
					int Result=(int) (firstnum-secondnum);
					Answer=Integer.toString(Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="*")
				{
					int Result=(int) (firstnum*secondnum);
					Answer=Integer.toString(Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="/")
				{
					result=firstnum/secondnum;
					Answer=Double.toString(result);
					textField.setText(Answer);
					
				}
				Flag=false;
				}
			}
		});
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnE.setBounds(227, 206, 104, 66);
		frame.getContentPane().add(btnE);
		
		final JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().length()==0)
					textField.setText("");
				else {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				Operation="/";
				}
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(330, 206, 114, 66);
		frame.getContentPane().add(btnD);
	}
}
