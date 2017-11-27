package br.edu.univas.si8.ta.hello.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shopping")
public interface ShoppingService {
	@GET
	@Path("/order/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listVendasDescription();

	@POST
	@Path("order/add/{description}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewVenda(@PathParam("description") String description);
}
