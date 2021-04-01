package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Subordinate extends AbstractJson {

    private String job;
    private String rebuild;

    public String getJob() {
        return job;
    }

    public String getRebuild() {
        return rebuild;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setRebuild(String rebuild) {
        this.rebuild = rebuild;
    }
}
