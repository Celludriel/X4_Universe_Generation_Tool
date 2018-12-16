package be.celludriel.universegenerator.model;

public enum Faction {
    PLAYER("faction.player", ""), ARGON("argon", "arg"), ANTIGONE("antigone", "arg"),
    HATIKVAH("hatikvah", "arg"), PARANID("paranid", "par"), HOLYORDER("holyorder", "par"),
    ALLIANCE("alliance", "par"), TELADI("teladi", "tel"), MINISTRY("ministry", "tel"),
    SCALEPLATE("scaleplate", "tel"), XENON("xenon", "xen"), PLAYEROWNER("player", ""),
    OWNERLESS("ownerless", "");

    private String name;
    private String raceAbbreviation;

    public String getName() {
        return name;
    }

    public String getRaceAbbreviation(){
        return raceAbbreviation;
    }

    Faction(String name, String raceAbbreviation) {
        this.name = name;
        this.raceAbbreviation = raceAbbreviation;
    }
}
