package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonExpirationTime extends AbstractJson {

    private Integer min;
    private Integer max;

    public JsonExpirationTime() {
    }

    public JsonExpirationTime(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
