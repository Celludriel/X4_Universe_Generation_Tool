package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Position extends AbstractJson {

    private Distance distance;
    private Float x;
    private Float y;
    private Float z;
    private Boolean safepos;
    private Float yaw;
    private Float pitch;
    private Float roll;

    public Distance getDistance() {
        return distance;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public Float getZ() {
        return z;
    }

    public Boolean getSafepos() {
        return safepos;
    }

    public Float getYaw() {
        return yaw;
    }

    public Float getPitch() {
        return pitch;
    }

    public Float getRoll() {
        return roll;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    public void setSafepos(Boolean safepos) {
        this.safepos = safepos;
    }

    public void setYaw(Float yaw) {
        this.yaw = yaw;
    }

    public void setPitch(Float pitch) {
        this.pitch = pitch;
    }

    public void setRoll(Float roll) {
        this.roll = roll;
    }
}
