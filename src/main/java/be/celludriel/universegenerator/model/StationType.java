package be.celludriel.universegenerator.model;

public enum StationType {
    SHIPYARD("shipyard"), WHARF("wharf"), EQUIP("equipmentdock"),
    DEFENCE("defence"), TRADE("tradestation"), PIRATEBASE("piratebase");

    private String name;

    public String getName() {
        return name;
    }

    StationType(String name) {
        this.name = name;
    }
}
