import be.celludriel.universegenerator.model.BeltType;
import org.apache.commons.math3.distribution.EnumeratedDistribution;
import org.apache.commons.math3.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumeratedDistributionTest {

    @Test
    public void testGettingTenResults() {
        long seed = 12345L;
        List<Pair<BeltType, Double>> weightList = new ArrayList<>();
        Map<BeltType, Integer> count = new HashMap<>();

        for (BeltType beltType : BeltType.values()) {
            weightList.add(new Pair<>(beltType, beltType.getWeight()));
        }

        EnumeratedDistribution<BeltType> enumeratedDistribution = new EnumeratedDistribution<>(weightList);
        enumeratedDistribution.reseedRandomGenerator(seed);
        System.out.println(enumeratedDistribution.getPmf());

        for(int i=0;i < 1000;i++){
            BeltType sample = enumeratedDistribution.sample();
            Integer preCount = count.get(sample);
            if(preCount == null)
                preCount = 0;

            preCount++;
            count.put(sample, preCount);
        }

        for (Map.Entry<BeltType, Integer> beltTypeIntegerEntry : count.entrySet()) {
            System.out.println(beltTypeIntegerEntry.getKey() + ": " + beltTypeIntegerEntry.getValue());
        }

    }
}
