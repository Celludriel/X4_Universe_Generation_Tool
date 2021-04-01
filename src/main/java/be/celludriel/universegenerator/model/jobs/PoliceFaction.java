package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class PoliceFaction extends AbstractJson {

    private String policeFaction;
    private Boolean negatePoliceFaction;

    public PoliceFaction() {
    }

    public PoliceFaction(String policeFaction, Boolean negatePoliceFaction) {
        this.policeFaction = policeFaction;
        this.negatePoliceFaction = negatePoliceFaction;
    }

    public String getPoliceFaction() {
        return policeFaction;
    }

    public Boolean getNegatePoliceFaction() {
        return negatePoliceFaction;
    }

    public void setPoliceFaction(String policeFaction) {
        this.policeFaction = policeFaction;
    }

    public void setNegatePoliceFaction(Boolean negatePoliceFaction) {
        this.negatePoliceFaction = negatePoliceFaction;
    }
}
