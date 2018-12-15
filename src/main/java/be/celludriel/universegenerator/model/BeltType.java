package be.celludriel.universegenerator.model;

public enum BeltType {
    ORE("x3g_ore_belt",1.0), ICE("x3g_ice_belt",0.9), HYDROGEN("x3g_hydrogen_belt",0.6),
    HELIUM("x3g_helium_belt",0.6), METHANE("x3g_methane_belt",0.6), NVIDIUM("x3g_nvidium_belt",0.1);

    private final String name;
    private final Double weight;

    public String getName() {
        return name;
    }

    public double getWeight() { return weight; }

    BeltType(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
