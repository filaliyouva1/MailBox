/**
 *
 */
package fil.coo.letter;

/**
 * @author Filali Youva
 *
 */
public class UrgentLetter extends DecoratorLetter {

		/**
	 	* @param l the letter to transform on UrgentLetter

	 	*/
	public UrgentLetter(Letter<?> l) {
		super (l);
	}
	/**
	*allows to return the return the UrgentLetter's cost
	*@return the UrgentLetter's cost
	*/
	public float getCost() {
		return 2*this.cont.getCost();
	}

	/**
	*the UrgentLetter's action
	*/
	public void action() {
		this.cont.action();
	}

	public String toString() {
		return cont.toString()+"URGENT ";
	}

}
