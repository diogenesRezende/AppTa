package br.edu.univas.ta.resouces;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import br.edu.univas.ta.model.ProdutoTO;
import br.edu.univas.ta.util.JpaUtil;

@Path(value = "cria")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class TesteResource {

	@Path(value = "cria")
	@GET
	public Status cria() {
		try {
			EntityManager em = JpaUtil.getEntityManager();

			for (int i = 0; i < 10; i++) {
				ProdutoTO to = new ProdutoTO();
				to.setQtdeEstoque((int) (Math.random() * i));
				em.getTransaction().begin();
				em.persist(to);
				em.getTransaction().commit();
			}
			return Status.CREATED;
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(500);
		}
	}

}
