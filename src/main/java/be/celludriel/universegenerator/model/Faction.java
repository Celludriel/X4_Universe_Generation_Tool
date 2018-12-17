package be.celludriel.universegenerator.model;

public enum Faction {
    PLAYER("faction.player", ""), ARGON("argon", "arg", "discoverer"), ANTIGONE("antigone", "arg"),
    HATIKVAH("hatikvah", "arg"), PARANID("paranid", "par", "fight"), HOLYORDER("holyorder", "par"),
    ALLIANCE("alliance", "par"), TELADI("teladi", "tel", "trade"), MINISTRY("ministry", "tel"),
    SCALEPLATE("scaleplate", "tel"), XENON("xenon", "xen"), PLAYEROWNER("player", ""),
    OWNERLESS("ownerless", "");

    private String name;
    private String raceAbbreviation;
    private String playerStartMacro;

    public String getName() {
        return name;
    }

    public String getRaceAbbreviation(){
        return raceAbbreviation;
    }

    public String getPlayerStartMacro(){
        return playerStartMacro;
    }


    Faction(String name, String raceAbbreviation, String playerStartMacro) {
        this.name = name;
        this.raceAbbreviation = raceAbbreviation;
        this.playerStartMacro = playerStartMacro;
    }

    Faction(String name, String raceAbbreviation) {
        this.name = name;
        this.raceAbbreviation = raceAbbreviation;
    }
}
