package v1;

import java.util.*;

public class Noeud implements Arbre {

	private List<Arbre> valeurs = new ArrayList<>();

	public Noeud(List<Arbre> a) {
		this.valeurs = a;
	}
	
	
	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.valeurs.size();
	}
	

	@Override
	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		return this.valeurs().contains(val);
	}

	@Override
	public Integer somme() {
		Integer som = 0;
		Set<Integer> values = this.valeurs();
		for(Integer val : values) {
			som += val;
		}
		return som;
	}

	@Override
	public Integer min() {
 		return Collections.min(this.valeurs());
	}

	@Override
	public Integer max() {
		return Collections.max(this.valeurs());

	}

	@Override
	public boolean estTrie() {
		Set<Integer> valeurs = this.valeurs();
		Iterator<Integer> i = valeurs.iterator();
		while(i.hasNext()) {
			if(i.next() > i.next()) {
				return false;
			}
		}
		return true;
	}


	@Override
	public Set<Integer> valeurs() {
		Set<Integer> valeurs = new HashSet<>();
		for(Arbre v : this.valeurs) {
			valeurs.addAll(v.valeurs());
		}	
		return valeurs;
	}

}
