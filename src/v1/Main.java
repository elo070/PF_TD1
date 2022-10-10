package v1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

	Feuille f1 = new Feuille(2);
	Feuille f2 = new Feuille(10);
    final Arbre n1 = new Noeud(List.of(f1,f2));

	Feuille f3 = new Feuille(6);
	Feuille f4 = new Feuille(9);
    
	Arbre a = new Noeud(List.of(n1, f3, f4));
	System.out.println(a.valeurs());
	
	System.out.println(a.estTrie());
	

	
}}
