package fil.coo.content;

/**
 * @author  Filali Youva
 *
 */
public class Money implements Content {
	private float c;

	/**
	*Constructor of Money's class
	*@param  i the money's value  
	*/
	public Money(float i) {
		this.c=i;
	}


	public String toString() {
		Float i=(Float) c;
		return i.toString();
	}

	/**
	*allows to return the city's name
	*@return  the money's value
	*/
	public float getMoney() {
		return c;
	}
}
