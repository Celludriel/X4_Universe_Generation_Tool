package be.celludriel.universegenerator.model;

public enum GateType {
    ACCELERATOR_01("props_gates_orb_accelerator_01_macro"),
    ACCELERATOR_02("props_gates_orb_accelerator_02_macro"),
    ANCIENT_GATE("props_gates_anc_gate_macro"),
    TERRAN_GATE("props_ter_gate_01_macro");

    private String macro;

    GateType(String macro) {
        this.macro = macro;
    }

    public String getMacro() {
        return macro;
    }
}
