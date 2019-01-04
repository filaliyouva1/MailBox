package fil.coo.letter;

import fil.coo.inhabitant.*;

/**
 * @author  Filali Youva
 *
 */
public abstract class DecoratorLetter extends Letter<Letter<?>> {
 /**
 *Constructor of the DecoratorLetter's class
 *@param c the letter to  tranforme
 */
	public DecoratorLetter(Letter<?> c) {
		super(c.getSender(),c.getReceiver(),c);
		c.setCpt(this.cpt);
	}



}
