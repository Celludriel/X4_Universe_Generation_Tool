package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Loadout extends AbstractJson {

    private ValueType level;
    private ValueType variation;
    private String ref;
    private String loadout;

    public ValueType getLevel() {
        return level;
    }

    public ValueType getVariation() {
        return variation;
    }

    public String getRef() {
        return ref;
    }

    public String getLoadout() {
        return loadout;
    }

    public void setLevel(ValueType level) {
        this.level = level;
    }

    public void setVariation(ValueType variation) {
        this.variation = variation;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }
}
