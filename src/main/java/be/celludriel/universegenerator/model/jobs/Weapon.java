package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Weapon extends AbstractJson {

    private String ware;
    private String macro;
    private String context;
    private String group;

    public String getWare() {
        return ware;
    }

    public String getMacro() {
        return macro;
    }

    public String getContext() {
        return context;
    }

    public String getGroup() {
        return group;
    }

    public void setWare(String ware) {
        this.ware = ware;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
