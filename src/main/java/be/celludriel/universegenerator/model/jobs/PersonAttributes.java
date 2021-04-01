package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

import java.util.List;

public class PersonAttributes extends AbstractJson {

    private String name;
    private Owner owner;
    private Page page;
    private List<Skill> skills;
    private Stock stock;
    private String clothing;

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public Page getPage() {
        return page;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Stock getStock() {
        return stock;
    }

    public String getClothing() {
        return clothing;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }
}
