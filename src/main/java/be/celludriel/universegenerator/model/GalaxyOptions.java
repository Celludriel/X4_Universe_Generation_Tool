package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class GalaxyOptions extends AbstractJson {

    private boolean addDoubleTravelSpeed;

    public boolean isAddDoubleTravelSpeed() {
        return addDoubleTravelSpeed;
    }

    public void setAddDoubleTravelSpeed(boolean addDoubleTravelSpeed) {
        this.addDoubleTravelSpeed = addDoubleTravelSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        GalaxyOptions that = (GalaxyOptions) o;

        return new EqualsBuilder()
                .append(addDoubleTravelSpeed, that.addDoubleTravelSpeed)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(addDoubleTravelSpeed)
                .toHashCode();
    }
}
