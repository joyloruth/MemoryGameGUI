package matchGameNew;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton {
	
	ImageIcon cardBack = new ImageIcon( "mad.png");
	ImageIcon cardImage;
	String[] pics = {"kiss.png", "smile.png"};
	
	Card(){
		
		for(String pic: pics) {
			System.out.println(pic + cardBack);
		}
		
		
		
	
	}
	

}
