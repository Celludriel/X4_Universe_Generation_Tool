package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonMassTraffic extends AbstractJson {

    private JsonOwner owner;
    private String ref;
    private Integer relaunchdelay;
    private Integer respawndelay;

    public JsonOwner getOwner() {
        return owner;
    }

    public String getRef() {
        return ref;
    }

    public Integer getRelaunchdelay() {
        return relaunchdelay;
    }

    public Integer getRespawndelay() {
        return respawndelay;
    }

    public void setOwner(JsonOwner owner) {
        this.owner = owner;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setRelaunchdelay(Integer relaunchdelay) {
        this.relaunchdelay = relaunchdelay;
    }

    public void setRespawndelay(Integer respawndelay) {
        this.respawndelay = respawndelay;
    }
}
