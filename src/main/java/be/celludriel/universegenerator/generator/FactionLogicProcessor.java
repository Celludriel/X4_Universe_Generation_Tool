package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.FactionHqLocation;
import be.celludriel.universegenerator.model.FactionStart;
import be.celludriel.universegenerator.model.Galaxy;

public class FactionLogicProcessor {

    public void processFactionLogicData(Galaxy galaxy, Cluster cluster){
        if(cluster.getFactionHq() != null){
            galaxy.addFactionHqLocation(new FactionHqLocation(cluster.getFactionHq(), cluster.getId()));
        }

        if(cluster.getFactionStart() != null){
            FactionStart factionStart = cluster.getFactionStart();
            factionStart.setClusterId(cluster.getId());
            galaxy.addFactionStart(factionStart);
        }
    }
}
