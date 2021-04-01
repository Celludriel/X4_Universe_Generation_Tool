package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Inventory extends AbstractJson {

    private ValueType fillAmount;
    private ValueType fillValue;
    private Float chance;
    private String basket;
    private String list;
    private Boolean multiple;

    public ValueType getFillAmount() {
        return fillAmount;
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

    public void setFillAmount(ValueType fillAmount) {
        this.fillAmount = fillAmount;
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
}
