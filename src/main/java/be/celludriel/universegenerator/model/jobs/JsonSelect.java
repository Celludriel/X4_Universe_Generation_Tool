package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonSelect extends AbstractJson {

    private String faction;
    private String size;
    private String tags;

    public JsonSelect() {
    }

    public JsonSelect(String faction, String size, String tags) {
        this.faction = faction;
        this.size = size;
        this.tags = tags;
    }

    public String getFaction() {
        return faction;
    }

    public String getSize() {
        return size;
    }

    public String getTags() {
        return tags;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
