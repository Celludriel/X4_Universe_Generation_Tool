package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Skill extends AbstractJson {

    private String type;
    private String comment;
    private ValueType value;

    public String getType() {
        return type;
    }

    public String getComment() {
        return comment;
    }

    public ValueType getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
