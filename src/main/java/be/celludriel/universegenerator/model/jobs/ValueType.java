package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class ValueType extends AbstractJson {

    private String min;
    private String max;
    private String profile;

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
