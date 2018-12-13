package be.celludriel.universegenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

public class Job extends AbstractJson {

    private String id;
    private String name;
    private boolean rebuild = false;
    private boolean commandeerable = true;
    private boolean subordinate = false;
    private boolean buildatshipyard = true;
    private JobLocation jobLocation;
    private JobCategory jobCategory;
    private JobQuota jobQuota;
    private List<Order> orders = new ArrayList<>();
    private String basket;
    private Ship ship;
    private List<String> subordinates = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setSubordinates(List<String> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return new EqualsBuilder()
                .append(rebuild, job.rebuild)
                .append(commandeerable, job.commandeerable)
                .append(subordinate, job.subordinate)
                .append(buildatshipyard, job.buildatshipyard)
                .append(id, job.id)
                .append(name, job.name)
                .append(jobLocation, job.jobLocation)
                .append(jobCategory, job.jobCategory)
                .append(jobQuota, job.jobQuota)
                .append(orders, job.orders)
                .append(basket, job.basket)
                .append(ship, job.ship)
                .append(subordinates, job.subordinates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(rebuild)
                .append(commandeerable)
                .append(subordinate)
                .append(buildatshipyard)
                .append(jobLocation)
                .append(jobCategory)
                .append(jobQuota)
                .append(orders)
                .append(basket)
                .append(ship)
                .append(subordinates)
                .toHashCode();
    }
}
