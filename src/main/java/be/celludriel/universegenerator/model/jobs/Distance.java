package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Distance extends AbstractJson {

    private Float exact;
    private Float min;
    private Float max;

    public Distance() {
    }

    public Distance(Float exact, Float min, Float max) {
        this.exact = exact;
        this.min = min;
        this.max = max;
    }

    public Float getExact() {
        return exact;
    }

    public Float getMin() {
        return min;
    }

    public Float getMax() {
        return max;
    }

    public void setExact(Float exact) {
        this.exact = exact;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public void setMax(Float max) {
        this.max = max;
    }
}
