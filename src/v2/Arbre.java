package v2;

import java.util.*;

public interface Arbre {
	int taille();
	boolean contient(final Integer val);
	Set<Integer> valeurs();
}
