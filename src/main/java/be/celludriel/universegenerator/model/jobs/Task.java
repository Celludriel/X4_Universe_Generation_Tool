package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.HashMap;
import java.util.Map;

public class Task extends AbstractJson {

    private Map<String, String> params = new HashMap<>();
    private String task;
    private String entitytype;
    private String comment;

    public Map<String, String> getParams() {
        return params;
    }

    public String getTask() {
        return task;
    }

    public String getEntitytype() {
        return entitytype;
    }

    public String getComment() {
        return comment;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
