package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Time extends AbstractJson {

    private Double interval;
    private Double start;

    public Time() {
    }

    public Time(Double interval, Double start) {
        this.interval = interval;
        this.start = start;
    }

    public Double getInterval() {
        return interval;
    }

    public Double getStart() {
        return start;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public void setStart(Double start) {
        this.start = start;
    }
}
