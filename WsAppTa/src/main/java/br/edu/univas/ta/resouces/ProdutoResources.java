package br.edu.univas.ta.resouces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.univas.ta.ctrl.ProdutoCtrl;
import br.edu.univas.ta.model.ProdutoTO;

@Path(value = "/produtos")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class ProdutoResources {
	ProdutoCtrl ctrl = new ProdutoCtrl();

	@GET
	public List<ProdutoTO> obterTodos() {
		return ctrl.obterTodos();
	}

	@GET
	@Path(value = "/{id}")
	public ProdutoTO obterPeloId(@PathParam("id") Long id) {
		return ctrl.obterPeloId(id);
	}

}
