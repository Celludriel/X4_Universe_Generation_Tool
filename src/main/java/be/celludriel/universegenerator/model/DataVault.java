package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class DataVault {

    private String clusterId;
    private int x;
    private int y;

    public DataVault(String clusterId, int x, int y) {
        this.clusterId = clusterId;
        this.x = x;
        this.y = y;
    }

    public String getClusterId() {
        return clusterId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DataVault dataVault = (DataVault) o;

        return new EqualsBuilder()
                .append(x, dataVault.x)
                .append(y, dataVault.y)
                .append(clusterId, dataVault.clusterId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(clusterId)
                .append(x)
                .append(y)
                .toHashCode();
    }
}
