package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Unit extends AbstractJson {
    private String category;
    private int min;
    private int max;

    public String getCategory() {
        return category;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Unit unit = (Unit) o;

        return new EqualsBuilder()
                .append(min, unit.min)
                .append(max, unit.max)
                .append(category, unit.category)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(category)
                .append(min)
                .append(max)
                .toHashCode();
    }
}
