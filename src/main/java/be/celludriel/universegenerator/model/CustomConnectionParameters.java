package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CustomConnectionParameters extends AbstractJson {

    private int startRotation;
    private int startPositionX;
    private int startPositionY;
    private int endRotation;
    private int endPositionX;
    private int endPositionY;

    public int getStartRotation() {
        return startRotation;
    }

    public int getStartPositionX() {
        return startPositionX;
    }

    public int getStartPositionY() {
        return startPositionY;
    }

    public int getEndRotation() {
        return endRotation;
    }

    public int getEndPositionX() {
        return endPositionX;
    }

    public int getEndPositionY() {
        return endPositionY;
    }

    public void setStartRotation(int startRotation) {
        this.startRotation = startRotation;
    }

    public void setStartPositionX(int startPositionX) {
        this.startPositionX = startPositionX;
    }

    public void setStartPositionY(int startPositionY) {
        this.startPositionY = startPositionY;
    }

    public void setEndRotation(int endRotation) {
        this.endRotation = endRotation;
    }

    public void setEndPositionX(int endPositionX) {
        this.endPositionX = endPositionX;
    }

    public void setEndPositionY(int endPositionY) {
        this.endPositionY = endPositionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        CustomConnectionParameters that = (CustomConnectionParameters) o;

        return new EqualsBuilder()
                .append(startRotation, that.startRotation)
                .append(startPositionX, that.startPositionX)
                .append(startPositionY, that.startPositionY)
                .append(endRotation, that.endRotation)
                .append(endPositionX, that.endPositionX)
                .append(endPositionY, that.endPositionY)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(startRotation)
                .append(startPositionX)
                .append(startPositionY)
                .append(endRotation)
                .append(endPositionX)
                .append(endPositionY)
                .toHashCode();
    }
}
