package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonTime extends AbstractJson {

    private Integer interval;
    private Integer start;

    public JsonTime() {
    }

    public JsonTime(Integer interval, Integer start) {
        this.interval = interval;
        this.start = start;
    }

    public Integer getInterval() {
        return interval;
    }

    public Integer getStart() {
        return start;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
