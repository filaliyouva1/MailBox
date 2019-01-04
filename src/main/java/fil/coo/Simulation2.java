package fil.coo;
import fil.coo.content.*;
import fil.coo.inhabitant.*;
import fil.coo.letter.*;

import java.util.*;
import fil.coo.city.*;
public class Simulation2 {

	public static void main(String[] args) {
		City V=new City("Lille");
		int nbInhabitants=30;
		Letter<NamesList> l1 = null;
		List<Inhabitant> In=V.getInhabitants();
		for (int i=0;i<nbInhabitants;i++) {
			V.addInhabitant(new Inhabitant("hab"+i,V,100));
		}
		List<Inhabitant> l=new ArrayList<Inhabitant>();
		l.add(In.get(0));
		l.add(In.get(1));
		l.add(In.get(2));
		l.add(In.get(3));
		NamesList s=new NamesList(l);
		l1= new FoolLetter(In.get(4),In.get(5),s);
		In.get(4).sendLetter(l1);
		while (!V.getMailbox().isEmpty()) {
			V.distributeLetters();
		}
		Inhabitant i=In.get(0);
		for (int k=1;k<In.size();k++) {
			if (i.getAccount()<In.get(k).getAccount()) {
				i=In.get(k);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("L'habitant le plus riche de la ville est: "+i+" avec "+i.getAccount()+" Euros dans son compte en banque."); // On resort rarement gagnant de cette chaine, et même si on resort gagnant c'est pas grand chose.
																																		// Par contre on perd beaucoup dans la plupart des cas.
		
	}

}
