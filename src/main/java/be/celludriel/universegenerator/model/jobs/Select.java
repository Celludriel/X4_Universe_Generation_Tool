package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Select extends AbstractJson {

    private Integer weight;
    private String comment;
    private ValueType value;

    public Integer getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }

    public ValueType getValue() {
        return value;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
