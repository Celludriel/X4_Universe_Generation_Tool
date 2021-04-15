package be.celludriel.universegenerator.model;

public enum Race {
    ARGON("argon"), TELADI("teladi"), PARANID("paranid"),
    XENON("xenon"), SPLIT("split"), TERRAN("terran");

    private String name;

    public String getName() {
        return name;
    }

    Race(String name) {
        this.name = name;
    }
}
