package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class MassTraffic extends AbstractJson {

    private Owner owner;
    private PersonAttributes pilot;
    private Loadout loadout;
    private EquipmentMods equipmentMods;
    private String paint;
    private Basket basket;
    private List<Ammo> ammo = new ArrayList<>();
    private List<Cargo> cargo = new ArrayList<>();
    private List<Inventory> inventory = new ArrayList<>();
    private Drop drop;
    private List<Unit> units = new ArrayList<>();
    private People people;

    public Owner getOwner() {
        return owner;
    }

    public PersonAttributes getPilot() {
        return pilot;
    }

    public Loadout getLoadout() {
        return loadout;
    }

    public EquipmentMods getEquipmentMods() {
        return equipmentMods;
    }

    public String getPaint() {
        return paint;
    }

    public Basket getBasket() {
        return basket;
    }

    public List<Ammo> getAmmo() {
        return ammo;
    }

    public List<Cargo> getCargo() {
        return cargo;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public Drop getDrop() {
        return drop;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public People getPeople() {
        return people;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPilot(PersonAttributes pilot) {
        this.pilot = pilot;
    }

    public void setLoadout(Loadout loadout) {
        this.loadout = loadout;
    }

    public void setEquipmentMods(EquipmentMods equipmentMods) {
        this.equipmentMods = equipmentMods;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void setAmmo(List<Ammo> ammo) {
        this.ammo = ammo;
    }

    public void setCargo(List<Cargo> cargo) {
        this.cargo = cargo;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public void setDrop(Drop drop) {
        this.drop = drop;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
