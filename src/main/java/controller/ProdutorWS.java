package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Produto;

@Path("/produto")
public class ProdutorWS extends ModelWS<Produto> {

	@Override
	@Path("/create")
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void create(Produto entity) {
		super.create(entity);
	}
	
	@Override
	@Path("/find/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Produto find(@PathParam("id") Long id) {
		return super.find(id);
	}

	@Override
	@Path("/findAll")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Produto> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
	@Override
	@Path("/update")
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void update(Produto entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	
	@Override
	@Path("/delete")
	@DELETE
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void delete(Produto entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}
}
