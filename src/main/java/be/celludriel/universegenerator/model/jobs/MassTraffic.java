package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import javax.xml.bind.annotation.XmlAttribute;
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

    private ShipCategory shipCategory;
    private Float relaunchdelay;
    private Float respawndelay;
    private String comment;
    private String macro;
    private String group;
    private String ref;
    private String capturable;
    private String sellable;

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

    public ShipCategory getShipCategory() {
        return shipCategory;
    }

    public Float getRelaunchdelay() {
        return relaunchdelay;
    }

    public Float getRespawndelay() {
        return respawndelay;
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

    public void setShipCategory(ShipCategory shipCategory) {
        this.shipCategory = shipCategory;
    }

    public void setRelaunchdelay(Float relaunchdelay) {
        this.relaunchdelay = relaunchdelay;
    }

    public void setRespawndelay(Float respawndelay) {
        this.respawndelay = respawndelay;
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
