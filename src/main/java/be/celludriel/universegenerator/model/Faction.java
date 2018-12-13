package be.celludriel.universegenerator.model;

public enum Faction {
    PLAYER("faction.player"), ARGON("argon"), ANTIGONE("antigone"),
    HATIKVAH("hatikvah"), PARANID("paranid"), HOLYORDER("holyorder"),
    ALLIANCE("alliance"), TELADI("teladi"), MINISTERY("minestery"),
    SCALEPLATE("scaleplate"), XENON("xenon"), PLAYEROWNER("player");

    private String name;

    public String getName() {
        return name;
    }

    Faction(String name) {
        this.name = name;
    }
}
