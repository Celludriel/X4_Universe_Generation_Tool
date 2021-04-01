package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class FactionRace extends AbstractJson {

    private String factionRace;
    private Boolean negateFactionRace;

    public FactionRace() {
    }

    public FactionRace(String factionRace, Boolean negateFactionRace) {
        this.factionRace = factionRace;
        this.negateFactionRace = negateFactionRace;
    }

    public String getFactionRace() {
        return factionRace;
    }

    public Boolean getNegateFactionRace() {
        return negateFactionRace;
    }

    public void setFactionRace(String factionRace) {
        this.factionRace = factionRace;
    }

    public void setNegateFactionRace(Boolean negateFactionRace) {
        this.negateFactionRace = negateFactionRace;
    }
}
