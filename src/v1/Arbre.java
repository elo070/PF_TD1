package v1;

import java.util.*;

public interface Arbre {
	int taille(); // nombre de valeurs
	boolean contient(final Integer val); // vrai si val est contenue dans l'arbre, faux sinoSet<Integer> valeurs(); // ensemble des valeurs différentes dans l'arbre
	Set<Integer> valeurs(); // ensemble des valeurs différentes dans l'arbre
	Integer somme(); // somme des valeurs
	Integer min(); // valeur minimale
	Integer max(); // valeur maximale
	boolean estTrie(); // vrai si l'arbre est trié, faux sinon
}
