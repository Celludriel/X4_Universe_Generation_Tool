package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    private String name;
    private int x;
    private int y;
    private List<ZoneConnection> connections = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public List<ZoneConnection> getConnections() {
        return connections;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setConnections(List<ZoneConnection> connections) {
        this.connections = connections;
    }

    public boolean isHasConnections(){
        return this.connections.size() > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Zone zone = (Zone) o;

        return new EqualsBuilder()
                .append(x, zone.x)
                .append(y, zone.y)
                .append(name, zone.name)
                .append(connections, zone.connections)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(x)
                .append(y)
                .append(connections)
                .toHashCode();
    }
}
