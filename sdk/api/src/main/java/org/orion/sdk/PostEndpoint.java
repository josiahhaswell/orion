package org.orion.sdk;

import org.orion.model.core.Post;

import javax.ws.rs.*;
import java.util.List;
import java.util.UUID;

import static javax.ws.rs.core.MediaType.*;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 10:40 PM
 */
@Produces ({
    APPLICATION_XML,
    APPLICATION_JSON
})
@Path("post")
public interface PostEndpoint {

    @GET
    Post get(UUID id);

    @GET
    @Path("list")
    List<Post> list();

    @GET
    @Path("list")
    List<Post> list(
        @QueryParam("start") int start,
        @QueryParam("count") int count);

    @GET
    @Path("count")
    Long size();

    @PUT
    Post save(Post post);

    @POST
    Post create(Post post);
}
