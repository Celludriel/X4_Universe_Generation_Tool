package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Galaxy;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UniverseGenerator {

    public static final String CLUSTERS = "clusters";
    private final FreemarkerConfiguration freemarkerConfiguration;
    private final ZoneConnectionProcessor zoneConnectionProcessor;
    private final BeltProcessor beltProcessor;

    public UniverseGenerator() {
        freemarkerConfiguration = new FreemarkerConfiguration();
        zoneConnectionProcessor = new ZoneConnectionProcessor();
        beltProcessor = new BeltProcessor();
    }

    public void generateUniverse(Galaxy galaxy) throws IOException, TemplateException {
        zoneConnectionProcessor.processConnections(galaxy);
        beltProcessor.processBelts(galaxy);

        generateOutput(galaxy);
    }

    private void generateOutput(Galaxy galaxy) throws IOException, TemplateException {
        Configuration cfg = freemarkerConfiguration.configure();
        Map<String, Object> root = new HashMap<>();
        root.put("galaxy", galaxy);

        generateZones(cfg, root, CLUSTERS);
        generateSectors(cfg, root, CLUSTERS);
        generateClusters(cfg, root, CLUSTERS);
        generateUniverse(cfg, root, CLUSTERS);
        generateMacros(cfg, root, CLUSTERS);
        generateMapdefaults(cfg, root, CLUSTERS);
        generateContent(cfg, root, CLUSTERS);
        generateGod(cfg, root, CLUSTERS);
        generateJobs(cfg, root, CLUSTERS);
        generateGameStart(cfg, root, CLUSTERS);
    }

    private void generateGameStart(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/gamestarts.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/libraries/gamestarts.xml";
        writeToFile(root, temp, path);
    }

    private void generateZones(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/zone.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/maps/" + galaxy.getGalaxyName() + "/zones.xml";
        writeToFile(root, temp, path);
    }

    private void generateSectors(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/sector.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/maps/" + galaxy.getGalaxyName() + "/sectors.xml";
        writeToFile(root, temp, path);
    }

    private void generateClusters(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/cluster.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/maps/" + galaxy.getGalaxyName() + "/clusters.xml";
        writeToFile(root, temp, path);
    }

    private void generateUniverse(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/universe.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/maps/" + galaxy.getGalaxyName() + "/galaxy.xml";
        writeToFile(root, temp, path);
    }

    private void generateMacros(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/macros.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/index/macros.xml";
        writeToFile(root, temp, path);
    }

    private void generateMapdefaults(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/mapdefaults.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/libraries/mapdefaults.xml";
        writeToFile(root, temp, path);
    }

    private void generateContent(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/content.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/content.xml";
        writeToFile(root, temp, path);
    }

    private void generateGod(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/god.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/libraries/god.xml";
        writeToFile(root, temp, path);
    }

    private void generateJobs(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/jobs.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/libraries/jobs.xml";
        writeToFile(root, temp, path);
    }

    private void writeToFile(Map<String, Object> root, Template temp, String path) throws IOException, TemplateException {
        FileUtils.touch(new File(path));
        temp.process(root, new FileWriter(path));
    }
}
