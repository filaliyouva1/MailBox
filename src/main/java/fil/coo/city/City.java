package fil.coo.city;
import fil.coo.inhabitant.*;
import fil.coo.letter.*;
import fil.coo.content.*;
import java.util.*;

/**
 * @author  Filali Youva
 *
 */
public class City{
	private String name;
	private List<Inhabitant> inhabitants;
	private List<Letter<?>> mailbox;
	
	public City(String n) {
		name=n;
		inhabitants=new ArrayList<Inhabitant>();
		mailbox=new ArrayList<Letter<?>>();
	}
	
	public String getName() {
		return name;
	}

	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public List<Letter<?>> getMailbox() {
		return mailbox;
	}

	public List<Inhabitant> getRandomInhabitants(){
		if (inhabitants.size()<10) {
			//throw SmallCityException("La ville est petite."); On a simplement choisit de retourner la liste d'habitant dans le cas d'une petite ville.
			return inhabitants;
		}
		List<Inhabitant> l=new ArrayList<Inhabitant>();
		while (l.size()!=11) { //Dans le cas normal cette méthode retourne une liste de 11 personnes, le sender d'une FoolLetter 
			Inhabitant i=getOneInhabitant(); //peut y être donc dans cette dernière on l'enlève si il y est sinon on enlève le premier 
			if (!l.contains(i)) { //habitant tout simplement comme ca on aura toujours une liste de 10 personnes (ou moins dans le cas d'une petite ville) avant 
				l.add(i); // d'effectuer l'envoie.
			}
		}
		return l;
	}
	
	public Inhabitant getOneInhabitant() {
		Random rand=new Random();
		int x=rand.nextInt(inhabitants.size());
		return inhabitants.get(x);
	}
	
	
	public void addLetter(Letter<?> l) {
		this.mailbox.add(l);
	}
	
	public void addInhabitant(Inhabitant i) {
		this.inhabitants.add(i);
	}
	
	public void distributeLetters() {
		int u=this.mailbox.size();
		for (int i=0;i<u;i++){
			Letter l=this.mailbox.get(0);
			l.getReceiver().receiveLetter(l);
			this.mailbox.remove(0);
		}
	}
	
}
