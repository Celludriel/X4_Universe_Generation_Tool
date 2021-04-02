package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.ArrayList;
import java.util.List;

public class People extends AbstractJson {

    private ValueType fillPercent;
    private List<Person> people = new ArrayList<>();
    private String ref;

    public ValueType getFillPercent() {
        return fillPercent;
    }

    public List<Person> getPeople() {
        return people;
    }

    public String getRef() {
        return ref;
    }

    public void setFillPercent(ValueType fillPercent) {
        this.fillPercent = fillPercent;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
