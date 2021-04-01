package be.celludriel.universegenerator.model;

public enum Faction {
    PLAYER("faction.player", "", ""),
    ARGON("argon", "arg", "Argon", "discover"),
    ANTIGONE("antigone", "arg", "Antigone"),
    HATIKVAH("hatikvah", "arg", "HatikvahFreeLeague"),
    PARANID("paranid", "par","GodrealmOfTheParanid", "fight"),
    HOLYORDER("holyorder", "par", "HolyOrderFactionLogic"),
    ALLIANCE("alliance", "par", "AllianceOfTheWord"),
    TELADI("teladi", "tel", "TeladiCompany", "trade"),
    MINISTRY("ministry", "tel", "MinistryOfFinance"),
    SCALEPLATE("scaleplate", "tel", "ScalePlatePact"),
    XENON("xenon", "xen", "XenonFaction"),
    BUCCANEERS("buccaneers", "par", "Buccaneers"),
    TRINITY("trinity", "par", "Trinity"),
    SPLIT("split", "spl", "Split"),
    FREESPLIT("freesplit", "spl", "FreeSplit"),
    COURT("court", "spl", "Court"),
    FALLENFAMILIES("fallensplit", "spl", "FallenFamilies"),
    TERRAN("terran", "ter", "Terran"),
    PIONEER("pioneers", "ter", "Pioneer"),
    YAKI("yaki", "ter", "Yaki"),
    PLAYEROWNER("player", "", ""),
    OWNERLESS("ownerless", "", "");

    private String name;
    private String raceAbbreviation;
    private String playerStartMacro;
    private String managerName;

    public String getName() {
        return name;
    }

    public String getRaceAbbreviation(){
        return raceAbbreviation;
    }

    public String getPlayerStartMacro(){
        return playerStartMacro;
    }

    public String getManagerName(){
        return managerName;
    }


    Faction(String name, String raceAbbreviation, String managerName, String playerStartMacro) {
        this.name = name;
        this.raceAbbreviation = raceAbbreviation;
        this.playerStartMacro = playerStartMacro;
        this.managerName = managerName;
    }

    Faction(String name, String raceAbbreviation, String managerName) {
        this.name = name;
        this.raceAbbreviation = raceAbbreviation;
        this.managerName = managerName;
    }
}
