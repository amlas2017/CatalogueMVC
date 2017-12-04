package org.miage.sid.metier;

import java.util.List;

import org.miage.sid.dao.ICatalogueDAO;
import org.miage.sid.dao.Produit;

public class CatalogueMetierImpl implements ICatalogueMetier {
	
	private ICatalogueDAO dao;
	
    // Pour l'injection des dépendances 
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);		
	}

	@Override
	public List<Produit> getAllProduits() {
		return dao.getAllProduits();
	}

	@Override
	public List<Produit> getProduitParMC(String mc) {		
		return dao.getProduitParMC(mc);
	}

	@Override
	public Produit getProduit(String ref) {
		return dao.getProduit(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);		
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);		
	}

}
