package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.HashMap;
import java.util.Map;

public class JsonOrder extends AbstractJson {

    private Map<String, String> params = new HashMap<>();
    private boolean defaultOrder;
    private String order;

    public Map<String, String> getParams() {
        return params;
    }

    public boolean isDefaultOrder() {
        return defaultOrder;
    }

    public String getOrder() {
        return order;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public void setDefaultOrder(boolean defaultOrder) {
        this.defaultOrder = defaultOrder;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
