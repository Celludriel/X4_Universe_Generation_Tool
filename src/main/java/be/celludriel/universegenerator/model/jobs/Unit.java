package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Unit extends AbstractJson {

    private String category;
    private String mk;
    private String tags;
    private ValueType value;

    public String getCategory() {
        return category;
    }

    public String getMk() {
        return mk;
    }

    public String getTags() {
        return tags;
    }

    public ValueType getValue() {
        return value;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
