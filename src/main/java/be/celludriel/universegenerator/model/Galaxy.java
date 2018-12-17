package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Galaxy extends AbstractJson {

    private long seed;
    private String galaxyName;
    private String galaxyPrefix;
    private String description;
    private String author;
    private String version;
    private String date;
    private String save;
    private String starterZoneName;
    private int minRandomBelts;
    private int maxRandomBelts;
    private List<Cluster> clusters = new ArrayList<>();
    private List<FactionHqLocation> factionHqLocations = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Job> jobs = new ArrayList<>();
    private List<FactionStart> factionStarts = new ArrayList<>();
    private GalaxyOptions galaxyOptions;

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

    @JsonIgnore
    public String getStarterZoneName() {
        return starterZoneName;
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

    public GalaxyOptions getGalaxyOptions() {
        return galaxyOptions;
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

    public void setStarterZoneName(String starterZoneName) {
        this.starterZoneName = starterZoneName;
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
                .append(description, galaxy.description)
                .append(author, galaxy.author)
                .append(version, galaxy.version)
                .append(date, galaxy.date)
                .append(save, galaxy.save)
                .append(starterZoneName, galaxy.starterZoneName)
                .append(clusters, galaxy.clusters)
                .append(factionHqLocations, galaxy.factionHqLocations)
                .append(products, galaxy.products)
                .append(jobs, galaxy.jobs)
                .append(factionStarts, galaxy.factionStarts)
                .append(galaxyOptions, galaxy.galaxyOptions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(seed)
                .append(galaxyName)
                .append(galaxyPrefix)
                .append(description)
                .append(author)
                .append(version)
                .append(date)
                .append(save)
                .append(starterZoneName)
                .append(minRandomBelts)
                .append(maxRandomBelts)
                .append(clusters)
                .append(factionHqLocations)
                .append(products)
                .append(jobs)
                .append(factionStarts)
                .append(galaxyOptions)
                .toHashCode();
    }
}
