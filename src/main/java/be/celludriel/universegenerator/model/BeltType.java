package be.celludriel.universegenerator.model;

public enum BeltType {
    ORE("x3g_ore_belt"), ICE("x3g_ice_belt"), HYDROGEN("x3g_hydrogen_belt"),
    HELIUM("x3g_helium_belt"), METHANE("x3g_methane_belt"), NVIDIUM("x3g_nvidium_belt");

    private String name;

    public String getName() {
        return name;
    }

    BeltType(String name) {
        this.name = name;
    }
}
