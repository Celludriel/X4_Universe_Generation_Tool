package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.DataVault;
import be.celludriel.universegenerator.model.Galaxy;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class DataVaultProcessor {

    private final Randomizer randomizer;

    public DataVaultProcessor(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public void generateDataVaultData(Galaxy galaxy){
        for(int i=0;i < 28;i++){
            Cluster randomCluster = galaxy.getClusters().get(randomizer.randomInt(0,galaxy.getClusters().size()-1));

            int x = randomizer.randomInt(-200000, 200000);
            int y = randomizer.randomInt(-200000, 200000);
            galaxy.addDataVault(new DataVault(randomCluster.getId(), x, y));
        }
    }
}
