package matchGame;

import javax.swing.JButton;

public class Cells extends JButton {
	
	
	private boolean Selected = false;
	private boolean Matched = false;
	
	public boolean isMatched() {
		if(Matched ==  true) {
			return true;		
		}
		
		else {
			return false;
		}
	}

}
