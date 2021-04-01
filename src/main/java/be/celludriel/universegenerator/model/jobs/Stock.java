package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Stock extends AbstractJson {

    private String ref;
    private String comment;

    public Stock() {
    }

    public Stock(String ref, String comment) {
        this.ref = ref;
        this.comment = comment;
    }

    public String getRef() {
        return ref;
    }

    public String getComment() {
        return comment;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
