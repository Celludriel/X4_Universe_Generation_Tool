package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class JobCategory extends AbstractJson {
    private Faction faction;
    private List<String> tags;
    private ShipSize shipSize;

    public Faction getFaction() {
        return faction;
    }

    public List<String> getTags() {
        return tags;
    }

    public ShipSize getShipSize() {
        return shipSize;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setShipSize(ShipSize shipSize) {
        this.shipSize = shipSize;
    }

    @JsonIgnore
    public String getTagsPrint(){
        List<String> stringValues = new ArrayList<>();
        for (String tag : tags) {
            stringValues.add(tag);
        }
        return StringUtils.join(stringValues, ",");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        JobCategory that = (JobCategory) o;

        return new EqualsBuilder()
                .append(faction, that.faction)
                .append(tags, that.tags)
                .append(shipSize, that.shipSize)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(faction)
                .append(tags)
                .append(shipSize)
                .toHashCode();
    }
}
