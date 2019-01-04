package fil.coo.letter;

import java.util.*;

import fil.coo.content.*;
import fil.coo.inhabitant.Inhabitant;

/**
 * @author  Filali Youva
 *
 */
public class FoolLetter extends Letter<NamesList> {
	protected static final float COST=(float) 0.5;
	/**
	*Constructor of FoolLetter's class
	*@param s the letter's sender
	*@param r the letter's receiver
	*@param c the letter's content
	*/
	public FoolLetter(Inhabitant s, Inhabitant r, NamesList c) {
		super(s, r, c);
	}
	/**
	 * @return the cost
	 */
	public float getCost() {
		return COST;
	}
	/**
	*the FoolLetter's action:
	*The receiver has 15% chance to react to the FoolLetter by sending 5 Euros to  random Inhabitants and sending 10 new f
	*/
	public void action() {
		System.out.println("courrier"+cpt+" "+this+"(cout:"+this.COST+") avec comme liste de nom: "+this.cont+" envoye par "+sender+" reçu par "+receiver);
		if (receiver.getAccount()<0) { //Le sujet a précisé que le receiver n'envoie rien que si son solde est négatif.
			return;
		}
		Random r=new Random();
		int rand=r.nextInt(101);
		if (rand<=15) {
			List<Inhabitant> l=receiver.getCity().getRandomInhabitants();
			if (l.contains(receiver)) {
				l.remove(receiver);
			}else if(l.size()==11) {
				l.remove(0);
			}
			List<Inhabitant> l1=cont.getList();
			for (Inhabitant i : l1) {
				receiver.sendLetter(new BillOfExchange(receiver,i,new Money(5)));
			}
			l1.remove(0);
			l1.add(receiver);
			NamesList n=new NamesList(l1);
			for (Inhabitant i : l) {
				receiver.sendLetter(new FoolLetter(receiver,i,n));
			}
		}



	}
	/**
	*return String representation of this FoolLetter.
	*/
	public String toString() {
		return "de chaine a naif ";
	}

}
