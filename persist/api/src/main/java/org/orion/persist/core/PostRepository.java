package org.orion.persist.core;

import org.orion.model.core.Post;

import java.util.List;
import java.util.UUID;

/**
 * User: haswell
 * Date: 3/16/14
 * Time: 8:22 PM
 */
public interface PostRepository {

    Post get(UUID id);

    List<Post> list();

    List<Post> list(int start, int count);

    Long size();

    Post save(Post post);

    Post create(Post post);
}
