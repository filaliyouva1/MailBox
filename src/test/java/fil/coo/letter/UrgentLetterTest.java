package fil.coo.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.city.City;

import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;

public class UrgentLetterTest extends DecoratorLetterTest {

	
	protected Letter<Letter<?>> createLetter() {
		
			City c=new City("teeeest");
			this.sender=new Inhabitant("Test",c,20);
			this.receiver=new Inhabitant("Tests",c,20);
			this.cont=new MockLetter(sender,receiver,new MockContent());
			return new UrgentLetter(cont);
			
	}
	

@Test
public void getCostTest() {
	Letter<Letter<?>> l=createLetter();
    int expected=(int)(this.cont.getCost()*2);
    int found=(int)l.getCost();
	assertEquals(found,expected);
	
}

}
