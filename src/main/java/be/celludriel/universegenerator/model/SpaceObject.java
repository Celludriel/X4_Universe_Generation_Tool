package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class SpaceObject extends AbstractJson {
    private SpaceObjectType type;
    private String clusterId;
    private String shipMacro;
    private Integer x;
    private Integer y;
    private Integer z;
    private int yaw;
    private int pitch;
    private int roll;

    public SpaceObjectType getType() {
        return type;
    }

    public String getClusterId() {
        return clusterId;
    }

    public String getShipMacro() {
        return shipMacro;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    public int getYaw() {
        return yaw;
    }

    public int getPitch() {
        return pitch;
    }

    public int getRoll() {
        return roll;
    }

    public void setType(SpaceObjectType type) {
        this.type = type;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public void setShipMacro(String shipMacro) {
        this.shipMacro = shipMacro;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void setYaw(int yaw) {
        this.yaw = yaw;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SpaceObject that = (SpaceObject) o;

        return new EqualsBuilder()
                .append(yaw, that.yaw)
                .append(pitch, that.pitch)
                .append(roll, that.roll)
                .append(type, that.type)
                .append(clusterId, that.clusterId)
                .append(shipMacro, that.shipMacro)
                .append(x, that.x)
                .append(y, that.y)
                .append(z, that.z)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(clusterId)
                .append(shipMacro)
                .append(x)
                .append(y)
                .append(z)
                .append(yaw)
                .append(pitch)
                .append(roll)
                .toHashCode();
    }
}
