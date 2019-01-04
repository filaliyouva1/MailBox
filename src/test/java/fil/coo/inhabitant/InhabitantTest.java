package fil.coo.inhabitant;
import fil.coo.city.*;
import fil.coo.letter.*;
import fil.coo.content.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class InhabitantTest {


	public City city;
	public Inhabitant i;
	public Inhabitant i2;
	public Letter<MockContent> l;
@Before

public void createInstance(){
this.city =new City("Lille");
this.i=new Inhabitant("saad",city,20);
this.i2=new Inhabitant("saad",city,20);
this.l=new MockLetter(i,i2,new MockContent());

}


@Test
public void inhabitantNotNullTest() {
	assertNotNull(i);
}

@Test
public void getCityTest() {
	assertEquals(i.getCity(),city);
}

@Test
public void getAccoundTest() {
	assertEquals(i.getAccount(),20);

}


@Test
public void debitTest() {
	assertEquals(i.getAccount(),20);
	i.debit(2);
	assertEquals(i.getAccount(),18);
}


@Test
public void creditTest() {
	assertEquals(i.getAccount(),20);
	i.credit(2);
	assertEquals(i.getAccount(),22);
}

@Test
public void sendLetterTest() {
	int prev=i.getAccount();
	i.sendLetter(l);
	assertTrue(city.getMailbox().contains(l));
	assertEquals(i.getAccount(),(int) (prev-l.getCost()));


}





}
