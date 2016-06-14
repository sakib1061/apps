import javax.swing.*;
public class LoveCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImageIcon licon=new ImageIcon(LoveCal.class.getResource("love-icon.png"));
		ImageIcon bicon=new ImageIcon(LoveCal.class.getResource("boy.png"));
		ImageIcon gicon=new ImageIcon(LoveCal.class.getResource("girl.png"));
		// TODO Auto-generated method stub
		String S1,S2;
		S1=(String) JOptionPane.showInputDialog(null, "Enter The Name of Boy", "Love Calculator", JOptionPane.PLAIN_MESSAGE,bicon, null, "");
		S2=(String) JOptionPane.showInputDialog(null, "Enter The Name of Girl", "Love Calculator", JOptionPane.PLAIN_MESSAGE,gicon,null, "");
		char B[],G[];
		B=S1.toCharArray();
		G=S2.toCharArray();
		int b=Character.getNumericValue(B[0]);
		int g=Character.getNumericValue(G[0]);
		int c=(b+g+S1.length()+S2.length())%100;
		JOptionPane.showMessageDialog(null,S1+" Loves "+S2+" "+c+"%" , "Love Calculator", JOptionPane.PLAIN_MESSAGE,licon);
		
	}

}
