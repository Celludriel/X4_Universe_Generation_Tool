package be.celludriel.universegenerator.model.jobs;

import be.celludriel.universegenerator.model.AbstractJson;

public class JsonPilot extends AbstractJson {

    private JsonPage page;
    private String macro;

    public JsonPage getPage() {
        return page;
    }

    public String getMacro() {
        return macro;
    }

    public void setPage(JsonPage page) {
        this.page = page;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }
}
