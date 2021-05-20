package matchGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame implements ActionListener {
	
	JPanel panel; 
	JButton[] functionButtons = new JButton[36];
	JButton one,two,three, four, five, six,seven,eight,nine,ten,eleven,twelve;
	
	private static final int NUM_OF_ROWS = 6 ;
	private static final int NUM_OF_COLUMNS = 6 ;
	private static final int NUM_OF_PAIRS = 18;
	
	private static final int FIRST_CARD = 0;
	private static final int SECOND_CARD = 1; 
	
	Font font = new Font ("Arial", Font.BOLD, 20);
	
	
	public Board(){
		super();
		
		setSize(600,600);
		setVisible(true);
		setLayout(new GridLayout(NUM_OF_ROWS, NUM_OF_COLUMNS));
		setResizable(false);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 10, 560,520);
		
		this.add(panel);
		
		functionButtons[0] = one;
		functionButtons[1] = two;
		functionButtons[2] = three;
		functionButtons[3] = four;
		functionButtons[4] = five;
		functionButtons[5] = six;
		functionButtons[6] = seven;
		functionButtons[7] = eight;
		functionButtons[8] = nine;
		functionButtons[9] = ten;
		functionButtons[10] = eleven;
		
		for(int i = 0; i<8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(font);
			functionButtons[i].setFocusable(false);
		
		
	}
	
	

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
