package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Ship extends AbstractJson {
    private List<String> tags = new ArrayList<>();
    private List<Faction> factions = new ArrayList<>();
    private ShipSize size;
    private String levelMin;
    private String levelMax;
    private boolean overridenpc = true;
    private Cargo cargo;
    private List<Unit> units = new ArrayList<>();

    public List<String> getTags() {
        return tags;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public ShipSize getSize() {
        return size;
    }

    public String getLevelMin() {
        return levelMin;
    }

    public String getLevelMax() {
        return levelMax;
    }

    public boolean isOverridenpc() {
        return overridenpc;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    public void setSize(ShipSize size) {
        this.size = size;
    }

    public void setLevelMin(String levelMin) {
        this.levelMin = levelMin;
    }

    public void setLevelMax(String levelMax) {
        this.levelMax = levelMax;
    }

    public void setOverridenpc(boolean overridenpc) {
        this.overridenpc = overridenpc;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @JsonIgnore
    public String getTagPrint(){
        List<String> stringValues = new ArrayList<>();
        for (String tag : tags) {
            stringValues.add(tag);
        }
        return StringUtils.join(stringValues, ",");
    }

    @JsonIgnore
    public String getFactionPrint(){
        if(factions.size() == 1){
            return factions.get(0).getName();
        }

        List<String> stringValues = new ArrayList<>();
        for (Faction faction : factions) {
            stringValues.add(faction.getName());
        }
        return "[" + StringUtils.join(stringValues, ",") + "]";
    }

    @JsonIgnore
    public String getOwner(){
        if(factions.size() == 0){
            throw new RuntimeException("There has to be at least one faction defined");
        }

        return factions.get(0).getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Ship ship = (Ship) o;

        return new EqualsBuilder()
                .append(overridenpc, ship.overridenpc)
                .append(tags, ship.tags)
                .append(factions, ship.factions)
                .append(size, ship.size)
                .append(levelMin, ship.levelMin)
                .append(levelMax, ship.levelMax)
                .append(cargo, ship.cargo)
                .append(units, ship.units)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(tags)
                .append(factions)
                .append(size)
                .append(levelMin)
                .append(levelMax)
                .append(overridenpc)
                .append(cargo)
                .append(units)
                .toHashCode();
    }
}
