package br.edu.univas.ta.dao;

import javax.persistence.EntityManager;

import br.edu.univas.ta.model.ProdutoTO;

public class ProdutoDAO extends GenericDAO<ProdutoTO, Long> {

	public ProdutoDAO(EntityManager em) {
		super(em);
	}
	

}
