/**
 *
 */
package fil.coo.letter;

import fil.coo.content.Text;

/**
 * @author  Filali Youva
 *
 */
public class RegisteredLetter extends DecoratorLetter {


	/**
	*RegisteredLetter Constructor.
 	* @param l the letter to transform to a RegistlettereredLetter
 	*/
	public RegisteredLetter(Letter<?> l) {
		super(l);
	}

	/**
  *allows to return the return the RegisteredLetter's cost
  *@return the RegisteredLetter's cost
  */
	public float getCost() {
		return (float) (this.cont.getCost()*1.15);
	}

	/**
  *the RegisteredLetter's action
  */
	public void action() {
		this.cont.action();
		Letter<Text> l=new AcknowledgementOfReceipt(this);
		receiver.sendLetter(l);
	}

	/**
	*return String representation of this RegisteredLetter.
	*/
	public String toString() {
		return cont.toString()+"recommande ";
	}

}
