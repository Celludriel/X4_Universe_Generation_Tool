package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonCargo extends AbstractJson {

    private JsonValueType fillPercent;
    private Boolean multiple;

    public JsonValueType getFillPercent() {
        return fillPercent;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public void setFillPercent(JsonValueType fillPercent) {
        this.fillPercent = fillPercent;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }
}
