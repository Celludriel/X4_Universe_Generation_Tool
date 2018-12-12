package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.generator.UniverseGenerator;
import be.celludriel.universegenerator.model.Galaxy;
import com.fasterxml.jackson.databind.ObjectMapper;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class UniverseGeneratorMain {

    public static void main(String[] args) throws IOException, TemplateException {

        if(args.length == 0){
            throw new RuntimeException("You need to pass a galaxy model file");
        }

        String jsonFile = args[0];
        ObjectMapper objectMapper = new ObjectMapper();
        Galaxy galaxy = objectMapper.readValue(new File(jsonFile), Galaxy.class);

        UniverseGenerator universeGenerator = new UniverseGenerator();
        universeGenerator.generateUniverse(galaxy);
    }
}
