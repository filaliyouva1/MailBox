package fil.coo.letter;
import fil.coo.city.*;
import fil.coo.inhabitant.*;
import fil.coo.content.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public abstract class LetterTest<T extends Content> {
 
protected T cont;
protected Inhabitant sender;
protected Inhabitant receiver;
protected Letter<T> l;
	
protected abstract Letter<T> createLetter();


@Before
public void init() {
	this.l=this.createLetter();
}

@Test
public void getContentTest() {
	assertEquals(cont,l.getContent());
	
}


@Test
public void getSenderTest() {
	assertEquals(sender,l.getSender());
}


@Test
public void getReceiverTest() {
	assertEquals(receiver,l.getReceiver());
}


	
	
	
	
	
	
	
	
	
	
}
