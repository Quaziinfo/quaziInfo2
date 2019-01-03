package info.quazi.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import com.oreon.kg.domain.users.User;

import info.quazi.rest.entity.UserEntity;

@Path("/portal")
@Scope(ScopeType.APPLICATION)
@Name("loginService")
public class LoginService {

	@POST
	@Path("/login")
	@Consumes("application/json")
	public Response login(UserEntity user) {

	    String output = user.toString();

	    return Response.status(200).entity(output).build();

	}
}
