package matchGameNew;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton {
	
	ImageIcon cardBack = new ImageIcon( "mad.png");
	ImageIcon cards;
	String[] pics = {"kiss.png", "smile.png"};
	
	public Card(){
		
		
	
	}

	
	public Card(ImageIcon cardBack, ImageIcon cards, String[] pics) {
		super();
		this.cardBack = cardBack;
		this.cards = cards;
		this.pics = pics;
	}

	/**
	 * @return the cardBack
	 */
	public ImageIcon getCardBack() {
		return cardBack;
	}

	/**
	 * @param cardBack the cardBack to set
	 */
	public void setCardBack(ImageIcon cardBack) {
		this.cardBack = cardBack;
	}

	/**
	 * @return the pics
	 */
	public String[] getPics() {
		return pics;
	}

	/**
	 * @param pics the pics to set
	 */
	public void setPics(String[] pics) {
		this.pics = pics;
	}
	
	/**
	 * @return the cards
	 */
	public ImageIcon getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(ImageIcon cards) {
		this.cards = cards;
	}
	
	@Override
	public String toString() {
		return "Card [cardBack=" + cardBack + ", cards=" + cards + ", pics=" + Arrays.toString(pics) + "]";
	}


}
