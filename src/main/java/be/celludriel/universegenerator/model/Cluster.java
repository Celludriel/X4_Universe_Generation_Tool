package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Cluster extends AbstractJson {

    public static final int SEMI_X_MOVEMENT = 15000000;
    public static final int FULL_X_MOVEMENT = 30000000;
    public static final int SEMI_Y_MOVEMENT = 8660000;
    public static final int FULL_Y_MOVEMENT = 17320000;

    private String id;
    private String name;
    private String description;
    private String music;
    private String sunlight;
    private String economy;
    private String security;
    private int x;
    private int y;
    private String backdrop;
    private boolean noBelts = false;
    private Faction factionHq;
    private FactionStart factionStart;
    private List<Connection> connections = new ArrayList<>();
    private List<Zone> zoneList = new ArrayList<>();
    private List<Belt> belts = new ArrayList<>();
    private List<Station> stations = new ArrayList<>();
    private List<SpaceObject> spaceObjects = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMusic() {
        return music;
    }

    public String getSunlight() {
        return sunlight;
    }

    public String getEconomy() {
        return economy;
    }

    public String getSecurity() {
        return security;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getBackdrop() {
        return backdrop;
    }

    public boolean isNoBelts() {
        return noBelts;
    }

    public Faction getFactionHq() {
        return factionHq;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public FactionStart getFactionStart() {
        return factionStart;
    }

    @JsonIgnore
    public List<Zone> getZoneList() {
        return zoneList;
    }

    public List<Belt> getBelts() {
        return belts;
    }

    public List<Station> getStations() {
        return stations;
    }

    public List<SpaceObject> getSpaceObjects() {
        return spaceObjects;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public void setSunlight(String sunlight) {
        this.sunlight = sunlight;
    }

    public void setEconomy(String economy) {
        this.economy = economy;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public void setNoBelts(boolean noBelts) {
        this.noBelts = noBelts;
    }

    public void setFactionHq(Faction factionHq) {
        this.factionHq = factionHq;
    }

    public void setFactionStart(FactionStart factionStart) {
        this.factionStart = factionStart;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public void setBelts(List<Belt> belts) {
        this.belts = belts;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public void setSpaceObjects(List<SpaceObject> spaceObjects) {
        this.spaceObjects = spaceObjects;
    }

    @JsonIgnore
    public String getClusterX(){
        return Long.toString(x * SEMI_X_MOVEMENT);
    }

    @JsonIgnore
    public String getClusterZ() {
        if(x % 2 < 0 && y == 0){
            return Long.toString(y - SEMI_Y_MOVEMENT);
        } else if(x % 2 > 0 && y == 0){
            return Long.toString(y + SEMI_Y_MOVEMENT);
        } else if (x % 2 == 0 && y > 0){
            return Long.toString(y * FULL_Y_MOVEMENT);
        } else if (x % 2 == 0 && y < 0){
            return Long.toString(y * FULL_Y_MOVEMENT);
        } else if(y < 0) {
            int offset = x > 0 ? SEMI_Y_MOVEMENT : -SEMI_Y_MOVEMENT;
            return Long.toString(offset - (Math.abs(y) * FULL_Y_MOVEMENT));
        } else if(y > 0) {
            int offset = x > 0 ? SEMI_Y_MOVEMENT : -SEMI_Y_MOVEMENT;
            return Long.toString(offset + (Math.abs(y) * FULL_Y_MOVEMENT));
        }
        return "0";
    }

    public void addToZoneList(Zone zone){
        this.zoneList.add(zone);
    }

    public void addToBelts(Belt belt){
        this.belts.add(belt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Cluster cluster = (Cluster) o;

        return new EqualsBuilder()
                .append(x, cluster.x)
                .append(y, cluster.y)
                .append(noBelts, cluster.noBelts)
                .append(id, cluster.id)
                .append(name, cluster.name)
                .append(description, cluster.description)
                .append(music, cluster.music)
                .append(sunlight, cluster.sunlight)
                .append(economy, cluster.economy)
                .append(security, cluster.security)
                .append(backdrop, cluster.backdrop)
                .append(factionHq, cluster.factionHq)
                .append(factionStart, cluster.factionStart)
                .append(connections, cluster.connections)
                .append(zoneList, cluster.zoneList)
                .append(belts, cluster.belts)
                .append(stations, cluster.stations)
                .append(spaceObjects, cluster.spaceObjects)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(description)
                .append(music)
                .append(sunlight)
                .append(economy)
                .append(security)
                .append(x)
                .append(y)
                .append(backdrop)
                .append(noBelts)
                .append(factionHq)
                .append(factionStart)
                .append(connections)
                .append(zoneList)
                .append(belts)
                .append(stations)
                .append(spaceObjects)
                .toHashCode();
    }
}
