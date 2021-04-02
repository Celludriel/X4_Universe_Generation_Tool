package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonShip extends AbstractJson {

    protected JsonSelect select;
    protected JsonLoadout loadout;
    protected JsonUnit unit;
    protected JsonOwner owner;
    protected JsonCargo cargo;
    protected JsonPilot pilot;

    public JsonSelect getSelect() {
        return select;
    }

    public JsonLoadout getLoadout() {
        return loadout;
    }

    public JsonUnit getUnit() {
        return unit;
    }

    public JsonOwner getOwner() {
        return owner;
    }

    public JsonCargo getCargo() {
        return cargo;
    }

    public JsonPilot getPilot() {
        return pilot;
    }

    public void setSelect(JsonSelect select) {
        this.select = select;
    }

    public void setLoadout(JsonLoadout loadout) {
        this.loadout = loadout;
    }

    public void setUnit(JsonUnit unit) {
        this.unit = unit;
    }

    public void setOwner(JsonOwner owner) {
        this.owner = owner;
    }

    public void setCargo(JsonCargo cargo) {
        this.cargo = cargo;
    }

    public void setPilot(JsonPilot pilot) {
        this.pilot = pilot;
    }
}
