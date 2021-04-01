package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Economy extends AbstractJson {

    private Float min;
    private Float max;

    public Economy() {
    }

    public Economy(Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    public Float getMin() {
        return min;
    }

    public Float getMax() {
        return max;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public void setMax(Float max) {
        this.max = max;
    }
}
