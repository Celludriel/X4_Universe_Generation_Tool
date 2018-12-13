package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Belt extends AbstractJson {

    private BeltType type;
    private Long x;
    private Long y;
    private Integer rotation;

    public BeltType getType() {
        return type;
    }

    public Long getX() {
        return x;
    }

    public Long getY() {
        return y;
    }

    public Integer getRotation() {
        return rotation;
    }

    public void setType(BeltType type) {
        this.type = type;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public void setY(Long y) {
        this.y = y;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Belt belt = (Belt) o;

        return new EqualsBuilder()
                .append(x, belt.x)
                .append(y, belt.y)
                .append(rotation, belt.rotation)
                .append(type, belt.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(x)
                .append(y)
                .append(rotation)
                .toHashCode();
    }
}
