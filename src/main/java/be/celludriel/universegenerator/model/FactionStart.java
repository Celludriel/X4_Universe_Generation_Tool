package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FactionStart extends AbstractJson {

    private String clusterId;
    private Faction faction;
    private String name;
    private String description;
    private String playerName;

    public String getClusterId() {
        return clusterId;
    }

    public Faction getFaction() {
        return faction;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FactionStart that = (FactionStart) o;

        return new EqualsBuilder()
                .append(clusterId, that.clusterId)
                .append(faction, that.faction)
                .append(name, that.name)
                .append(description, that.description)
                .append(playerName, that.playerName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(clusterId)
                .append(faction)
                .append(name)
                .append(description)
                .append(playerName)
                .toHashCode();
    }
}
