package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonValueType extends AbstractJson {

    private String min;
    private String max;
    private String profile;

    public JsonValueType() {
    }

    public JsonValueType(String min, String max, String profile) {
        this.min = min;
        this.max = max;
        this.profile = profile;
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

    public void setMin(String min) {
        this.min = min;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
