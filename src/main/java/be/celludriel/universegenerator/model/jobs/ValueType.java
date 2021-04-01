package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class ValueType extends AbstractJson {

    private String exact;
    private String list;
    private String min;
    private String max;
    private String profile;
    private Integer scale;
    private String seed;

    public String getExact() {
        return exact;
    }

    public String getList() {
        return list;
    }

    public String getMin() {
        return min;
    }

    public String getMax() {
        return max;
    }

    public String getProfile() {
        return profile;
    }

    public Integer getScale() {
        return scale;
    }

    public String getSeed() {
        return seed;
    }

    public void setExact(String exact) {
        this.exact = exact;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }
}
