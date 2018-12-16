package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductLocation extends AbstractJson {

    private List<Faction> spawnLocations = new ArrayList<>();
    private List<String> wares = new ArrayList<>();
    private String economyMax = null;
    private boolean maxBound = false;
    private String sunlightMin = null;
    private String sunlightMax = null;
    private String securityMin = null;
    private boolean solitary = false;

    public List<Faction> getSpawnLocations() {
        return spawnLocations;
    }

    public List<String> getWares() {
        return wares;
    }

    public String getEconomyMax() {
        return economyMax;
    }

    public boolean isMaxBound() {
        return maxBound;
    }

    public String getSunlightMin() {
        return sunlightMin;
    }

    public String getSunlightMax() {
        return sunlightMax;
    }

    public String getSecurityMin() {
        return securityMin;
    }

    public boolean isSolitary() {
        return solitary;
    }

    public void setSpawnLocations(List<Faction> spawnLocations) {
        this.spawnLocations = spawnLocations;
    }

    public void setWares(List<String> wares) {
        this.wares = wares;
    }

    public void setEconomyMax(String economyMax) {
        this.economyMax = economyMax;
    }

    public void setMaxBound(boolean maxBound) {
        this.maxBound = maxBound;
    }

    public void setSunlightMin(String sunlightMin) {
        this.sunlightMin = sunlightMin;
    }

    public void setSunlightMax(String sunlightMax) {
        this.sunlightMax = sunlightMax;
    }

    public void setSecurityMin(String securityMin) {
        this.securityMin = securityMin;
    }

    public void setSolitary(boolean solitary) {
        this.solitary = solitary;
    }

    @JsonIgnore
    public String getFactionPrint(){
        List<String> stringValues = new ArrayList<>();
        for (Faction spawnLocation : spawnLocations) {
            stringValues.add(spawnLocation.getName());
        }
        return StringUtils.join(stringValues, ",");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ProductLocation that = (ProductLocation) o;

        return new EqualsBuilder()
                .append(maxBound, that.maxBound)
                .append(solitary, that.solitary)
                .append(spawnLocations, that.spawnLocations)
                .append(wares, that.wares)
                .append(economyMax, that.economyMax)
                .append(sunlightMin, that.sunlightMin)
                .append(sunlightMax, that.sunlightMax)
                .append(securityMin, that.securityMin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(spawnLocations)
                .append(wares)
                .append(economyMax)
                .append(maxBound)
                .append(sunlightMin)
                .append(sunlightMax)
                .append(securityMin)
                .append(solitary)
                .toHashCode();
    }
}
