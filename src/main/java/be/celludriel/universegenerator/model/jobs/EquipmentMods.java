package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class EquipmentMods extends AbstractJson {

    private ValueType chance;
    private String engine;
    private List<Weapon> weapons = new ArrayList<>();
    private List<Shield> shields = new ArrayList<>();
    private String ship;
    private String mods;

    public ValueType getChance() {
        return chance;
    }

    public String getEngine() {
        return engine;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public List<Shield> getShields() {
        return shields;
    }

    public String getShip() {
        return ship;
    }

    public String getMods() {
        return mods;
    }

    public void setChance(ValueType chance) {
        this.chance = chance;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void setShields(List<Shield> shields) {
        this.shields = shields;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public void setMods(String mods) {
        this.mods = mods;
    }
}
