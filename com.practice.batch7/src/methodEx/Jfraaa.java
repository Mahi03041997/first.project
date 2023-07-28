package methodEx;

import java.awt.ActiveEvent;

import javax.swing.*;

public class Jfraaa {
	final JTextField text,t1,t2,t3;
	JLabel l1,l2,l3,l4;
Jfraaa(){
	JFrame jf = new JFrame("Practice");
	jf.setBounds(200, 200, 500, 500);
	
	JButton b1,b2;
	b1 = new JButton("LOGIN");
	b1.setBounds(80, 300, 200, 40);	
	
	l1 = new JLabel("Login Id         :");
	l2 = new JLabel("Password    : ");
	l4 = new JLabel();
	l4.setBounds(50, 10, 400, 15);
	
	
	text = new JTextField("BLACK WORLD");
	text.setBounds(20, 100, 300,50 );
	t1 = new JTextField();
	t1.setBounds(150, 165, 200, 30);
	t2 = new JTextField();
	t2.setBounds(150,200, 200, 30);
	t3 = new JTextField();
	t3.setBounds(50, 10, 400, 20);
	l1.setBounds(20, 160,200, 40);
	l2.setBounds(20, 200,200, 40);
	jf.add(text); 	jf.add(b1);	jf.add(l1);	jf.add(l2); jf.add(t1); jf.add(t2);jf.add(t3);jf.add(l4);
	jf.setLayout(null);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Jfraaa();

	}

}
