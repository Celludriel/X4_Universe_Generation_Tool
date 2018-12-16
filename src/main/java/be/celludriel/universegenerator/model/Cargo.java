package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Cargo extends AbstractJson {
    private boolean multiple = true;
    private int min = 0;
    private int max = 100;
    private String profile;

    public boolean isMultiple() {
        return multiple;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getProfile() {
        return profile;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Cargo cargo = (Cargo) o;

        return new EqualsBuilder()
                .append(multiple, cargo.multiple)
                .append(min, cargo.min)
                .append(max, cargo.max)
                .append(profile, cargo.profile)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(multiple)
                .append(min)
                .append(max)
                .append(profile)
                .toHashCode();
    }
}
