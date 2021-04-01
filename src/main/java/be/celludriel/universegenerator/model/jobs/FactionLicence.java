package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class FactionLicence extends AbstractJson {

    private String faction;
    private String licence;
    private Boolean negateFactionLicence;

    public FactionLicence() {
    }

    public FactionLicence(String faction, String licence, Boolean negateFactionLicence) {
        this.faction = faction;
        this.licence = licence;
        this.negateFactionLicence = negateFactionLicence;
    }

    public String getFaction() {
        return faction;
    }

    public String getLicence() {
        return licence;
    }

    public Boolean getNegateFactionLicence() {
        return negateFactionLicence;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public void setNegateFactionLicence(Boolean negateFactionLicence) {
        this.negateFactionLicence = negateFactionLicence;
    }
}
