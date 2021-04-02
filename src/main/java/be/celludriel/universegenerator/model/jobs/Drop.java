package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Drop extends AbstractJson {

    private String ref;
    private String comment;

    public Drop() {
    }

    public Drop(String ref, String comment) {
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
