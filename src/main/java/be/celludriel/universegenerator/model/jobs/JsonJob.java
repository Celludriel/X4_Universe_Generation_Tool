package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class JsonJob extends AbstractJson {

    private String id;
    private String name;
    private String description;
    private Boolean disabled;
    private Boolean startActive;
    private Boolean ignoreCommanderWares;
    private String comment;

    private String basket;
    private JsonCategory category;
    private JsonOrder order;
    private String task;
    private JsonQuota quota;
    private JsonLocation location;
    private String encounters;
    private JsonEnvironment environment;
    private JsonModifiers modifiers;
    private JsonTime time;
    private JsonExpirationTime expirationTime;

    private JsonShip ship;
    private List<String> subordinates = new ArrayList<>();
    private JsonMassTraffic masstraffic;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public Boolean getStartActive() {
        return startActive;
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

    public JsonCategory getCategory() {
        return category;
    }

    public JsonOrder getOrder() {
        return order;
    }

    public String getTask() {
        return task;
    }

    public JsonQuota getQuota() {
        return quota;
    }

    public JsonLocation getLocation() {
        return location;
    }

    public String getEncounters() {
        return encounters;
    }

    public JsonEnvironment getEnvironment() {
        return environment;
    }

    public JsonModifiers getModifiers() {
        return modifiers;
    }

    public JsonTime getTime() {
        return time;
    }

    public JsonExpirationTime getExpirationTime() {
        return expirationTime;
    }

    public JsonShip getShip() {
        return ship;
    }

    public List<String> getSubordinates() {
        return subordinates;
    }

    public JsonMassTraffic getMasstraffic() {
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

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public void setStartActive(Boolean startActive) {
        this.startActive = startActive;
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

    public void setCategory(JsonCategory category) {
        this.category = category;
    }

    public void setOrder(JsonOrder order) {
        this.order = order;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setQuota(JsonQuota quota) {
        this.quota = quota;
    }

    public void setLocation(JsonLocation location) {
        this.location = location;
    }

    public void setEncounters(String encounters) {
        this.encounters = encounters;
    }

    public void setEnvironment(JsonEnvironment environment) {
        this.environment = environment;
    }

    public void setModifiers(JsonModifiers modifiers) {
        this.modifiers = modifiers;
    }

    public void setTime(JsonTime time) {
        this.time = time;
    }

    public void setExpirationTime(JsonExpirationTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public void setShip(JsonShip ship) {
        this.ship = ship;
    }

    public void setSubordinates(List<String> subordinates) {
        this.subordinates = subordinates;
    }

    public void setMasstraffic(JsonMassTraffic masstraffic) {
        this.masstraffic = masstraffic;
    }
}
