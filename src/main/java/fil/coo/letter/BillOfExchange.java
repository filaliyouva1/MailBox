package fil.coo.letter;
import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;
/**
 * @author  Filali Youva
 *
 */
public class BillOfExchange extends Letter<Money> {
	protected static final float COST=1;
	/**
	*Constructor of BillOfExchange's class
	*@param s the letter's sender
	*@param r the letter's receiver
	*@param c the letter's content
	*/
	public BillOfExchange(Inhabitant s, Inhabitant r, Money c) {
		super(s, r, c);
	}
	/**
	 * @return the cost
	 */
	public float getCost() {
		return (float) (COST+0.01*cont.getMoney());
	}

	/**
  *the BillOfExchange's action
  */
	public void action() {
		Letter<Text> l=new ThanksLetter(this);
		sender.debit(cont.getMoney());
		receiver.credit(cont.getMoney());
		System.out.println("courrier"+cpt+" "+this+"(cout:"+this.COST+") de [valeur = "+this.getContent()+" euros] envoye par "+sender+" reçu par "+receiver);
		receiver.sendLetter(l);
	}

	/**
	*return String representation of this BillOfExchange.
	*/
	public String toString() {
		return "de change ";
	}
}
