package fil.coo.letter;
import fil.coo.city.City;
import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;
import org.junit.*;
import static org.junit.Assert.*;

public class BillOfExchangeTest extends LetterTest<Money> {

	
	protected Letter<Money> createLetter() {
		City c=new City("teeeest");
		this.sender=new Inhabitant("Test",c,20);
		this.receiver=new Inhabitant("Tests",c,20);
		this.cont=new Money(10);
		return new BillOfExchange(sender,receiver,cont);
		
	}
	
@Test
public void actionTest(){
		l.action();
		assertEquals(receiver.getAccount(),29);  //le compte du distinataire a bien été crédité de la somme reçue 
		
		assertEquals(receiver.getCity().getMailbox().size(),1);  //le destinataire a bien renvoyé une lettre de remerciement 
		}


}
