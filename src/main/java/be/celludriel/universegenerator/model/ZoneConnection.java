package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ZoneConnection {

    private final ConnectionType connectionType;
    private final String origin;
    private final String target;
    private final String targetZoneId;
    private final String targetZoneName;
    private final int rotation;
    private final boolean reverseConnection;
    private CustomConnectionParameters parameters;

    public ZoneConnection(ConnectionType connectionType, String origin, String target, String targetZoneId, String targetZoneName, int rotation,
                          boolean reverseConnection) {
        this.connectionType = connectionType;
        this.origin = origin;
        this.target = target;
        this.targetZoneId = targetZoneId;
        this.targetZoneName = targetZoneName;
        this.rotation = rotation;
        this.reverseConnection = reverseConnection;
    }

    public ZoneConnection(ConnectionType connectionType, String origin, String target, String targetZoneId, String targetZoneName, int rotation) {
        this.connectionType = connectionType;
        this.origin = origin;
        this.target = target;
        this.targetZoneId = targetZoneId;
        this.targetZoneName = targetZoneName;
        this.rotation = rotation;
        this.reverseConnection = false;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTarget() {
        return target;
    }

    public String getTargetZoneId() {
        return targetZoneId;
    }

    public String getTargetZoneName() {
        return targetZoneName;
    }

    public int getRotation() {
        return rotation;
    }

    public boolean isReverseConnection() {
        return reverseConnection;
    }

    public CustomConnectionParameters getParameters() {
        return parameters;
    }

    public void setParameters(CustomConnectionParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ZoneConnection that = (ZoneConnection) o;

        return new EqualsBuilder()
                .append(rotation, that.rotation)
                .append(reverseConnection, that.reverseConnection)
                .append(origin, that.origin)
                .append(target, that.target)
                .append(targetZoneId, that.targetZoneId)
                .append(targetZoneName, that.targetZoneName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(origin)
                .append(target)
                .append(targetZoneId)
                .append(targetZoneName)
                .append(rotation)
                .append(reverseConnection)
                .toHashCode();
    }
}