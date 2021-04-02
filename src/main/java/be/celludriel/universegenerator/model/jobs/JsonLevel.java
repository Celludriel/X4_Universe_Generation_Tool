package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonLevel extends AbstractJson {

    private Double exact;
    private Double max;
    private Double min;

    public JsonLevel() {
    }

    public JsonLevel(Double exact, Double max, Double min) {
        this.exact = exact;
        this.max = max;
        this.min = min;
    }

    public Double getExact() {
        return exact;
    }

    public Double getMax() {
        return max;
    }

    public Double getMin() {
        return min;
    }

    public void setExact(Double exact) {
        this.exact = exact;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public void setMin(Double min) {
        this.min = min;
    }
}
