package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonOwner extends AbstractJson {

    protected String exact;
    protected boolean overridenpc;

    public JsonOwner() {
    }

    public JsonOwner(String exact, boolean overridenpc) {
        this.exact = exact;
        this.overridenpc = overridenpc;
    }

    public String getExact() {
        return exact;
    }

    public boolean isOverridenpc() {
        return overridenpc;
    }

    public void setExact(String exact) {
        this.exact = exact;
    }

    public void setOverridenpc(boolean overridenpc) {
        this.overridenpc = overridenpc;
    }
}
