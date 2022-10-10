package v1;

import java.util.*;
public class Feuille implements Arbre{

	private List<Integer> valeur = new ArrayList<Integer>();
	
	public Feuille(Integer n) {
		this.valeur.add(n);
	}
	
	
	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean contient(Integer val) {
		// TODO Auto-generated method stub
		return this.valeur.contains(val);
	}

	@Override
	public Integer somme() {
		// TODO Auto-generated method stub
		return this.valeur.get(0);
	}

	@Override
	public Integer min() {
		// TODO Auto-generated method stub
		return this.valeur.get(0);
	}

	@Override
	public Integer max() {
		// TODO Auto-generated method stub
		return this.valeur.get(0);
	}

	@Override
	public boolean estTrie() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public Set<Integer> valeurs() {
		Set<Integer> valeurs = new HashSet<>();
		valeurs.add(this.valeur.get(0));
		return valeurs;
	}

}
