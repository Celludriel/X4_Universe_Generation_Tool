package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonModifiers extends AbstractJson {

    private Boolean commandeerable;
    private Boolean rebuild;
    private Boolean subordinate;

    public Boolean getCommandeerable() {
        return commandeerable;
    }

    public Boolean getRebuild() {
        return rebuild;
    }

    public Boolean getSubordinate() {
        return subordinate;
    }

    public void setCommandeerable(Boolean commandeerable) {
        this.commandeerable = commandeerable;
    }

    public void setRebuild(Boolean rebuild) {
        this.rebuild = rebuild;
    }

    public void setSubordinate(Boolean subordinate) {
        this.subordinate = subordinate;
    }
}
