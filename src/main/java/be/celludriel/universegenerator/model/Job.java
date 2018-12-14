package be.celludriel.universegenerator.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Job extends AbstractJson {

    private String id;
    private String name;
    private Boolean startActive;
    private Boolean disabled;
    private Boolean rebuild;
    private Boolean commandeerable;
    private Boolean subordinate;
    private boolean buildatshipyard = true;
    private JobLocation jobLocation;
    private JobCategory jobCategory;
    private JobQuota jobQuota;
    private List<Order> orders = new ArrayList<>();
    private String basket;
    private String encounters;
    private String time;
    private Ship ship;
    private List<String> subordinates = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getStartActive() {
        return startActive;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public boolean isRebuild() {
        return rebuild;
    }

    public boolean isCommandeerable() {
        return commandeerable;
    }

    public boolean isSubordinate() {
        return subordinate;
    }

    public boolean isBuildatshipyard() {
        return buildatshipyard;
    }

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public JobCategory getJobCategory() {
        return jobCategory;
    }

    public JobQuota getJobQuota() {
        return jobQuota;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getBasket() {
        return basket;
    }

    public String getEncounters() {
        return encounters;
    }

    public String getTime() {
        return time;
    }

    public Ship getShip() {
        return ship;
    }

    public List<String> getSubordinates() {
        return subordinates;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartActive(Boolean startActive) {
        this.startActive = startActive;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public void setRebuild(boolean rebuild) {
        this.rebuild = rebuild;
    }

    public void setCommandeerable(boolean commandeerable) {
        this.commandeerable = commandeerable;
    }

    public void setSubordinate(boolean subordinate) {
        this.subordinate = subordinate;
    }

    public void setBuildatshipyard(boolean buildatshipyard) {
        this.buildatshipyard = buildatshipyard;
    }

    public void setJobLocation(JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }

    public void setJobCategory(JobCategory jobCategory) {
        this.jobCategory = jobCategory;
    }

    public void setJobQuota(JobQuota jobQuota) {
        this.jobQuota = jobQuota;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public void setEncounters(String encounters) {
        this.encounters = encounters;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setSubordinates(List<String> subordinates) {
        this.subordinates = subordinates;
    }

    public boolean hasModifiers(){
        return this.rebuild != null && this.commandeerable != null && this.subordinate != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return new EqualsBuilder()
                .append(buildatshipyard, job.buildatshipyard)
                .append(id, job.id)
                .append(name, job.name)
                .append(startActive, job.startActive)
                .append(disabled, job.disabled)
                .append(rebuild, job.rebuild)
                .append(commandeerable, job.commandeerable)
                .append(subordinate, job.subordinate)
                .append(jobLocation, job.jobLocation)
                .append(jobCategory, job.jobCategory)
                .append(jobQuota, job.jobQuota)
                .append(orders, job.orders)
                .append(basket, job.basket)
                .append(encounters, job.encounters)
                .append(time, job.time)
                .append(ship, job.ship)
                .append(subordinates, job.subordinates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(startActive)
                .append(disabled)
                .append(rebuild)
                .append(commandeerable)
                .append(subordinate)
                .append(buildatshipyard)
                .append(jobLocation)
                .append(jobCategory)
                .append(jobQuota)
                .append(orders)
                .append(basket)
                .append(encounters)
                .append(time)
                .append(ship)
                .append(subordinates)
                .toHashCode();
    }
}
