package org.orion.service.core;

import org.orion.model.core.Post;

import java.util.List;
import java.util.UUID;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 10:26 PM
 */
public interface PostService {


    Post get(UUID id);

    List<Post> list();

    List<Post> list(int start, int count);

    Long size();

    Post save(Post post);

    Post create(Post post);
}
