package br.edu.univas.ta.ctrl;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.univas.ta.dao.ProdutoDAO;
import br.edu.univas.ta.model.ProdutoTO;
import br.edu.univas.ta.util.JpaUtil;

public class ProdutoCtrl {

	EntityManager em = JpaUtil.getEntityManager();

	public List<ProdutoTO> obterTodos() {
		return new ProdutoDAO(em).obterTodos();
	}

	public ProdutoTO obterPeloId(Long id) {
		return new ProdutoDAO(em).obterPeloId(id);
	}
}
