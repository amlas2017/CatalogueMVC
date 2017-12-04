package org.miage.sid.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class CatalogueDaoImpl implements ICatalogueDAO{
	
	private Map<String, Produit> produits = new HashMap<String, Produit>();
    Logger logger = Logger.getLogger(CatalogueDaoImpl.class);
    
	@Override
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> getAllProduits() {
		Collection<Produit> prods = produits.values();
		return new ArrayList<Produit>(prods);
	}

	@Override
	public List<Produit> getProduitParMC(String mc) {
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p : produits.values())
			if (p.getDesignation().indexOf(mc) >= 0)
				prods.add(p);
		return prods;
	}

	@Override
	public Produit getProduit(String ref) {
		return produits.get(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		produits.remove(ref);
		
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
	}
	
	public void init(){
		logger.info("Initialisation du catalogue........");
		addProduit(new Produit("HP654", "PC HP654", 8000, 12));
		addProduit(new Produit("AEA", "IMPRIMANTE 543", 6000, 15));
		addProduit(new Produit("AIE321", "SMARTPHONE", 10000, 120));
	}

}
