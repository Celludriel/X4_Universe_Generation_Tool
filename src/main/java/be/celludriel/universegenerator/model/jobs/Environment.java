package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Environment extends AbstractJson {

    private Boolean zone;
    private Boolean gate;
    private Boolean buildatshipyard;
    private Boolean spawninsector;
    private Boolean spwanoutofsector;
    private Integer chancedocked;

    public Boolean getZone() {
        return zone;
    }

    public Boolean getGate() {
        return gate;
    }

    public Boolean getBuildatshipyard() {
        return buildatshipyard;
    }

    public Boolean getSpawninsector() {
        return spawninsector;
    }

    public Boolean getSpwanoutofsector() {
        return spwanoutofsector;
    }

    public Integer getChancedocked() {
        return chancedocked;
    }

    public void setZone(Boolean zone) {
        this.zone = zone;
    }

    public void setGate(Boolean gate) {
        this.gate = gate;
    }

    public void setBuildatshipyard(Boolean buildatshipyard) {
        this.buildatshipyard = buildatshipyard;
    }

    public void setSpawninsector(Boolean spawninsector) {
        this.spawninsector = spawninsector;
    }

    public void setSpwanoutofsector(Boolean spwanoutofsector) {
        this.spwanoutofsector = spwanoutofsector;
    }

    public void setChancedocked(Integer chancedocked) {
        this.chancedocked = chancedocked;
    }
}
