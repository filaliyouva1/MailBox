package fil.coo;

import fil.coo.city.*;
import fil.coo.content.*;
import fil.coo.inhabitant.*;
import fil.coo.letter.*;
import java.util.Random;

import java.util.List;

public class Simulation1 {

	public static void main(String[] args) {
		City V=new City("Lille");
		Random rand=new Random();
		int nbInhabitants=10;
		int randomInh;
		int randomLetter;
		Letter l = null;
		for (int i=0;i<nbInhabitants;i++) {
			V.addInhabitant(new Inhabitant("hab"+i,V,100));
		}
		List<Inhabitant> li=V.getInhabitants();
		int k=4;
		int i=1;
		for(;i<=k;i++){
			for (int u=0;u<10;u++) {
				System.out.print("__");
			}
			System.out.println("");
			System.out.println("Jour"+i);
			V.distributeLetters();
			for (int h=0;h<nbInhabitants;h++) {
				randomInh=rand.nextInt(nbInhabitants-1);
				while (randomInh==h) {
					randomInh=rand.nextInt(nbInhabitants-1);
				}
				Inhabitant sender=li.get(h);
				Inhabitant receiver=li.get(randomInh);
				randomLetter=rand.nextInt(2);
				switch (randomLetter) {
				case 0:
					l=new SimpleLetter(sender,receiver,new Text("blabla"));
					break;
				case 1:
				
					l=new BillOfExchange(sender,receiver,new Money(rand.nextInt(20)));
					break;
				default:
					break;
				}
				randomLetter=rand.nextInt(5);
				switch (randomLetter) {
				case 0:
					l=new RegisteredLetter(l);
					break;
				case 1:
					l=new UrgentLetter(l);
					break;
				default:
					break;
				}
				sender.sendLetter(l);	
			}
		}
		
		while (!V.getMailbox().isEmpty()) {
			for (int u=0;u<10;u++) {
				System.out.print("__");
			}
			System.out.println("");
			System.out.println("Jour"+i);
			V.distributeLetters();
			i++;
		}
	}

}
