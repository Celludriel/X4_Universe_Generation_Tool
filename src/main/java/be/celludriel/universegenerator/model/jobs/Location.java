package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;

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

    //Utility

    @JsonIgnore
    public String getPrintFactions(){
        if(factions.size() == 1){
            return factions.get(0).getFaction();
        }

        List<String> stringValues = new ArrayList<>();
        for (Faction faction : factions) {
            stringValues.add(faction.getFaction());
        }
        return "[" + StringUtils.join(stringValues, ",") + "]";
    }

    @JsonIgnore
    public boolean isNegateFaction() {
        for (Faction faction : factions) {
            if(faction.getNegateFaction() != null && faction.getNegateFaction().booleanValue()){
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public String getPrintPoliceFactions(){
        if(policeFactions.size() == 1){
            return policeFactions.get(0).getPoliceFaction();
        }

        List<String> stringValues = new ArrayList<>();
        for (PoliceFaction faction : policeFactions) {
            stringValues.add(faction.getPoliceFaction());
        }
        return "[" + StringUtils.join(stringValues, ",") + "]";
    }

    @JsonIgnore
    public boolean isNegatePoliceFaction() {
        for (PoliceFaction faction : policeFactions) {
            if(faction.getNegatePoliceFaction() != null && faction.getNegatePoliceFaction().booleanValue()){
                return true;
            }
        }
        return false;
    }

    @JsonIgnore
    public String getPrintFactionRaces(){
        if(factionRaces.size() == 1){
            return factionRaces.get(0).getFactionRace();
        }

        List<String> stringValues = new ArrayList<>();
        for (FactionRace faction : factionRaces) {
            stringValues.add(faction.getFactionRace());
        }
        return "[" + StringUtils.join(stringValues, ",") + "]";
    }

    @JsonIgnore
    public boolean isNegateFactionRace() {
        for (FactionRace faction : factionRaces) {
            if(faction.getNegateFactionRace() != null && faction.getNegateFactionRace().booleanValue()){
                return true;
            }
        }
        return false;
    }
}
