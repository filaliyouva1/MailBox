package fil.coo.letter;

import fil.coo.city.City;
import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;

public class SimpleLetterTest extends LetterTest<Text> {

	
	protected Letter<Text> createLetter() {
		City c=new City("teeeest");
		this.sender=new Inhabitant("Test",c,20);
		this.receiver=new Inhabitant("Tests",c,20);
		this.cont=new Text("Message");
		return new SimpleLetter(sender,receiver,cont);
	}

	
	
}
