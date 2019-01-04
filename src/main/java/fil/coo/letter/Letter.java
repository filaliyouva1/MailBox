package fil.coo.letter;

import fil.coo.content.Content;
import fil.coo.inhabitant.*;

/**
 * @author Filali Youva
 *
 */
public abstract class Letter<T extends Content> implements Content{
	protected T cont;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected static int instance=0;
	protected int cpt;



	public abstract float getCost();
	public abstract void action();

	/**
	*Constructor of letter's class
	*@param s the letter's sender
	*@param r the letter's receiver
	*@param c the letter's content
	*/
	public Letter(Inhabitant s,Inhabitant r,T c) {
		cont=c;
		sender=s;
		receiver=r;
		cpt=Letter.instance++;
	}

	/**
	 * @return the cont
	 */
	public T getContent() {
		return cont;
	}

	/**
	 * @param cont the cont to set
	 */
	public void setContent(T cont) {
		this.cont = cont;
	}

	/**
	 * @return the sender
	 */
	public Inhabitant getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(Inhabitant sender) {
		this.sender = sender;
	}

	/**
	 * @return the receiver
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}

	public int getCpt() {
		return cpt;
	}

	public void setCpt(int c) {
		this.cpt=c;
	}
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Inhabitant receiver) {
		this.receiver = receiver;
	}



}
