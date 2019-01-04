package fil.coo.letter;

import fil.coo.content.Text;
import fil.coo.inhabitant.Inhabitant;

/**
 * @author  Filali Youva
 *
 */
public class AcknowledgementOfReceipt extends SimpleLetter {
	/**
 	 * @param l the Original Letter (RegisteredLetter).
 	 */
	public AcknowledgementOfReceipt(Letter l) {
		super(l.getReceiver(), l.getSender(), new Text("accuse du courrier"+l.getCpt()+" "+l));
	}

	/**
	*return String representation of this AcknowledgementOfReceipt.
	*/
	public String toString() {
		return "accuse de reception ";
	}

}
