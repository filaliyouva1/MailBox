package fil.coo.content;

/**
 * @author  Filali Youva
 *
 */
public class Text implements Content {
	private String text;


	/**
	*Constructor of Text's Class
	*@return  the city's name
	*/
	public Text(String s) {
		this.text=s;
	}

	
	public String toString() {
		return this.text;
	}
}
