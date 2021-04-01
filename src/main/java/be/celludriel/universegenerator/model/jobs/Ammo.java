package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Ammo extends AbstractJson {

    private ValueType fillPercent;
    private ValueType fillAmount;
    private String ref;
    private ValueType value;

    public ValueType getFillPercent() {
        return fillPercent;
    }

    public ValueType getFillAmount() {
        return fillAmount;
    }

    public String getRef() {
        return ref;
    }

    public ValueType getValue() {
        return value;
    }

    public void setFillPercent(ValueType fillPercent) {
        this.fillPercent = fillPercent;
    }

    public void setFillAmount(ValueType fillAmount) {
        this.fillAmount = fillAmount;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }
}
