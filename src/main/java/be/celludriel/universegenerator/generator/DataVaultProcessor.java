package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.DataVault;
import be.celludriel.universegenerator.model.Galaxy;
import org.apache.commons.lang3.StringUtils;

public class DataVaultProcessor {

    private final Randomizer randomizer;

    public DataVaultProcessor(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public void generateDataVaultData(Galaxy galaxy){
        for(int i=0;i < 28;i++){
            int clusterId = randomizer.randomInt(1, galaxy.getClusters().size());
            int x = randomizer.randomInt(-200000, 200000);
            int y = randomizer.randomInt(-200000, 200000);
            galaxy.addDataVault(new DataVault(StringUtils.leftPad(Integer.toString(clusterId),2, "0"), x, y));
        }
    }
}
