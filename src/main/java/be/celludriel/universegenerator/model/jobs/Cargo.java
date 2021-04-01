package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Cargo extends AbstractJson {

    private ValueType fillPercent;
    private ValueType fillValue;
    private Float chance;
    private String basket;
    private String list;
    private Boolean multiple;
    private Boolean onjobrespawn;

    public ValueType getFillPercent() {
        return fillPercent;
    }

    public ValueType getFillValue() {
        return fillValue;
    }

    public Float getChance() {
        return chance;
    }

    public String getBasket() {
        return basket;
    }

    public String getList() {
        return list;
    }

    public Boolean getMultiple() {
        return multiple;
    }

    public Boolean getOnjobrespawn() {
        return onjobrespawn;
    }

    public void setFillPercent(ValueType fillPercent) {
        this.fillPercent = fillPercent;
    }

    public void setFillValue(ValueType fillValue) {
        this.fillValue = fillValue;
    }

    public void setChance(Float chance) {
        this.chance = chance;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public void setOnjobrespawn(Boolean onjobrespawn) {
        this.onjobrespawn = onjobrespawn;
    }
}
