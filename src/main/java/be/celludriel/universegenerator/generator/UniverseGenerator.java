package be.celludriel.universegenerator.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UniverseGenerator {

    private final FreemarkerConfiguration freemarkerConfiguration;

    public UniverseGenerator() {
        freemarkerConfiguration = new FreemarkerConfiguration();
    }

    public void generateUniverse(int amountOfClusters, String type) throws IOException, TemplateException {
        Configuration cfg = freemarkerConfiguration.configure();
        Map<String, Object> root = new HashMap<>();
        root.put("clusters", amountOfClusters);

        generateZones(cfg, root, type);
        generateSectors(cfg, root, type);
        generateClusters(cfg, root, type);
        generateUniverse(cfg, root, type);
        generateMacros(cfg, root, type);
        generateMapdefaults(cfg, root, type);
    }

    private void generateZones(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/zone.ftl");

        FileUtils.touch(new File("output/zones.xml"));
        temp.process(root, new FileWriter("output/zones.xml"));
    }

    private void generateSectors(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/sector.ftl");
        Writer out = new FileWriter("output/sectors.xml");
        temp.process(root, out);
    }

    private void generateClusters(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/cluster.ftl");
        Writer out = new FileWriter("output/clusters.xml");
        temp.process(root, out);
    }

    private void generateUniverse(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/universe.ftl");
        Writer out = new FileWriter("output/galaxy.xml");
        temp.process(root, out);
    }

    private void generateMacros(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/macros.ftl");
        Writer out = new FileWriter("output/macros.xml");
        temp.process(root, out);
    }

    private void generateMapdefaults(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/mapdefaults.ftl");
        Writer out = new FileWriter("output/mapdefaults.xml");
        temp.process(root, out);
    }
}
