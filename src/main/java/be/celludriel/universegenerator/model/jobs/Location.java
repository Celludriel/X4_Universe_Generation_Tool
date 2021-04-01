package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class Location extends AbstractJson {

    private Economy economy;
    private Security security;
    private Sunlight sunlight;
    private List<Faction> factions = new ArrayList<>();
    private List<PoliceFaction> policeFactions = new ArrayList<>();
    private List<FactionRace> factionRaces = new ArrayList<>();
    private List<FactionLicence> factionLicences = new ArrayList<>();
    private String macro;
    private String clazz;
    private String regionBasket;
    private String relation;
    private String comparison;
    private Boolean matchExtension;

    public Economy getEconomy() {
        return economy;
    }

    public Security getSecurity() {
        return security;
    }

    public Sunlight getSunlight() {
        return sunlight;
    }

    public List<Faction> getFactions() {
        return factions;
    }

    public List<PoliceFaction> getPoliceFactions() {
        return policeFactions;
    }

    public List<FactionRace> getFactionRaces() {
        return factionRaces;
    }

    public List<FactionLicence> getFactionLicences() {
        return factionLicences;
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

    public void setEconomy(Economy economy) {
        this.economy = economy;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public void setSunlight(Sunlight sunlight) {
        this.sunlight = sunlight;
    }

    public void setFactions(List<Faction> factions) {
        this.factions = factions;
    }

    public void setPoliceFactions(List<PoliceFaction> policeFactions) {
        this.policeFactions = policeFactions;
    }

    public void setFactionRaces(List<FactionRace> factionRaces) {
        this.factionRaces = factionRaces;
    }

    public void setFactionLicences(List<FactionLicence> factionLicences) {
        this.factionLicences = factionLicences;
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
}
