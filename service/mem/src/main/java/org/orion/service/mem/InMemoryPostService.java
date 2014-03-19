package org.orion.service.mem;

import org.orion.model.core.Post;
import org.orion.persist.core.PostRepository;
import org.orion.service.core.PostService;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 10:32 PM
 */
public class InMemoryPostService implements PostService {

    @Inject
    private PostRepository repository;


    @Override
    public Post get(UUID id) {
        return repository.get(id);
    }

    @Override
    public List<Post> list() {
        return repository.list();
    }

    @Override
    public List<Post> list(int start, int count) {
        return repository.list(start, count);
    }

    @Override
    public Long size() {
        return repository.size();
    }

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }

    @Override
    public Post create(Post post) {
        return repository.create(post);
    }
}
