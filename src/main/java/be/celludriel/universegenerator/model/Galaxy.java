package be.celludriel.universegenerator.model;

import be.celludriel.universegenerator.model.jobs.Job;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Galaxy extends AbstractJson {

    private long seed;
    private String galaxyName;
    private String galaxyPrefix;
    private GalaxyOptions galaxyOptions;
    private String description;
    private String author;
    private String version;
    private String date;
    private String save;
    private int minRandomBelts;
    private int maxRandomBelts;
    private List<Cluster> clusters = new ArrayList<>();
    private List<FactionHqLocation> factionHqLocations = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Job> jobs = new ArrayList<>();
    private List<FactionStart> factionStarts = new ArrayList<>();
    private List<SpaceObject> spaceObjects = new ArrayList<>();
    private List<DataVault> dataVaults = new ArrayList<>();

    public long getSeed() {
        return seed;
    }

    public String getGalaxyName() {
        return galaxyName;
    }

    public String getGalaxyPrefix() {
        return galaxyPrefix;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getVersion() {
        return version;
    }

    public String getDate() {
        return date;
    }

    public String getSave() {
        return save;
    }

    public int getMinRandomBelts() {
        return minRandomBelts;
    }

    public int getMaxRandomBelts() {
        return maxRandomBelts;
    }

    public List<Cluster> getClusters() {
        return clusters;
    }

    @JsonIgnore
    public List<FactionHqLocation> getFactionHqLocations() {
        return factionHqLocations;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    @JsonIgnore
    public List<FactionStart> getFactionStarts() {
        return factionStarts;
    }

    @JsonIgnore
    public List<SpaceObject> getSpaceObjects() {
        return spaceObjects;
    }

    public GalaxyOptions getGalaxyOptions() {
        return galaxyOptions;
    }

    @JsonIgnore
    public List<DataVault> getDataVaults() {
        return dataVaults;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public void setGalaxyName(String galaxyName) {
        this.galaxyName = galaxyName;
    }

    public void setGalaxyPrefix(String galaxyPrefix) {
        this.galaxyPrefix = galaxyPrefix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public void setMinRandomBelts(int minRandomBelts) {
        this.minRandomBelts = minRandomBelts;
    }

    public void setMaxRandomBelts(int maxRandomBelts) {
        this.maxRandomBelts = maxRandomBelts;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setGalaxyOptions(GalaxyOptions galaxyOptions) {
        this.galaxyOptions = galaxyOptions;
    }

    public void addFactionHqLocation(FactionHqLocation factionHqLocation){
        this.factionHqLocations.add(factionHqLocation);
    }

    public void addFactionStart(FactionStart factionStart){
        this.factionStarts.add(factionStart);
    }

    public void addSpaceObject(SpaceObject spaceObject) {
        this.spaceObjects.add(spaceObject);
    }

    public void addDataVault(DataVault dataVault) {
        this.dataVaults.add(dataVault);
    }

    public boolean containsClaimableShips(){
        for (SpaceObject spaceObject : spaceObjects) {
            if(spaceObject.getType() == SpaceObjectType.CLAIM){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Galaxy galaxy = (Galaxy) o;

        return new EqualsBuilder()
                .append(seed, galaxy.seed)
                .append(minRandomBelts, galaxy.minRandomBelts)
                .append(maxRandomBelts, galaxy.maxRandomBelts)
                .append(galaxyName, galaxy.galaxyName)
                .append(galaxyPrefix, galaxy.galaxyPrefix)
                .append(galaxyOptions, galaxy.galaxyOptions)
                .append(description, galaxy.description)
                .append(author, galaxy.author)
                .append(version, galaxy.version)
                .append(date, galaxy.date)
                .append(save, galaxy.save)
                .append(clusters, galaxy.clusters)
                .append(factionHqLocations, galaxy.factionHqLocations)
                .append(products, galaxy.products)
                .append(jobs, galaxy.jobs)
                .append(factionStarts, galaxy.factionStarts)
                .append(spaceObjects, galaxy.spaceObjects)
                .append(dataVaults, galaxy.dataVaults)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(seed)
                .append(galaxyName)
                .append(galaxyPrefix)
                .append(galaxyOptions)
                .append(description)
                .append(author)
                .append(version)
                .append(date)
                .append(save)
                .append(minRandomBelts)
                .append(maxRandomBelts)
                .append(clusters)
                .append(factionHqLocations)
                .append(products)
                .append(jobs)
                .append(factionStarts)
                .append(spaceObjects)
                .append(dataVaults)
                .toHashCode();
    }
}
