package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.List;

public class Owner extends AbstractJson {

    private List<Select> select;
    private String selection;
    private String overridenpc;
    private String comment;
    private ValueType value;

    public List<Select> getSelect() {
        return select;
    }

    public String getSelection() {
        return selection;
    }

    public String getOverridenpc() {
        return overridenpc;
    }

    public String getComment() {
        return comment;
    }

    public ValueType getValue() {
        return value;
    }

    public void setSelect(List<Select> select) {
        this.select = select;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public void setOverridenpc(String overridenpc) {
        this.overridenpc = overridenpc;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
