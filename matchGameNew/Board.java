package matchGameNew;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JFrame {
	
	Panel panel;
	JPanel panel2 = new JPanel();
	ImageIcon avatar = new ImageIcon("kiss.png");
	JLabel label;
	JButton button;
	
	
	Board(){
		
		super();
		
		this.setBounds(10,10,1200,600);
		this.setVisible(true);
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.blue);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("Matching Game");
		this.setIconImage(avatar.getImage());
		
		
		
		panel = new Panel();
		this.add(panel);
		
		label = new JLabel();
		label.setBounds(1010,50,200,20);
		label.setText("Number of Matches");
		
		panel2.add(label);
		
		
		panel2.setBackground(Color.cyan);
		panel2.setBounds(975,30, 200, 300);
		
		this.add(panel2);
		
		button = new JButton("Start");
		button.setBounds(40,200,100, 40);
		panel2.add(button);
		//JOptionPane.showMessageDialog(null, "        Press Ok To Start","Start", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
