package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Galaxy extends AbstractJson {

    private String galaxyName;
    private String galaxyPrefix;
    private String gamestartName;
    private String description;
    private String author;
    private String version;
    private String date;
    private String save;
    private String starterZoneName;
    private List<Cluster> clusters = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Job> jobs = new ArrayList<>();

    public String getGalaxyName() {
        return galaxyName;
    }

    public String getGalaxyPrefix() {
        return galaxyPrefix;
    }

    public String getGamestartName() {
        return gamestartName;
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

    public List<Cluster> getClusters() {
        return clusters;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setGalaxyName(String galaxyName) {
        this.galaxyName = galaxyName;
    }

    public void setGalaxyPrefix(String galaxyPrefix) {
        this.galaxyPrefix = galaxyPrefix;
    }

    public void setGamestartName(String gamestartName) {
        this.gamestartName = gamestartName;
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

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Galaxy galaxy = (Galaxy) o;

        return new EqualsBuilder()
                .append(galaxyName, galaxy.galaxyName)
                .append(galaxyPrefix, galaxy.galaxyPrefix)
                .append(gamestartName, galaxy.gamestartName)
                .append(description, galaxy.description)
                .append(author, galaxy.author)
                .append(version, galaxy.version)
                .append(date, galaxy.date)
                .append(save, galaxy.save)
                .append(starterZoneName, galaxy.starterZoneName)
                .append(clusters, galaxy.clusters)
                .append(products, galaxy.products)
                .append(jobs, galaxy.jobs)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(galaxyName)
                .append(galaxyPrefix)
                .append(gamestartName)
                .append(description)
                .append(author)
                .append(version)
                .append(date)
                .append(save)
                .append(starterZoneName)
                .append(clusters)
                .append(products)
                .append(jobs)
                .toHashCode();
    }
}
