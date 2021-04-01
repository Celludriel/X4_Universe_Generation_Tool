package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Person extends AbstractJson {

    private PersonAttributes person;
    private String role;
    private String comment;
    private String weight;
    private String macro;
    private String group;
    private String actor;
    private String ref;

    public PersonAttributes getPerson() {
        return person;
    }

    public String getRole() {
        return role;
    }

    public String getComment() {
        return comment;
    }

    public String getWeight() {
        return weight;
    }

    public String getMacro() {
        return macro;
    }

    public String getGroup() {
        return group;
    }

    public String getActor() {
        return actor;
    }

    public String getRef() {
        return ref;
    }

    public void setPerson(PersonAttributes person) {
        this.person = person;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
