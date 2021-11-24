package org.data.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "category", "name", "photoUrls", "tags", "status"})
public class PetDetails {

    private long id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private Tags[] tags;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) { this.category = category; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) { this.photoUrls = photoUrls; }

    public Tags[] getTags() {
        return tags;
    }

    public void setTags(Tags[] tags) { this.tags = tags; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }
}
