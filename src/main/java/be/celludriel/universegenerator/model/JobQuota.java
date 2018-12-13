package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class JobQuota extends AbstractJson {
    private Integer galaxy;
    private Integer maxGalaxy;
    private Integer cluster;
    private Integer sector;
    private Integer zone;
    private Integer wing;
    private Integer variation;
    private Integer station;

    public Integer getGalaxy() {
        return galaxy;
    }

    public Integer getMaxGalaxy() {
        return maxGalaxy;
    }

    public Integer getCluster() {
        return cluster;
    }

    public Integer getSector() {
        return sector;
    }

    public Integer getZone() {
        return zone;
    }

    public Integer getWing() {
        return wing;
    }

    public Integer getVariation() {
        return variation;
    }

    public Integer getStation() {
        return station;
    }

    public void setGalaxy(Integer galaxy) {
        this.galaxy = galaxy;
    }

    public void setMaxGalaxy(Integer maxGalaxy) {
        this.maxGalaxy = maxGalaxy;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public void setWing(Integer wing) {
        this.wing = wing;
    }

    public void setVariation(Integer variation) {
        this.variation = variation;
    }

    public void setStation(Integer station) {
        this.station = station;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        JobQuota jobQuota = (JobQuota) o;

        return new EqualsBuilder()
                .append(galaxy, jobQuota.galaxy)
                .append(maxGalaxy, jobQuota.maxGalaxy)
                .append(cluster, jobQuota.cluster)
                .append(sector, jobQuota.sector)
                .append(zone, jobQuota.zone)
                .append(wing, jobQuota.wing)
                .append(variation, jobQuota.variation)
                .append(station, jobQuota.station)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(galaxy)
                .append(maxGalaxy)
                .append(cluster)
                .append(sector)
                .append(zone)
                .append(wing)
                .append(variation)
                .append(station)
                .toHashCode();
    }
}
