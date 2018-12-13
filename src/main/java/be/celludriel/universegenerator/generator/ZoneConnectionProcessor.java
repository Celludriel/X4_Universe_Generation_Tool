package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.*;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Zone naming format x3g_zone003_cluster01_sector001_macro
 * Zone connection naming format x3g_gate_c01s001z003_c04s001z002_connection
 */
public class ZoneConnectionProcessor {

    public static final String DEFAULT_CLUSTER_PREFIX = "zone001_cluster";
    public static final String SECTOR_001 = "s001";
    public static final String CLUSTER_PREFIX = "c";
    public static final String ZONE_PREFIX = "z";

    public void processConnections(Galaxy galaxy){
        List<Cluster> clusters = galaxy.getClusters();
        for (Cluster cluster : clusters) {

            if(cluster.getZoneList().size() == 0){
                addDefaultZone(cluster, galaxy);
            }

            //add connection zones
            for (Connection connection : cluster.getConnections()) {
                Cluster targetCluster = getTargetCluster(clusters, connection.getTargetClusterId());
                addConnectionZone(galaxy, cluster, targetCluster, connection);
            }
        }
    }

    private void addDefaultZone(Cluster cluster, Galaxy galaxy) {
        //add default zone
        Zone zone = new Zone();
        zone.setName(DEFAULT_CLUSTER_PREFIX + cluster.getId());
        if(cluster.isGamestart()){
            galaxy.setStarterZoneName(zone.getName());
        }
        cluster.addToZoneList(zone);
    }

    private void addConnectionZone(Galaxy galaxy, Cluster origin, Cluster target, Connection connection) {
        int nextId = origin.getZoneList().size() + 1;
        String newOriginZoneId = StringUtils.leftPad(Integer.toString(nextId), 3, "0");
        String zoneName = "zone" + newOriginZoneId + "_cluster" + origin.getId();
        String originConnectionID = CLUSTER_PREFIX + origin.getId() + SECTOR_001 + ZONE_PREFIX + newOriginZoneId;

        if(target.getZoneList().size() == 0){
            addDefaultZone(target, galaxy);
        }

        int targetNextId = target.getZoneList().size() + 1;
        String newTargetZoneId = StringUtils.leftPad(Integer.toString(targetNextId), 3, "0");
        String targetZoneName = "zone" + newTargetZoneId + "_cluster" + target.getId();
        String targetConnectionID = CLUSTER_PREFIX + target.getId() + SECTOR_001 + ZONE_PREFIX + newTargetZoneId;

        //create new origin zone with connections
        Zone originZone = new Zone();
        originZone.setX(connection.getConnectionType().getX());
        originZone.setY(connection.getConnectionType().getY());
        originZone.setName(zoneName);
        originZone.getConnections().add(new ZoneConnection(originConnectionID,targetConnectionID, target.getId(),
                targetZoneName, connection.getConnectionType().getRotation()));
        origin.addToZoneList(originZone);

        //create new target zone with connections
        Zone targetZone = new Zone();
        targetZone.setX(connection.getConnectionType().opposite().getX());
        targetZone.setY(connection.getConnectionType().opposite().getY());
        targetZone.setName(targetZoneName);
        targetZone.getConnections().add(new ZoneConnection(targetConnectionID, originConnectionID, origin.getId(),
                zoneName, connection.getConnectionType().opposite().getRotation(), true));
        target.addToZoneList(targetZone);
    }

    private Cluster getTargetCluster(List<Cluster> clusters, String targetClusterId) {
        for (Cluster cluster : clusters) {
            if(cluster.getId().equalsIgnoreCase(targetClusterId)){
                return cluster;
            }
        }
        throw new RuntimeException("No target cluster found for target id [" + targetClusterId +"]");
    }
}
