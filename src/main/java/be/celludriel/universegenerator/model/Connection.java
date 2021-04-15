package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Connection extends AbstractJson {

    private String targetClusterId;
    private ConnectionType connectionType;
    private CustomConnectionParameters parameters;
    private GateType gateType = GateType.ANCIENT_GATE;

    public String getTargetClusterId() {
        return targetClusterId;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public CustomConnectionParameters getParameters() {
        return parameters;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public void setParameters(CustomConnectionParameters parameters) {
        this.parameters = parameters;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Connection that = (Connection) o;

        return new EqualsBuilder()
                .append(targetClusterId, that.targetClusterId)
                .append(connectionType, that.connectionType)
                .append(parameters, that.parameters)
                .append(gateType, that.gateType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(targetClusterId)
                .append(connectionType)
                .append(parameters)
                .append(gateType)
                .toHashCode();
    }
}
