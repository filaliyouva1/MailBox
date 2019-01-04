package fil.coo.letter;
import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;
/**
 * @author Filali youva
 *
 */
public class SimpleLetter extends Letter<Text> {
    protected static final float COST=(float) 0.5;

    /**
  	*Constructor of Simpleletter's class
  	*@param s the Simpleletterr's sender
  	*@param r the Simpleletter's receiver
  	*@param c the Simpleletter's content
  	*/
	public SimpleLetter(Inhabitant s, Inhabitant r, Text c) {
		super(s, r, c);
	}

  /**
  *allows to return the return the simpleletter's cost
  *@return the SimpleLetter's cost
  */
	public float getCost() {
		return COST;
	}

  /**
  *the SimpleLetter's action
  */
	public void action() {
		System.out.println("courrier"+cpt+" "+this+"(cout:"+this.COST+")["+this.getContent()+"] envoye par "+sender+" reçu par "+receiver);
	}
  /**
	*return String representation of this SimpleLetter.
	*/
	public String toString() {
		return "";
	}
}
