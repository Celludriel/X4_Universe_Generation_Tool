package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class Job extends AbstractJson {

    private String id;
    private String name;
    private String description;
    private String disabled;
    private Boolean startActive;
    private Boolean fullName;
    private Boolean ignoreCommanderWares;
    private String comment;

    private String basket;
    private Category category;
    private List<JobOrder> orders = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private List<Quota> quotas = new ArrayList<>();
    private Location location;
    private Commander commander;
    private String encounters;
    private Environment environment;
    private Position position;
    private Modifiers modifiers;
    private Time time;
    private ExpirationTime expirationTime;

    private Ship ship;
    private List<Subordinate> subordinates = new ArrayList<>();
    private MassTraffic masstraffic;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDisabled() {
        return disabled;
    }

    public Boolean getStartActive() {
        return startActive;
    }

    public Boolean getFullName() {
        return fullName;
    }

    public Boolean getIgnoreCommanderWares() {
        return ignoreCommanderWares;
    }

    public String getComment() {
        return comment;
    }

    public String getBasket() {
        return basket;
    }

    public Category getCategory() {
        return category;
    }

    public List<JobOrder> getOrders() {
        return orders;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Quota> getQuotas() {
        return quotas;
    }

    public Location getLocation() {
        return location;
    }

    public Commander getCommander() {
        return commander;
    }

    public String getEncounters() {
        return encounters;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Position getPosition() {
        return position;
    }

    public Modifiers getModifiers() {
        return modifiers;
    }

    public Time getTime() {
        return time;
    }

    public ExpirationTime getExpirationTime() {
        return expirationTime;
    }

    public Ship getShip() {
        return ship;
    }

    public List<Subordinate> getSubordinates() {
        return subordinates;
    }

    public MassTraffic getMasstraffic() {
        return masstraffic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public void setStartActive(Boolean startActive) {
        this.startActive = startActive;
    }

    public void setFullName(Boolean fullName) {
        this.fullName = fullName;
    }

    public void setIgnoreCommanderWares(Boolean ignoreCommanderWares) {
        this.ignoreCommanderWares = ignoreCommanderWares;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setOrders(List<JobOrder> orders) {
        this.orders = orders;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    public void setEncounters(String encounters) {
        this.encounters = encounters;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setExpirationTime(ExpirationTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setSubordinates(List<Subordinate> subordinates) {
        this.subordinates = subordinates;
    }

    public void setMasstraffic(MassTraffic masstraffic) {
        this.masstraffic = masstraffic;
    }
}
