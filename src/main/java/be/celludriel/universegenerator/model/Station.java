package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Station extends AbstractJson {

    private StationType type;
    private Race race;
    private Faction owner;
    private Faction faction;

    public StationType getType() {
        return type;
    }

    public Race getRace() {
        return race;
    }

    public Faction getOwner() {
        return owner;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setType(StationType type) {
        this.type = type;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setOwner(Faction owner) {
        this.owner = owner;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        return new EqualsBuilder()
                .append(type, station.type)
                .append(race, station.race)
                .append(owner, station.owner)
                .append(faction, station.faction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(type)
                .append(race)
                .append(owner)
                .append(faction)
                .toHashCode();
    }
}