package org.orion.web.service;

import org.orion.model.core.Post;
import org.orion.sdk.PostEndpoint;
import org.orion.service.core.PostService;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 11:05 PM
 */

public class DefaultPostService implements PostEndpoint {
    @Inject
    private PostService service;


    @Override
    public Post get(UUID id) {
        return service.get(id);
    }

    @Override
    public List<Post> list() {
        return service.list();
    }

    @Override
    public List<Post> list(int start, int count) {
        return service.list(start, count);
    }

    @Override
    public Long size() {
        return service.size();
    }

    @Override
    public Post save(Post post) {
        return service.save(post);
    }

    @Override
    public Post create(Post post) {
        return service.create(post);
    }
}
