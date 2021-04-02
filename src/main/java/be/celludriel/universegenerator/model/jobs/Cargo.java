package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Cargo extends AbstractJson {

    private ValueType fillPercent;
    private Boolean multiple;

    public ValueType getFillPercent() {
        return fillPercent;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setFillPercent(ValueType fillPercent) {
        this.fillPercent = fillPercent;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }
}
