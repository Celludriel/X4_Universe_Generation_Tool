package be.celludriel.universegenerator.model;

public enum Tag {

    FACTIONLOGIC("factionlogic"), FREIGHTER("freighter"), TRADER("trader"),
    CONTAINER("container"), MINER("miner"), LIQUID("liquid"), SOLID("solid"),
    MILITARY("military"), CARRIER("carrier"), DESTROYER("destroyer"), FRIGATE("frigate"),
    FIGHTER("fighter"), HEAVY("heavy"), SCOUT("scout"), POLICE("police"), LIGHT("light");

    private String name;

    public String getName() {
        return name;
    }

    Tag(String name) {
        this.name = name;
    }
}
