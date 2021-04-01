package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Shield extends AbstractJson {

    private String ware;
    private String context;
    private String group;

    public String getWare() {
        return ware;
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

    public void setContext(String context) {
        this.context = context;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
