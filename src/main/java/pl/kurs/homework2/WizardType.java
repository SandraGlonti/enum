package pl.kurs.homework2;

public enum WizardType {
    WIZARD_OF_FIRE("Mag ognia", new SpellType[]{SpellType.HEAL,SpellType.FIREBALL}),
    WIZARD_OF_WIND("Mag wiatru", new SpellType[]{SpellType.HEAL, SpellType.LIGHTING_STRIKE});

    private final String description;
    private final SpellType[] spells;

    WizardType(String description, SpellType[] spells) {
        this.description = description;
        this.spells = spells;
    }

    public String getDescription() {
        return description;
    }

    public SpellType[] getSpells() {
        return spells;
    }
}
