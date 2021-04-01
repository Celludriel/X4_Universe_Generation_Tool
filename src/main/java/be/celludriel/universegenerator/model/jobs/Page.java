package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Page extends AbstractJson {

    private String tags;
    private String comment;
    private ValueType value;

    public String getTags() {
        return tags;
    }

    public String getComment() {
        return comment;
    }

    public ValueType getValue() {
        return value;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
