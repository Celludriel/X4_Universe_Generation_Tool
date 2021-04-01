package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class ShipCategory extends AbstractJson {

    private String faction;
    private String tags;
    private String size;
    private Boolean required;
    private String comment;

    public String getFaction() {
        return faction;
    }

    public String getTags() {
        return tags;
    }

    public String getSize() {
        return size;
    }

    public Boolean getRequired() {
        return required;
    }

    public String getComment() {
        return comment;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
