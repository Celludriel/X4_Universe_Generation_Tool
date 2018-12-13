package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Belt;
import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.Galaxy;

public class BeltProcessor {

    public static final long ZONERANGE = 150000L;

    public void processBelts(Galaxy galaxy){
        for (Cluster cluster : galaxy.getClusters()) {
            for (Belt belt : cluster.getBelts()) {
                if(belt.getX() == null){
                    belt.setX(generateRandomCoordinate(-ZONERANGE, ZONERANGE));
                }
                if(belt.getY() == null){
                    belt.setY(generateRandomCoordinate(-ZONERANGE, ZONERANGE));
                }
                if(belt.getRotation() == null){
                    belt.setRotation(generateRandomRotation());
                }
            }
        }
    }

    private Integer generateRandomRotation() {
        return 0 + (int) (Math.random() * (360 - 0));
    }

    private Long generateRandomCoordinate(long leftLimit, long rightLimit) {
        return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }
}
