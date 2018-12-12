package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Connection extends AbstractJson {

    private String targetClusterId;
    private ConnectionType ConnectionType;

    public String getTargetClusterId() {
        return targetClusterId;
    }

    public ConnectionType getConnectionType() {
        return ConnectionType;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    public void setConnectionType(ConnectionType connectionType) {
        ConnectionType = connectionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Connection that = (Connection) o;

        return new EqualsBuilder()
                .append(targetClusterId, that.targetClusterId)
                .append(ConnectionType, that.ConnectionType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(targetClusterId)
                .append(ConnectionType)
                .toHashCode();
    }
}
