package org.orion.model.core;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.UUID;

/**
 * User: haswell
 * Date: 3/16/14
 * Time: 8:20 PM
 */
@XmlRootElement
public class Post {

    @XmlAttribute
    private UUID id;
    @XmlAttribute
    private Date date;
    @XmlElement
    private String content;

    public Post() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
