package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.generator.UniverseGenerator;
import be.celludriel.universegenerator.model.Galaxy;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class UniverseGeneratorMain {

    public static void main(String[] args) throws IOException, TemplateException, URISyntaxException {

        if(args.length == 0){
            throw new RuntimeException("You need to pass a galaxy model file");
        }

        String jsonFile = args[0];
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Galaxy galaxy = objectMapper.readValue(new File(jsonFile), Galaxy.class);

        UniverseGenerator universeGenerator = new UniverseGenerator(galaxy);
        universeGenerator.generateUniverse(galaxy);

        if(args.length > 1 && args[1].equalsIgnoreCase("generateSchema")){
            generateSchema(objectMapper);
        }
    }

    private static void generateSchema(ObjectMapper mapper) throws JsonProcessingException {
        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
        mapper.acceptJsonFormatVisitor(Galaxy.class, visitor);
        JsonSchema schema = visitor.finalSchema();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
    }
}
