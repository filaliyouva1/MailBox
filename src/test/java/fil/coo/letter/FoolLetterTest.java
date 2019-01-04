package fil.coo.letter;
import fil.coo.city.City;
import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FoolLetterTest extends LetterTest<NamesList> {


	protected Letter<NamesList> createLetter() {
		City c=new City("teeeest");
		this.sender=new Inhabitant("Test",c,20);
		this.receiver=new Inhabitant("Tests",c,20);
    List<Inhabitant> l=new ArrayList<Inhabitant>();
    l.add(new Inhabitant("Tests",c,20));
    l.add(new Inhabitant("Tests",c,20));
    l.add(new Inhabitant("Tests",c,20));
    l.add(new Inhabitant("Tests",c,20));
		this.cont=new NamesList(l);
		return new FoolLetter(sender,receiver,cont);

	}

@Test
public void actionTest(){
		// On peut pas la tester parce qu'on peut pas décider son comportement. (15% de chance de faire une action).
		}


}
