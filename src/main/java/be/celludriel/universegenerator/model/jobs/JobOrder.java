package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.HashMap;
import java.util.Map;

public class JobOrder extends AbstractJson {

    private Map<String, String> params = new HashMap<>();
    private String order;
    private Boolean defaultOrder;
    private String comment;

    public Map<String, String> getParams() {
        return params;
    }

    public String getOrder() {
        return order;
    }

    public Boolean getDefaultOrder() {
        return defaultOrder;
    }

    public String getComment() {
        return comment;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setDefaultOrder(Boolean defaultOrder) {
        this.defaultOrder = defaultOrder;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
