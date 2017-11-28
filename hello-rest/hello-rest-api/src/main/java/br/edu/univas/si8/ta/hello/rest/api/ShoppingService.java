package br.edu.univas.si8.ta.hello.rest.api;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shopping")
public interface ShoppingService {
	@GET
	@Path("/order/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listVendasDescription();

	@POST
	@Path("order/add/")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewVenda(@FormParam("description") String description);
}
