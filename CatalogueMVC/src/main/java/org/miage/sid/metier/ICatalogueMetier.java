package org.miage.sid.metier;

import java.util.List;

import org.miage.sid.dao.Produit;

public interface ICatalogueMetier {
	
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitParMC(String mc);
	public Produit getProduit(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);

}
