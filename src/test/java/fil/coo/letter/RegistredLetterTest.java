package fil.coo.letter;
import static org.junit.Assert.*;
import org.junit.Test;
import fil.coo.city.City;
import fil.coo.content.*;
import fil.coo.inhabitant.*;
import fil.coo.letter.*;


public class RegistredLetterTest extends DecoratorLetterTest {

	
	protected Letter<Letter<?>> createLetter() {
		City c=new City("teeeest");
		this.sender=new Inhabitant("Test",c,20);
		this.receiver=new Inhabitant("Tests",c,20);
		this.cont=new MockLetter(sender,receiver,new MockContent());		
		return new RegisteredLetter(cont);
		
	}
	

@Test
public void actionTest() {
	int prev=receiver.getCity().getMailbox().size();
	Letter<Letter<?>> l=createLetter();
	l.action();
	assertEquals(prev+1,receiver.getCity().getMailbox().size());
	
}
	
	
	
	
	

}
