package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Commander extends AbstractJson {

    private String macro;
    private String entityType;

    public Commander() {
    }

    public Commander(String macro, String entityType) {
        this.macro = macro;
        this.entityType = entityType;
    }

    public String getMacro() {
        return macro;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}
