package be.celludriel.universegenerator.model;

public enum ShipSize {

    LARGE("ship_l"), MEDIUM("ship_m"), SMALL("ship_s"),
    XLARGE("ship_xl");

    private String name;

    public String getName() {
        return name;
    }

    ShipSize(String name) {
        this.name = name;
    }
}
