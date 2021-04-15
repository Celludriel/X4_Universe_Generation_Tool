package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonUnit extends AbstractJson {

    private String category;
    private Integer max;
    private Integer min;

    public JsonUnit() {
    }

    public JsonUnit(String category, Integer max, Integer min) {
        this.category = category;
        this.max = max;
        this.min = min;
    }

    public String getCategory() {
        return category;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public void setMin(Integer min) {
        this.min = min;
    }
}
