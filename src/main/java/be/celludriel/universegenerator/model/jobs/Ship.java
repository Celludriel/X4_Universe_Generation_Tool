package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Ship extends AbstractJson {

    private MassTraffic massTraffic;
    private ShipCategory shipCategory;
    private String comment;
    private String macro;
    private String group;
    private String ref;
    private String capturable;
    private String sellable;

    public MassTraffic getMasstrafic() {
        return massTraffic;
    }

    public ShipCategory getShipCategory() {
        return shipCategory;
    }

    public String getComment() {
        return comment;
    }

    public String getMacro() {
        return macro;
    }

    public String getGroup() {
        return group;
    }

    public String getRef() {
        return ref;
    }

    public String getCapturable() {
        return capturable;
    }

    public String getSellable() {
        return sellable;
    }

    public void setMasstrafic(MassTraffic massTraffic) {
        this.massTraffic = massTraffic;
    }

    public void setShipCategory(ShipCategory shipCategory) {
        this.shipCategory = shipCategory;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setCapturable(String capturable) {
        this.capturable = capturable;
    }

    public void setSellable(String sellable) {
        this.sellable = sellable;
    }
}
