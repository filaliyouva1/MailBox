/**
 *
 */
package fil.coo.letter;

import fil.coo.content.Text;
import fil.coo.inhabitant.Inhabitant;

/**
 * @author  Filali Youva
 *
 */
public class ThanksLetter extends SimpleLetter {

	/**
	 * @param l the original letter.

	 */
	public ThanksLetter(Letter l) {
		super(l.getReceiver(), l.getSender(), new Text("merci pour courrier"+l.getCpt()+" de change"));
	}
	/**
	*return String representation of this ThanksLetter.
	*/
	public String toString() {
		return "de remerciement ";
	}

}
