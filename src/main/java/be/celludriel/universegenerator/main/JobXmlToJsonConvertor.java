package be.celludriel.universegenerator.main;

import be.celludriel.universegenerator.model.jobs.Job;
import be.celludriel.universegenerator.model.xml.generated.Jobs;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobXmlToJsonConvertor {

    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Jobs.class);
        Jobs jobs = (Jobs) context.createUnmarshaller()
                .unmarshal(new FileReader("C:\\workspaces\\X4_Universe_Generation_Tool\\input\\jobs\\jobs.xml"));

        List<Job> jsonJobList = loadJobList(jobs);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("c:\\temp\\jobs.json"), jsonJobList);
    }

    private static List<Job> loadJobList(Jobs jobs) {
        List<Job> jsonJobList = new ArrayList<>(jobs.getJob().size());
        return jsonJobList;
    }
}
