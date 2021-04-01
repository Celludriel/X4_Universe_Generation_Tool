package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Quota extends AbstractJson {
    private String gamestart;
    private Integer galaxy;
    private Integer maxgalaxy;
    private Integer wing;
    private Integer cluster;
    private Integer sector;
    private Integer zone;
    private String station;
    private Integer variation;

    public String getGamestart() {
        return gamestart;
    }

    public Integer getGalaxy() {
        return galaxy;
    }

    public Integer getMaxgalaxy() {
        return maxgalaxy;
    }

    public Integer getWing() {
        return wing;
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

    public String getStation() {
        return station;
    }

    public Integer getVariation() {
        return variation;
    }

    public void setGamestart(String gamestart) {
        this.gamestart = gamestart;
    }

    public void setGalaxy(Integer galaxy) {
        this.galaxy = galaxy;
    }

    public void setMaxgalaxy(Integer maxgalaxy) {
        this.maxgalaxy = maxgalaxy;
    }

    public void setWing(Integer wing) {
        this.wing = wing;
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

    public void setStation(String station) {
        this.station = station;
    }

    public void setVariation(Integer variation) {
        this.variation = variation;
    }
}
