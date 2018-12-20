package be.celludriel.universegenerator.generator;

import be.celludriel.universegenerator.model.Cluster;
import be.celludriel.universegenerator.model.Galaxy;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class UniverseGenerator {

    public static final String CLUSTERS = "clusters";
    private final FreemarkerConfiguration freemarkerConfiguration;

    private final ZoneConnectionProcessor zoneConnectionProcessor;
    private final BeltProcessor beltProcessor;
    private final FactionLogicProcessor factionLogicProcessor;
    private final SpaceObjectProcessor spaceObjectProcessor;
    private final DataVaultProcessor dataVaultProcessor;

    private final Randomizer randomizer;
    private final CopyUtils copyUtils;

    public UniverseGenerator(Galaxy galaxy) {
        randomizer = new Randomizer(galaxy.getSeed());
        freemarkerConfiguration = new FreemarkerConfiguration();
        zoneConnectionProcessor = new ZoneConnectionProcessor();
        beltProcessor = new BeltProcessor(randomizer);
        factionLogicProcessor = new FactionLogicProcessor();
        this.spaceObjectProcessor = new SpaceObjectProcessor(randomizer);
        this.dataVaultProcessor = new DataVaultProcessor(randomizer);
        this.copyUtils = new CopyUtils();
    }

    public void generateUniverse(Galaxy galaxy) throws IOException, TemplateException, URISyntaxException {
        runProcessors(galaxy);
        generateOutput(galaxy);
    }

    private void runProcessors(Galaxy galaxy) {
        for (Cluster cluster : galaxy.getClusters()) {
            zoneConnectionProcessor.processConnections(galaxy, cluster);
            beltProcessor.processBelts(galaxy, cluster);
            factionLogicProcessor.processFactionLogicData(galaxy, cluster);
            spaceObjectProcessor.processSpaceObjects(galaxy, cluster);
        }
        dataVaultProcessor.generateDataVaultData(galaxy);
    }

    private void generateOutput(Galaxy galaxy) throws IOException, TemplateException, URISyntaxException {
        Configuration cfg = freemarkerConfiguration.configure();
        Map<String, Object> root = new HashMap<>();
        root.put("galaxy", galaxy);
        String path = cleanOutputDirectory(galaxy);

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
        generateMdFixFiles(cfg, root, CLUSTERS);
        generatePlacedObjects(cfg, root, CLUSTERS);
        copyCoreResources(root, path, galaxy);
    }

    private String cleanOutputDirectory(Galaxy galaxy) throws IOException {
        String path = "output/" + galaxy.getGalaxyName();
        File directory = new File(path);
        if(directory.exists()){
            FileUtils.cleanDirectory(directory);
        }
        return path;
    }

    private void copyCoreResources(Map<String, Object> root, String path, Galaxy galaxy) throws IOException, URISyntaxException {
        String source = "/core/region_definitions.xml";
        String target = path + "/libraries/region_definitions.xml";
        copyUtils.copyToOutputDir(source, target);

        source = "/core/X4Ep1_Mentor_Subscription.xml";
        target = path + "/md/X4Ep1_Mentor_Subscription.xml";
        copyUtils.copyToOutputDir(source, target);

        source = "/core/Notifications.xml";
        target = path + "/md/Notifications.xml";
        copyUtils.copyToOutputDir(source, target);

        source = "/core/defaults.xml";
        target = path + "/libraries/defaults.xml";
        copyUtils.copyToOutputDir(source, target);

        if (galaxy.getGalaxyOptions().isAddDoubleTravelSpeed()) {
            addDoubleTravelSpeedToOutput(path);
        }
    }

    private void addDoubleTravelSpeedToOutput(String path) throws URISyntaxException, IOException {
        String originFolder = "core/engines";
        String targetFolder = path + "/assets/props/Engines/macros/";
        copyUtils.copyDirectoryToOutputDir(originFolder, targetFolder);
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

    private void generateMdFixFiles(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/factionLogic.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/md/FactionLogic.xml";
        writeToFile(root, temp, path);

        temp = cfg.getTemplate(type + "/drainStations.ftl");
        path = "output/" + galaxy.getGalaxyName() + "/md/Drain_Stations.xml";
        writeToFile(root, temp, path);

        temp = cfg.getTemplate(type + "/customGameStart.ftl");
        path = "output/" + galaxy.getGalaxyName() + "/md/CustomGameStart.xml";
        writeToFile(root, temp, path);
    }

    private void generatePlacedObjects(Configuration cfg, Map<String, Object> root, String type) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(type + "/placedObjects.ftl");
        Galaxy galaxy = (Galaxy) root.get("galaxy");
        String path = "output/" + galaxy.getGalaxyName() + "/md/PlacedObjects.xml";
        writeToFile(root, temp, path);
    }

    private void writeToFile(Map<String, Object> root, Template temp, String path) throws IOException, TemplateException {
        FileUtils.touch(new File(path));
        temp.process(root, new FileWriter(path));
    }
}
