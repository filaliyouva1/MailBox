package fil.coo.city;
import fil.coo.city.*;
import fil.coo.inhabitant.*;
import fil.coo.letter.*;
import fil.coo.content.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public class CityTest{
	public City city;
	public Inhabitant i;
	public Inhabitant i2;
@Before

public void createInstance(){
this.city =new City("Lille");
this.i=new Inhabitant("saad",city,20);
this.i2=new Inhabitant("saad",city,20);

}	


@Test
public void cityNotNullTest(){
	assertNotNull(city);
		}

@Test
public void getNameTest(){
	assertEquals(city.getName(),"Lille");
		}

@Test
public void AddInhabitantTest(){
	assertTrue(city.getInhabitants().isEmpty());
	city.addInhabitant(new Inhabitant("saad",city,20));
	assertFalse(city.getInhabitants().isEmpty());
		}

@Test
public void AddLetterTest(){
	assertTrue(city.getMailbox().isEmpty());
	city.addLetter(new SimpleLetter(i,i2,new Text("blabla")));
	assertFalse(city.getMailbox().isEmpty());
		}

@Test
public void getMailboxTest(){
	Letter<MockContent> l=new MockLetter(i,i2,new MockContent());
	i.sendLetter(l);
	assertTrue(city.getMailbox().contains(l));
}

@Test
public void getInhabitantTest(){
	assertTrue(city.getInhabitants().isEmpty());
	city.addInhabitant(i);
	assertTrue(city.getInhabitants().contains(i));
		}

@Test
public void distributeLetterTest() {
	
	Letter<MockContent> l=new MockLetter(i,i2,new MockContent());
	Letter<MockContent> l2=new MockLetter(i,i2,new MockContent());
	city.addLetter(l2);
	city.addLetter(l);
	city.distributeLetters();
	assertFalse(city.getMailbox().contains(l));
	assertFalse(city.getMailbox().contains(l2));
}








	
	
	
	
	
	
	
	
	
	
	
}
