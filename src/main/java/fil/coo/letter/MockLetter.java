package fil.coo.letter;

import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;

/**
 * @author  Filali Youva
 *
 */
public class MockLetter extends Letter<MockContent> {




	public MockLetter(Inhabitant s, Inhabitant r, MockContent c) {
		super(s, r, c);
	}


	public float getCost() {
		return 5;
	}


	public void action() {

	}

	public String toString() {
		return "MockLetter";
	}


}
