package org.orion.web.service;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.orion.model.core.Post;
import org.orion.persist.mem.InMemoryPostRepository;
import org.orion.service.core.PostService;
import org.orion.service.mem.InMemoryPostService;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * User: haswell
 * Date: 3/18/14
 * Time: 11:13 PM
 */
@RunWith(Arquillian.class)
public class DefaultPostServiceTest {


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(InMemoryPostRepository.class)
                .addClass(DefaultPostService.class)
                .addClass(InMemoryPostService.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    private PostService service;

    @Test
    public void ensurePostServiceIsInjected() {
        assertNotNull(service);
    }

    @Test
    public void ensureServiceCanSavePost() {
        final Post post = new Post();
        post.setContent("hello");
        assertNull(post.getId());
        final Post saved = service.save(post);
        assertNotNull(saved.getId());
    }

}
