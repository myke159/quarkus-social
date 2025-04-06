package io.github.myke159.quarkussocial.rest;

import io.github.myke159.quarkussocial.domain.model.User;
import io.github.myke159.quarkussocial.rest.dto.CreateUserRequest;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    @Transactional
    public Response createUser( CreateUserRequest userRequest ){
        User user = new User();
        user.setAge(userRequest.getAge());
        user.setName(userRequest.getName());

        user.persist();



        return Response.ok(user).build();
    }

    @GET
    public Response listaAllUsers() {
        return Response.ok().build();
    }
}
