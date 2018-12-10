package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.generator.UniverseGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class UniverseGeneratorMain {

    public static void main(String[] args) throws IOException, TemplateException {

        String type = "sectors";
        if(args.length == 0){
            throw new RuntimeException("You need to supply the amount of clusters you are going to generate");
        }

        if(args.length == 2){
            type = args[1];
        }

        int amountOfClusters = Integer.parseInt(args[0]);

        UniverseGenerator universeGenerator = new UniverseGenerator();
        universeGenerator.generateUniverse(amountOfClusters, type);
    }
}
