package fil.coo.inhabitant;

import fil.coo.city.*;
import fil.coo.letter.*;

/**
 * @author  Filali Youva
 *
 */
public class Inhabitant {
	private String name;
	private City city;
	private int account;
	/**
	 * @param name Name of this Inhabitant.
	 * @param city City of this Inhabitant.
	 * @param account this Inhabitant's money.
	 */
	public Inhabitant(String name, City city, int account) {
		this.name = name;
		this.city = city;
		this.account = account;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @return the account
	 */
	public int getAccount() {
		return account;
	}
	
	public void debit(float i) {
		this.account-=i;
	}
	
	public void credit(float i) {
		this.account+=i;
	}
	
	public void sendLetter(Letter<?> l) {
		if (l.getCost()<=this.account) {
			city.addLetter(l);
			l.getSender().debit(l.getCost());
		}
		System.out.println(">>> "+l.getSender()+" envoie courrier"+l.getCpt()+" "+l+ "(cout:"+l.getCost()+") a "+l.getReceiver());
	}
	
	public void receiveLetter(Letter<?> l) {
		l.action();
	}
		
	public String toString() {
		return this.name;
	}
	
	
	
	
}
