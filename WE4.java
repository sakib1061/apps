import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import com.sun.prism.Graphics;


public class WE4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame JF=new JFrame("WE4");
		JF.setSize(400, 200);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel JP=new JPanel(null);
		JF.getContentPane().add(JP);
		JP.setBackground(Color.decode("#33ccff"));
		String[] list={"Select","Takib","Sandipan","Rabiul","Sakib"};
		final String Name[]={"","Ahadul Islam","Sandipan Kar","Rabiul Alam","Md. Sakib Hossain"};
		final String Blood[]={"","A+","A+","O-","A+"};
		final String Roll[]={"","ASH1401006M","ASH1401011M","ASH1401057M","ASH1401064M"};
		final JComboBox JC=new JComboBox(list);
		JC.setBounds(0, 0, 395, 30);
		JP.add(JC);
		
		JC.setBackground(Color.decode("#66ccff"));
		JLabel C=new JLabel("Created By Sakib");
		C.setBounds(140, 150, 100, 20);
		JP.add(C);
		C.setForeground(Color.decode("#006699"));
		final ImageIcon I[]= new ImageIcon [5];
		for(int i=0;i<5;i++)
			I[i]=new ImageIcon("icon/IC"+i+".jpg");
		final JLabel IL=new JLabel("");
		IL.setBounds(15, 40, 100, 100);
		IL.setIcon(I[0]);
		JP.add(IL);
		JLabel N=new JLabel("Name : ");
		JLabel B=new JLabel("Blood : ");
		JLabel R=new JLabel("Roll : ");
		JLabel M=new JLabel("Mobile : ");
		N.setBounds(125, 40, 50, 20);
		R.setBounds(125, 65, 50, 20);
		B.setBounds(125, 90, 50, 20);
		M.setBounds(125, 115, 50, 20);
		JP.add(N);
		JP.add(R);
		JP.add(B);
		JP.add(M);
		final JLabel CN=new JLabel("----------");
//		CN.setText("----------");
		final JLabel CB=new JLabel("----------");
		final JLabel CR=new JLabel("----------");
		final JLabel CM=new JLabel("----------");
		CN.setBounds(175, 40, 100, 20);
		CR.setBounds(175, 65, 100, 20);
		CB.setBounds(175, 90, 100, 20);
		CM.setBounds(175, 115, 100, 20);
		JP.add(CN);
		JP.add(CR);
		JP.add(CB);
		JP.add(CM);
		JC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int in=JC.getSelectedIndex();
				CN.setText(Name[in]);
				CR.setText(Roll[in]);
				CB.setText(Blood[in]);
				IL.setIcon(I[in]);
			}
		});
		
		JF.setVisible(true);
		JF.setResizable(false);

	}

}
