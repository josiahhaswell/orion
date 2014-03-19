package org.orion.persist.mem;

import org.orion.model.core.Post;
import org.orion.persist.core.PostRepository;

import java.util.*;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 9:53 PM
 */
public class InMemoryPostRepository implements PostRepository {

    private static final Map<UUID, Post> posts;

    static {
        posts = new LinkedHashMap<UUID, Post>();
    }
    @Override
    public Post get(UUID id) {
        final Post post = posts.get(id);
        if(post == null) {
            throw new NoSuchElementException("Couldn't find that post!");
        }
        return post;
    }

    @Override
    public List<Post> list() {
        return new ArrayList<Post>(posts.values());
    }

    @Override
    public List<Post> list(int start, int count) {
        final int last = start + count;
        final List<Post> allPosts = list();
        if(last < allPosts.size()) {
            return allPosts.subList(start, last);
        }
        return allPosts.subList(start, allPosts.size() - 1);
    }

    @Override
    public Long size() {
        return new Long(posts.size());
    }

    @Override
    public Post save(Post post) {
        post.setId(UUID.randomUUID());
        posts.put(post.getId(), post);
        return post;
    }

    @Override
    public Post create(Post post) {
        return save(post);
    }
}
