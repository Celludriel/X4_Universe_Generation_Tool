package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonLocation extends AbstractJson {

    private JsonSunlight sunlight;
    private String macro;
    private String clazz;
    private String regionBasket;
    private String relation;
    private String comparison;
    private Boolean matchExtension;
    private String faction;
    private String policeFaction;
    private String factionRace;
    private Boolean negateFactionRace;

    public JsonSunlight getSunlight() {
        return sunlight;
    }

    public String getMacro() {
        return macro;
    }

    public String getClazz() {
        return clazz;
    }

    public String getRegionBasket() {
        return regionBasket;
    }

    public String getRelation() {
        return relation;
    }

    public String getComparison() {
        return comparison;
    }

    public Boolean getMatchExtension() {
        return matchExtension;
    }

    public String getFaction() {
        return faction;
    }

    public String getPoliceFaction() {
        return policeFaction;
    }

    public String getFactionRace() {
        return factionRace;
    }

    public Boolean getNegateFactionRace() {
        return negateFactionRace;
    }

    public void setSunlight(JsonSunlight sunlight) {
        this.sunlight = sunlight;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setRegionBasket(String regionBasket) {
        this.regionBasket = regionBasket;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public void setMatchExtension(Boolean matchExtension) {
        this.matchExtension = matchExtension;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setPoliceFaction(String policeFaction) {
        this.policeFaction = policeFaction;
    }

    public void setFactionRace(String factionRace) {
        this.factionRace = factionRace;
    }

    public void setNegateFactionRace(Boolean negateFactionRace) {
        this.negateFactionRace = negateFactionRace;
    }
}
