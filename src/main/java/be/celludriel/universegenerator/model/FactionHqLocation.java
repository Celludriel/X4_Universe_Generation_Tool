package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FactionHqLocation {

    public Faction faction;
    public String clusterId;

    public FactionHqLocation(Faction faction, String clusterId) {
        this.faction = faction;
        this.clusterId = clusterId;
    }

    public Faction getFaction() {
        return faction;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FactionHqLocation that = (FactionHqLocation) o;

        return new EqualsBuilder()
                .append(faction, that.faction)
                .append(clusterId, that.clusterId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(faction)
                .append(clusterId)
                .toHashCode();
    }
}
