package fil.coo.content;

import java.util.*;

import fil.coo.inhabitant.*;

/**
 * @author Filali Youva
 *
 */
public class NamesList implements Content {
	private List<Inhabitant> list;
	/**
	 * 
	 */
	public NamesList(List<Inhabitant> l) {
		if (l.size()!=4) {
			throw new IllegalArgumentException("Argument incorrecte, liste de 4 habitants est demandé.");
		}
		this.list=l;
	}
	
	
	
	
	
	public String toString() {
		String s="[";
		for (Inhabitant s1 : list) {
			if (list.indexOf(s1)==3) {
				s+=s1.toString()+"]";
				break;
			}
			s+=s1.toString()+",";
		}
		return s;
	}
	
	public List<Inhabitant> getList() {
		return list;
	}

}
