package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Faction extends AbstractJson {

    private String faction;
    private Boolean negateFaction;

    public Faction() {
    }

    public Faction(String faction, Boolean negateFaction) {
        this.faction = faction;
        this.negateFaction = negateFaction;
    }

    public String getFaction() {
        return faction;
    }

    public Boolean getNegateFaction() {
        return negateFaction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setNegateFaction(Boolean negateFaction) {
        this.negateFaction = negateFaction;
    }
}
