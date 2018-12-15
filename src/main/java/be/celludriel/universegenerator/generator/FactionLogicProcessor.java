package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.FactionHqLocation;
import be.celludriel.universegenerator.model.Galaxy;

public class FactionLogicProcessor {

    public void processFactionLogicData(Galaxy galaxy){
        for (Cluster cluster : galaxy.getClusters()) {
            if(cluster.getFactionHq() != null){
                galaxy.addFactionHqLocation(new FactionHqLocation(cluster.getFactionHq(), cluster.getId()));
            }
        }
    }
}
