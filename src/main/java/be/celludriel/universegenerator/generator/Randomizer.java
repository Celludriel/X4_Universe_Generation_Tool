package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.BeltType;
import org.apache.commons.math3.distribution.EnumeratedDistribution;
import org.apache.commons.math3.util.Pair;

import java.util.*;

public class Randomizer {

    private final Random random;
    private final EnumeratedDistribution<BeltType> beltDistribution;

    public Randomizer(long seed) {
        this.random = new Random(seed);
        List<Pair<BeltType, Double>> weightList = new ArrayList<>();
        for (BeltType beltType : BeltType.values()) {
            weightList.add(new Pair<>(beltType, beltType.getWeight()));
        }
        this.beltDistribution = new EnumeratedDistribution<>(weightList);
        this.beltDistribution.reseedRandomGenerator(seed);   ;
    }

    public Integer getRandomRotation() {
        return 0 + (int) (random.nextDouble() * (360 - 0));
    }

    public Long generateRandomCoordinate(long leftLimit, long rightLimit) {
        return leftLimit + (long) (random.nextDouble() * (rightLimit - leftLimit));
    }

    public BeltType getRandomBelt(){
        return beltDistribution.sample();
    }

    public int randomInt(int leftLimit, int rightLimit) {
        return leftLimit + (int) (random.nextDouble() * (rightLimit - leftLimit));
    }
}
