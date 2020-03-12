package org.sathyatech.com.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sathyatech.com.model.Product;

@Path("/product")
public class ProductResource {

	@GET
	@Path("/get/{prodId}/{prodName}/{prodCost}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Product getProduct(@BeanParam Product p) {
		return p;
	}
	
}
