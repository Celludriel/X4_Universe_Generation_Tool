package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Modifiers extends AbstractJson {

    private Boolean commandeerable;
    private Boolean invincible;
    private Boolean rebuild;
    private Boolean subordinate;

    public Boolean getCommandeerable() {
        return commandeerable;
    }

    public Boolean getInvincible() {
        return invincible;
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

    public void setInvincible(Boolean invincible) {
        this.invincible = invincible;
    }

    public void setRebuild(Boolean rebuild) {
        this.rebuild = rebuild;
    }

    public void setSubordinate(Boolean subordinate) {
        this.subordinate = subordinate;
    }
}
