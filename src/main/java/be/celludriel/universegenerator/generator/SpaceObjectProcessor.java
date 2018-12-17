package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.Galaxy;
import be.celludriel.universegenerator.model.SpaceObject;

public class SpaceObjectProcessor {

    private final Randomizer randomizer;

    public SpaceObjectProcessor(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public void processSpaceObjects(Galaxy galaxy, Cluster cluster){
        for (SpaceObject spaceObject : cluster.getSpaceObjects()) {
            spaceObject.setClusterId(cluster.getId());
            if(spaceObject.getX() == null){
                spaceObject.setX(randomizer.randomInt(100,150));
            }
            if(spaceObject.getY() == null){
                spaceObject.setY(randomizer.randomInt(100,150));
            }
            if(spaceObject.getZ() == null){
                spaceObject.setZ(randomizer.randomInt(100,150));
            }
            galaxy.addSpaceObject(spaceObject);
        }
    }
}
