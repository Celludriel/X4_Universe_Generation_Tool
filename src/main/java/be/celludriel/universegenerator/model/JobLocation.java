package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class JobLocation extends AbstractJson {

    private String locationClass = "galaxy";
    private String comparison;
    private String relation;
    private String macro;
    private String regionBasket;
    private List<Faction> factions = new ArrayList<>();

    public String getLocationClass() {
        return locationClass;
    }

    public String getComparison() {
        return comparison;
    }

    public String getRelation() {
        return relation;
    }

    public String getMacro() {
        return macro;
    }

    public String getRegionBasket() {
        return regionBasket;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public void setLocationClass(String locationClass) {
        this.locationClass = locationClass;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setRegionBasket(String regionBasket) {
        this.regionBasket = regionBasket;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    @JsonIgnore
    public String getPrintFactions(){
        if(factions.size() == 1){
            return factions.get(0).getName();
        }

        List<String> stringValues = new ArrayList<>();
        for (Faction faction : factions) {
            stringValues.add(faction.getName());
        }
        return "[" + StringUtils.join(stringValues, ",") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        JobLocation that = (JobLocation) o;

        return new EqualsBuilder()
                .append(locationClass, that.locationClass)
                .append(comparison, that.comparison)
                .append(relation, that.relation)
                .append(macro, that.macro)
                .append(regionBasket, that.regionBasket)
                .append(factions, that.factions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(locationClass)
                .append(comparison)
                .append(relation)
                .append(macro)
                .append(regionBasket)
                .append(factions)
                .toHashCode();
    }
}
