package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class Basket extends AbstractJson {

    private String basket;
    private String comment;

    public Basket() {
    }

    public Basket(String basket, String comment) {
        this.basket = basket;
        this.comment = comment;
    }

    public String getBasket() {
        return basket;
    }

    public String getComment() {
        return comment;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
